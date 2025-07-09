package com.hooligan.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalMusicList = List.of("classicalSong1", "classicalSong2", "classicalSong3");


    @Override
    public String getSong() {
        Random random = new Random();
        return classicalMusicList.get(random.nextInt(classicalMusicList.size()));
    }



}
