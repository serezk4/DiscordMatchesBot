package com.serezka.bot.discord.manager;

import java.util.Date;

public class Match {
    private Date date;
    private final String name;
    private final Games game;

    public Match(Date date, String name, Games game) {
        this.date = date;
        this.name = name;
        this.game = game;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Games getGame() {
        return game;
    }
}
