package br.com.oatsolutions.gof.objectscope.behavioral.state;

/**
 * File: ReadyState
 * Project: DesignPatterns
 * File Created: 14/04/2021 12:35
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class ReadyState implements State {
    private Player player;

    public ReadyState(Player player) {
        this.player = player;
    }

    @Override
    public void clickPlay() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
        System.out.println("Locked");
    }

    @Override
    public void clickNext() {
        System.out.println("Locked");
    }

    @Override
    public void clickPrevious() {
        System.out.println("Locked");
    }
}
