package com.serezka;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Start {
    private static final Logger logger = LoggerFactory.getLogger(Start.class.getName());

    public static void main(String[] args) {
        BasicConfigurator.configure();
        new Start().run();
    }

    private void run() {
        logger.warn("rw");
    }
}
