package com.github.cschen1205.tensorflow.web.configs;

import com.github.cschen1205.tensorflow.search.models.AudioSearchEngine;
import com.github.cschen1205.tensorflow.search.models.AudioSearchEngineImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public AudioSearchEngine audioSearchEngine() {
        return new AudioSearchEngineImpl();
    }


}
