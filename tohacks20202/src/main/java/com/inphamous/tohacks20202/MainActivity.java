package com.inphamous.tohacks20202;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends Activity {

    Button buttonRandomize;
    TextView randomActivity;
    public List<String> activities;
    public Random r;

    // For debugging
    private static final String TAG = "TOHacks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomActivity = (TextView) findViewById(R.id.activityText);
        buttonRandomize = (Button) findViewById(R.id.randomizeButton);
        activities = new ArrayList<>();
        r = new Random();

        setActivities();

        randomActivity.setText("Click for an activity!");
        buttonRandomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomActivity.setText(activities.get(r.nextInt(activities.size())));
            }
        });
    }

    public void setActivities() {
        // Testing
        activities.add("Learn a new dance");
        activities.add("Meditate");
        activities.add("Watch a movie");
        activities.add("Learn how to knit");
        activities.add("Plant a garden");
        activities.add("Learn a new language (duolingo!)");
        activities.add("Paint or draw");
        activities.add("Paint your nails");
        activities.add("Do a hair mask");
        activities.add("Read a book");
        activities.add("Take a 15 minute walk");
        activities.add("Play a board game");
        activities.add("Start a new programming project");
        activities.add("Start a new workout routine");
        activities.add("Do some yoga");
        activities.add("Bake some bread");
        activities.add("Learn how to code");
        activities.add("Do a free online course from harvard");
        activities.add("Organize your room");
        activities.add("Try some origami");
        activities.add("Finish a puzzle");
        activities.add("Have a Netflix party with the Google Chrome extension");
        activities.add("Bake a cake with the ingredients you have at home");
        activities.add("Learn how to play an instrument");
        activities.add("Write a song");
        activities.add("Learn calligraphy on Youtube");
        activities.add("Video chat with friends");
        activities.add("Work on financial planning");
        activities.add("Have an indoor scavenger hunt");
        activities.add("Make a tiktok");
        activities.add("Make a list of places you want to go after quarantine");
        activities.add("Deep clean your house");
        activities.add("Plan a vacation (for after quarantine)");
        activities.add("Improve you typing speed");
        activities.add("Start a quarantine diary");
        activities.add("Update your resume");
        activities.add("Have a photoshoot");
        activities.add("Make a vision board");
        activities.add("Listen to a podcast");
        activities.add("Write a letter to your future self");
        activities.add("Make a playlist");
        activities.add("Clean up your phone");
        activities.add("Redecorate a room");

    }


}
