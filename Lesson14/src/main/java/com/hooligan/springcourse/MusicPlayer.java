package com.hooligan.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    private List<Music> musicList;


    public MusicPlayer(List<Music> music) {
        this.musicList = music;

    }

    public void playMusic(){
        Random rnd = new Random();
        System.out.println(musicList.get(rnd.nextInt(musicList.size())).getSong());
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


}
