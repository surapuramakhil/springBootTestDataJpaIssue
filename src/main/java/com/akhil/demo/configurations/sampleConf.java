package com.akhil.demo.configurations;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sampleConf {

    @Bean("luckyNumber")
    OkHttpClient okhttp(){
        return new OkHttpClient();
    }

}
