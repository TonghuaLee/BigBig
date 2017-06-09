package com.broadlee.dream.common.config;


import com.broadlee.dream.domain.SystemConfig;

public interface SystemConfigService {

    String resolveProperty(String name);

    String resolveProperty(String name, String defaultValue);

    int resolveIntProperty(String name);

    int resolveIntProperty(String name, int defaultValue);

    boolean resolveBoolProperty(String name);

    boolean resolveBoolProperty(String name, boolean defaultValue);

    long resolveLongProperty(String name);

    long resolveLongProperty(String name, long defaultValue);

    boolean isValueValidForType(String value, SystemPropertyFieldType type);

    SystemConfig findById(Long id);

    void removeFromCache(SystemConfig systemProperty);

}
