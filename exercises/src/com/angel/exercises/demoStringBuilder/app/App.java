package com.angel.exercises.demoStringBuilder.app;

import com.angel.exercises.demoStringBuilder.entities.Coment;
import com.angel.exercises.demoStringBuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date now = Date.from(Instant.now());


        //Post 1
        String title = "Traveling New Zealand";
        String content = "I`m going to visit this wonderful country!";
        int likes = 12;

        Post post = new Post(sdf.parse("21/06/2018 13:05:44"), title, content, likes);
        post.addComent(new Coment("Have a nice trip"));
        post.addComent(new Coment("Wow that`s awesome!"));

        //Post 2
        String title2 = "Good night guys";
        String content2 = "See you tomorrow";
        int likes2 = 5;

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), title2, content2, likes2);
        post2.addComent(new Coment("Good night"));
        post2.addComent(new Coment("May the Force be with you"));

        System.out.println(post);
        System.out.println(post2);






    }
}
