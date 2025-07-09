package com.hooligan.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan("com.hooligan.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusicBean(){
        return new ClassicalMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer (musicList());
    }

    @Bean
    public RockMusic rockMusicBean(){
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList(){
        return List.of(classicalMusicBean(),rockMusicBean());
    }

}
