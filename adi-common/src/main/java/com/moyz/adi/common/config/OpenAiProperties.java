package com.moyz.adi.common.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("openai")
@Data
public class OpenAiProperties {

    private boolean proxyEnable;

}
