package com.github.cschen1205.tensorflow.web.components;

import com.github.cschen1205.tensorflow.search.models.AudioSearchEngine;
import com.github.cschen1205.tensorflow.commons.FileUtils;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component
public class Loader implements ApplicationListener<ApplicationReadyEvent> {
    private static final Logger logger = LoggerFactory.getLogger(Loader.class);


    private ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));

    @Override public void onApplicationEvent(ApplicationReadyEvent e) {
        logger.info("Loader triggered at {}", e.getTimestamp());

        final ApplicationContext context = e.getApplicationContext();
        final AudioSearchEngine audioSearchEngine = context.getBean("audioSearchEngine", AudioSearchEngine.class);

        executorService.submit(() -> {
            if(!audioSearchEngine.loadIndexDbIfExists()) {
                audioSearchEngine.indexAll(FileUtils.getAudioFiles());
                audioSearchEngine.saveIndexDb();
            }
        });

    }





}