package com.hooligan.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    private List<Music> music;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public void playMusic(){
        Random rand = new Random();
        System.out.println(music.get(rand.nextInt(music.size())).getSong());
    }

}
