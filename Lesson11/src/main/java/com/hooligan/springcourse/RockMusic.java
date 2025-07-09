package com.hooligan.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> rockList = List.of("rockSong1", "rockSong2", "rockSong3");


    @Override
    public String getSong() {
        Random random = new Random();
        return rockList.get(random.nextInt(rockList.size()));
    }
}
