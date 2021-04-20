package br.com.oatsolutions.gof.objectscope.behavioral.state;

/**
 * File: LockedState
 * Project: DesignPatterns
 * File Created: 14/04/2021 13:12
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class LockedState implements State {
    private final Player player;

    public LockedState(Player player) {
        this.player = player;
        player.setPlaying(false);
    }

    @Override
    public void clickPlay() {
        player.changeState(new ReadyState(player));
        System.out.println("Ready");
    }

    @Override
    public void clickLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            System.out.println("Stopped playing!");
        } else {
            System.out.println("Player is locked!");
        }
    }

    @Override
    public void clickNext() {
        System.out.println("Locked!");
    }

    @Override
    public void clickPrevious() {
        System.out.println("Locked!");
    }
}
