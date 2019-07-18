package com.navinfo.autoai.autoaidemol;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.navinfo.autoai.autoaidemol.mapper")
@EnableApolloConfig
public class AutoaiDemolApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoaiDemolApplication.class, args);
    }

}
