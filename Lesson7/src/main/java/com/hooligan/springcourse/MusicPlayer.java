package com.hooligan.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<Music>();
    private String name;
    private int volume;


    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void playMusic(){
        music.forEach(m->{
            System.out.println(m.getSong());
        });
    }
}
