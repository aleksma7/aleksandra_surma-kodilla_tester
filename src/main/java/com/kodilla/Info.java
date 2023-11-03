package com.kodilla.collections.adv.immutable.homework;

public class Info {
    protected String title;
    protected int duration;

    public Info(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
}
