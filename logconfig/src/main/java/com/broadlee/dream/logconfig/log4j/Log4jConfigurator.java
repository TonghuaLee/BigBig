package com.broadlee.dream.logconfig.log4j;


import com.broadlee.dream.logconfig.LogConfigurator;

import java.net.URL;
import java.util.Map;
import java.util.Properties;

public class Log4jConfigurator extends LogConfigurator {
    @Override
    protected void doConfigure(URL configFile, Map<String, String> propsMap) {
        Properties props = new Properties();
        props.putAll(propsMap);

        DOMConfigurator.configure(configFile, props);
    }

    @Override
    public void shutdown() {
    }
}
