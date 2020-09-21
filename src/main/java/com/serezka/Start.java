package com.serezka;

import com.serezka.bot.discord.Discord;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Start {
    private static final Logger logger = LoggerFactory.getLogger(Start.class.getName());

    public static void main(String[] args) {
        BasicConfigurator.configure();
        new Start().run(args);
    }

    private void run(String[] args) {
        if (args.length == 1) {
            new Discord(args[0]).start();
        } else {
            logger.error("No one configure file in args!");
            System.exit(1);
        }
    }
}
