package com.hooligan.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") RockMusic rockMusic, @Qualifier("classicalMusic") ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(GenreMusic genreMusic) {


        switch (genreMusic) {
            case CLASSIC ->
                        System.out.println(classicalMusic.getSong().get(new Random().nextInt(classicalMusic.getSong().size())));
            case ROCK ->
                    System.out.println(rockMusic.getSong().get(new Random().nextInt(rockMusic.getSong().size())));
            default -> System.out.println("Invalid genre");
        }
    }
}
