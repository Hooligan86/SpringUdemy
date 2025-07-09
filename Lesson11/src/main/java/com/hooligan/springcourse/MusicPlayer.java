package com.hooligan.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music, @Qualifier("classicalMusic" ) Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public void playMusic(GenreMusic genre){
        if(genre == GenreMusic.ROCK){
            System.out.println(music.getSong());
        }else{
            System.out.println(music2.getSong());
        }
    }
}
