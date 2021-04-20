package br.com.oatsolutions.gof.objectscope.behavioral.state;

import java.util.ArrayList;
import java.util.List;

/**
 * File: Player
 * Project: DesignPatterns
 * File Created: 14/04/2021 12:22
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class Player {
    private State state;
    private boolean playing = false;
    private int volume = 0;
    private final List<Song> playlist = new ArrayList<>();
    private int currentTrack;

    public Player() {
        this.state = new ReadyState(this);
        this.volume = 50;
    }

    public void addSong(Song song) {
        this.playlist.add(song);
    }

    public void removeSong(Song song) {
        this.playlist.remove(song);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }

    public void startPlayback() {
        if (playlist.size() == 0 ) {
            System.out.println("ERROR: Empty playlist...");
            this.playing = false;
        } else {
            this.playing = true;
            displayCurrentTrack();
        }
    }

    private void displayCurrentTrack() {
        System.out.println("Track " + (currentTrack+1) + " of " + this.playlist.size());
        if (currentTrack >= 0 ) {
            System.out.println(
                    "Now playing: " + this.playlist.get(currentTrack).getName() +
                            " from " + this.playlist.get(currentTrack).getArtist()
            );
        } else {
            System.out.println(
                    "Invalid current track."
            );
        }
    }

    public void displayVolume() {
        System.out.println("Volume = " + volume);
    }

    public void clickVolumeUp(){
        this.volume++;
        displayVolume();
    }

    public void clickVolumeDown(){
        this.volume--;
        displayVolume();
    }


    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return this.playing;
    }

    public void nextTrack() {
        this.currentTrack++;
        if (this.currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        displayCurrentTrack();
    }

    public void previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        displayCurrentTrack();
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

    public Song getCurrentSong() {
        return this.playlist.get(currentTrack);
    }

    public List<Song> getPlaylist() {
        return this.playlist;
    }
}
