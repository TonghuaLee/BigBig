package com.broadlee.dream.common.cms;

import com.broadlee.dream.domain.Asset;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface AssetStorageService {

    Map<String, String> getCacheFileModel(String fullUrl) throws Exception;

    void storeAssetFile(MultipartFile file, Asset staticAsset) throws IOException;

    void storeAssetFile(InputStream fileis, Asset staticAsset) throws IOException;

}
