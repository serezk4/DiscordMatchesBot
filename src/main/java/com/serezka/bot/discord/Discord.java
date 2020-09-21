package com.serezka.bot.discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Discord extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(Discord.class.getName());

    private Properties properties;

    public Discord(String stringFile) {
        // load thread
        setName("Discord");

        // load bot
        Path propertiesFile;
        long start = System.currentTimeMillis();

        // get properties file
        logger.info("Trying to read properties file...");
        propertiesFile = Paths.get(stringFile);
        if (Files.notExists(propertiesFile)) {
            logger.error("File doesn't exists!");
            return;
        }


        // load properties
        logger.info("Loading properties...");
        properties = new Properties();
        try (InputStream in = Files.newInputStream(propertiesFile)) {
            properties.load(in);
        } catch (IOException e) {
            logger.error(e.getMessage());
            return;
        }

        if (properties.size() != DiscordProperties.values().length) {
            logger.error("lacks properties! list of actual properties:");
            for(DiscordProperties dsProperty : DiscordProperties.values())
                logger.info(dsProperty.getPropertyName());
            return;
        }

        logger.info("Loaded successfully! (" + (System.currentTimeMillis() - start) + "ms)");

    }

    @Override
    public void run() {
        // load jda
        try {
            logger.info("loading JDA");

            // create jda
            JDA jda = new JDABuilder(properties.getProperty(DiscordProperties.BOT_TOKEN.getPropertyName())).build();

            // create listeners
            //todo
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
