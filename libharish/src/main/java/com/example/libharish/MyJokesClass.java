package com.example.libharish;

import java.util.Random;

public class MyJokesClass {
    public String jokes[] = {"They say curiosity killed the cat. This is false. Chuck Norris killed the cat. Every single one of them."
            , "Chuck Norris can believe it's not butter."
            ,"When Chuck Norris is in a crowded area, he doesn't walk around people. He walks through them."
            , "Chuck Norris never wet his bed as a child. The bed wet itself out of fear."
            ,"Chuck Norris knows everything there is to know - Except for the definition of mercy."};

    public String ChucknorrisJokes() {
        Random random = new Random();
        final int a = random.nextInt(jokes.length);
       String chuckjoke=jokes[a];
       return chuckjoke;
    }
}
