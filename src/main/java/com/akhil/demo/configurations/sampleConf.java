package com.akhil.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sampleConf {

    @Bean("luckyNumber")
    Integer fun(){
        return 103;
    }

}
