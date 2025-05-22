package com.hooligan.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<String>();

    @Override
    public List<String> getSong() {
        songs.add("rock song 1");
        songs.add("rock song 2");
        songs.add("rock song 3");
        return songs;
    }
}
