package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //REgister your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WNcFx7J4Rgr1fj5zDWMu5qJffkKGyrTMTGQXK9dw")
                .clientKey("x76zdQxvADZ9BUXflwJMuRBuIe7lm04smorVKLbb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
