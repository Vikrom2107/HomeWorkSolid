package ru.netology;

import java.util.Map;

public class Purchase {
    protected String title;
    protected int count;


    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
