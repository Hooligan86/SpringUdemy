package com.hooligan.springcourse;

import java.util.List;

public class MusicPlayer {

    private List<Music> listMusic;

    private String name;

    private int volume;

    public MusicPlayer() {
    }

    public List<Music> getMusic() {
        return listMusic;
    }

    public void setMusic(List<Music> music) {
        this.listMusic = music;
    }

    public void playMusic(){
        for (Music music : listMusic) {
            System.out.println(music.getSong());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
