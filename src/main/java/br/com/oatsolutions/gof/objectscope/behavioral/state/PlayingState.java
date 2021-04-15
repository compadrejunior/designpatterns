package br.com.oatsolutions.gof.objectscope.behavioral.state;

/**
 * File: PlayingState
 * Project: DesignPatterns
 * File Created: 14/04/2021 13:25
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class PlayingState implements State {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void clickPlay() {
        player.changeState(new ReadyState(player));
        System.out.println("Paused...");
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        System.out.println("Stopped playing");
    }

    @Override
    public void clickNext() {
        player.nextTrack();
    }

    @Override
    public void clickPrevious() {
        player.previousTrack();
    }
}
