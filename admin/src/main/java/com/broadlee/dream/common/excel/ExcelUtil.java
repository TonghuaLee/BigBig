package com.broadlee.dream.common.excel;


import jxl.Sheet;
import jxl.Workbook;

import java.io.InputStream;

public class ExcelUtil {
    private static final String TAG="ExcelUtil";


    public static String getXlsData(InputStream file, int index) {

        try {
            if (file == null)
                return null;

            Workbook workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(index);

            int sheetNum = workbook.getNumberOfSheets();
            int sheetRows = sheet.getRows();
            int sheetColumns = sheet.getColumns();
            return sheet.getCell(0, 1).getContents();
        }catch (Exception e){
            return "解析excel文件错误："+e.toString();
        }
    }



}
