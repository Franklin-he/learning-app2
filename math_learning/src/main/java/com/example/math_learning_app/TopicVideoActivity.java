package com.example.math_learning_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class TopicVideoActivity extends Activity {

    Button sqliteButton;
    Button contProButton;
    Button contResButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_list);

        sqliteButton = findViewById(R.id.sqliteButton);
        contProButton = findViewById(R.id.contProButton);
        contResButton = findViewById(R.id.contResButton);

        //Create an on-clicked animation for the button
        final AlphaAnimation buttonClicked = new AlphaAnimation(1f, 0.7f);

        //Now we need to make an intent to move to the YouTube Activity through clicking the button
        sqliteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                view.startAnimation(buttonClicked);
                Intent intent = new Intent(view.getContext(), YouTubeActivity.class);

                //Sending the youtube_id for the topic to the YouTube Activity to play the required video
                intent.putExtra("youtube_id", "s0crCqmtO7U");
                //startActivity(intent);
            }
        });

        contProButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClicked);
                Intent intent = new Intent(view.getContext(), YouTubeActivity.class);

                //Sending the youtube_id for the topic to the YouTube Activity to play the required video
                intent.putExtra("youtube_id", "fwp57R3S6LU");
                //startActivity(intent);
            }
        });

        contResButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClicked);
                Intent intent = new Intent(view.getContext(), YouTubeActivity.class);

                //Sending the youtube_id for the topic to the YouTube Activity to play the required video
                intent.putExtra("youtube_id", "eNW1d8tiXmQ");
                //startActivity(intent);
            }
        });
    }

}
