package com.hooligan.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music;

    public MusicPlayer(@Qualifier("classicalMusic") Music music) {
        this.music = music;

    }

    public void playMusic(){
        System.out.println(music.getSong());
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


}
