package com.buffer.lorena.bot.config;

import com.buffer.lorena.bot.handler.EventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 * The type Lorena application listener.
 */
@Component
public class LorenaApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    /**
     * The Logger.
     */
    Logger logger = LogManager.getLogger(LorenaApplicationListener.class);
    /**
     * The Event handler.
     */
    @Autowired
    EventHandler eventHandler;

    /**
     * Instantiates a new Lorena application listener.
     *
     * @param eventHandler the event handler
     */
    public LorenaApplicationListener(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * On application event.
     *
     * @param event the event
     */
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("ITS ALIVE!");
    }
}
