//package com.navinfo.autoai.autoaidemol.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableApolloConfig
//public class AppConfig {
//    @Bean
//    public TestJavaConfigBean javaConfigBean() {
//        return new TestJavaConfigBean();
//    }
//}
//public class TestJavaConfigBean {
//    @Value("${timeout:100}")
//    private int timeout;
//    private int batch;
//
//    @Value("${batch:200}")
//    public void setBatch(int batch) {
//        this.batch = batch;
//    }
//
//    public int getTimeout() {
//        return timeout;
//    }
//
//    public int getBatch() {
//        return batch;
//    }
//}
