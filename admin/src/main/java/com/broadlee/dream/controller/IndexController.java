package com.broadlee.dream.controller;

import com.broadlee.dream.common.cms.AssetService;
import com.broadlee.dream.common.cms.AssetStorageService;
import com.broadlee.dream.common.excel.ExcelUtil;
import com.broadlee.dream.common.json.JsonResponse;
import com.broadlee.dream.domain.Asset;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Author wenzhiquan
 * Created on 16/4/12 下午12:25
 * File name: IndexController.java
 * Description: null
 */

@Controller
public class IndexController {
    private static Logger logger = Logger.getLogger("IndexController");

    @Resource(name = "assetStorageService")
    protected AssetStorageService ass;

    @Resource(name = "assetService")
    protected AssetService assetService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/upload")
    public String upload() {
        return "upload";
    }
    @RequestMapping("/feedback")
    public String feedback() {
        return "feedback";
    }
    @RequestMapping("/help")
    public String help() {
        return "help";
    }
    @RequestMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }


    @RequestMapping(value = "/uploadTest", method = RequestMethod.POST)
    public void updateTest(HttpServletRequest request, @RequestParam(name = "file", required = false) MultipartFile file,
                           HttpServletResponse resp) {

        if (file != null) {
            Map<String, String> properties = new HashMap<>();
            properties.put("module", "goods");
            properties.put("resourceId", RandomStringUtils.randomNumeric(6));

            Asset asset = assetService.createAssetFromFile(file, properties);
            if (asset == null) {
                new JsonResponse(resp)
                        .with("error", "服务器内部错误")
                        .done();
            }

            try {
                ass.storeAssetFile(file, asset);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        try {
            resp.getWriter().print(file.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new JsonResponse(resp).with("status", "200").with("data", "ok").done();
    }


    @RequestMapping(value = "/uploadExcel", method = RequestMethod.POST)
    public void uploadExcel(HttpServletRequest request, @RequestParam(name = "file", required = false) MultipartFile file,
                            HttpServletResponse resp) {
        try {
            if (file != null) {
                if (file.getOriginalFilename().endsWith("xls") || file.getOriginalFilename().endsWith("xlsx")) {
                    Map<String, String> properties = new HashMap<>();
                    properties.put("module", "goods");
                    properties.put("resourceId", RandomStringUtils.randomNumeric(6));

                    Asset asset = assetService.createAssetFromFile(file, properties);
                    if (asset == null) {
                        new JsonResponse(resp)
                                .with("error", "服务器内部错误")
                                .done();
                    }

                    ass.storeAssetFile(file, asset);
                    String data = ExcelUtil.getXlsData(file.getInputStream(), 0);
                    new JsonResponse(resp).with("status", "200").with("data", data).done();
                } else {
                    new JsonResponse(resp)
                            .with("error", "文件格式错误")
                            .done();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        new JsonResponse(resp).with("status", "200").with("data", "ok").done();
    }

}