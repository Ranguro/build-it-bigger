package com.example;

import java.util.Random;

public class JokeSource {


    private String[] jokeArray;

    public JokeSource() {
        jokeArray = new String[]
                {"How many programmers does it take to change a light bulb? -None, it's a hardware problem",
                "Some people, when confronted with a problem, think, 'I know, I'll use threads' - and then two they hav erpoblesms.",
                "Knock knock. Who's there? -Java"};
    }

    public String getJoke(){
        Random random = new Random();
        return jokeArray[random.nextInt(jokeArray.length)];
    }

}
