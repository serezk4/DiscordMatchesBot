package com.serezka.bot.discord.manager;

public enum Games {
    PUBG("PUBG"),
    CSGO("CS:GO"),
    AMONG_US("Among Us"),
    FALL_GUYS("Fall Guys"),
    GTA_5("Gta V"),
    SAMP("SAMP");

    private final String name;

    Games(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
