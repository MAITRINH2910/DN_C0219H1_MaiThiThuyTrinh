package com.codegym.cms;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//khởi tạo ứng dụng thay cho web.xml
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{com.codegym.cms.ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}