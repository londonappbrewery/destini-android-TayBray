package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.londonappbrewery.destini.R.string.T1_Story;
import static com.londonappbrewery.destini.R.string.T2_Ans1;
import static com.londonappbrewery.destini.R.string.T2_Ans2;
import static com.londonappbrewery.destini.R.string.T2_Story;
import static com.londonappbrewery.destini.R.string.T3_Ans1;
import static com.londonappbrewery.destini.R.string.T3_Ans2;
import static com.londonappbrewery.destini.R.string.T3_Story;
import static com.londonappbrewery.destini.R.string.T4_End;
import static com.londonappbrewery.destini.R.string.T5_End;
import static com.londonappbrewery.destini.R.string.T6_End;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView storyText;
    public Button pathOne;
    public Button pathTwo;

    public int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final TextView storyText = (TextView) findViewById(R.id.storyTextView);
        final Button pathOne = (Button) findViewById(R.id.buttonTop);
        final Button pathTwo = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        pathOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {
                    storyText.setText(T3_Story);
                    pathOne.setText(T3_Ans1);
                    pathTwo.setText(T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    storyText.setText(T6_End);
                    pathOne.setVisibility(View.INVISIBLE);
                    pathTwo.setVisibility(View.INVISIBLE);
                } else if (mStoryIndex == 2){
                    storyText.setText(T3_Story);
                    pathOne.setText(T3_Ans1);
                    pathTwo.setText(T3_Ans2);
                    mStoryIndex = 3;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        pathTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    storyText.setText(T2_Story);
                    pathOne.setText(T2_Ans1);
                    pathTwo.setText(T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 3) {
                    storyText.setText(T5_End);
                    pathOne.setVisibility(View.INVISIBLE);
                    pathTwo.setVisibility(View.INVISIBLE);
                } else if (mStoryIndex == 2){
                    storyText.setText(T4_End);
                    pathOne.setVisibility(View.INVISIBLE);
                    pathTwo.setVisibility(View.INVISIBLE);
                }

            }
        });

    }
}
