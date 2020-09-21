package com.serezka.bot.discord.manager;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MatchesManager {
    private static MatchesManager instance;

    private MatchesManager() {
        // ...
    }

    private Queue<Match> matchesQueue = new PriorityQueue<>();

    public static MatchesManager getInstance() {
        if (instance == null)
            instance = new MatchesManager();

        return instance;
    }

    public void addMatch(Match match) {
        matchesQueue.add(match);
    }

    public void removeMatch(Match match) {
        matchesQueue.remove(match);
    }

    public Match nextMatch() {
        return matchesQueue.poll();
    }
}
