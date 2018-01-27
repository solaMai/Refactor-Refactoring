package com.refactor.mini_project;

class Movie {

    static final int CHILDREN = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;

    private String title;
    private int type;

    Movie(String title, int type) {
        this.title = title;
        this.type = type;
    }

    int getType() {
        return type;
    }

    String getTitle() {
        return title;
    }

}

