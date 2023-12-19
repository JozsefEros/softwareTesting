package com.cactus.testing.config;

import com.cactus.testing.helper.WebDriverFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cactus.testing")
public class TestConfig {

    @Bean(destroyMethod = "tearDown")
    WebDriverFactory webDriverFactory() {
        return new WebDriverFactory();
    }

}
