package com.eva.cn.helper.utils;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.util.Properties;

/**
 * Create By ZhangSenWei on 2018/11/22
 **/
public class FileProperties extends Properties {
    public FileProperties(String path){
        try{
            Resource resource = new DefaultResourceLoader().getResource(path);
            load(resource.getInputStream());
        }catch (Exception e){
            System.err.println("Exception in FileProperties(String): " + e.toString() + " for filename=" + path);
        }
    }

    public FileProperties(Properties properties){
        super(properties);
    }

}
