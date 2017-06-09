package com.broadlee.dream.common.file.supports;

import com.broadlee.dream.common.file.FileAppType;
import com.broadlee.dream.common.file.FileWorkArea;

import java.io.File;
import java.util.List;


/**
 * @author Chaven Peng
 */
public interface FileServiceProvider {
    
    File getResource(String url);

    File getResource(String url, FileAppType fileApplicationType);

    List<String> addOrUpdateResourcesForPaths(FileWorkArea workArea, List<File> files, boolean removeFilesFromWorkArea);
    
    boolean removeResource(String name);
    
}
