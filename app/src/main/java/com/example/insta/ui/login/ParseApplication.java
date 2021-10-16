package com.example.insta.ui.login;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YVt7X6i7hJoU8hW06royqZUQjzLSAXVHgsA5UFms")
                .clientKey("vk5x7N3bura4xsAyjWAfOY3CjpNZq7mQL0ub7Haw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
