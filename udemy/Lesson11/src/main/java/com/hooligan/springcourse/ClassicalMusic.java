package com.hooligan.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<String>();

    private ClassicalMusic() {
    }

    @Override
    public List<String> getSong() {
        songs.add("classical song 1");
        songs.add("classical song 2");
        songs.add("classical song 3");
        return songs;
    }




}
