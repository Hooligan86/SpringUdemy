package com.hooligan.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public void doMyInit(){
        System.out.println("doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("doing my destroy" );
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }


}
