package com.serezka.bot.discord;

public enum DiscordProperties {
    BOT_TOKEN("token"),
    COMMANDS_PREFIX("prefix");

    private String propertyName;

    DiscordProperties(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
