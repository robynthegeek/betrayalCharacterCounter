package com.robynandcory.betrayalcharactersheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mightLevel = 4;
    int sanityLevel = 4;
    int knowledgeLevel = 4;
    int speedLevel = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increments Might by 1 when might +1 is pressed
     */
    public void addOneMight(View v) {
        mightLevel = mightLevel + 1;
        displayMight(mightLevel);
    }

    /**
     * Decrements Might by 1 when might -1 is pressed, prevents user from going below score of zero, displays game over toast.
     */
    public void subtractOneMight(View v) {
        if (mightLevel < 2) {
            mightLevel = 0;
            displayMight(mightLevel);
            Toast.makeText(MainActivity.this, "Ouch. x_x your character has died", Toast.LENGTH_LONG).show();
        } else {
            mightLevel = mightLevel - 1;
            displayMight(mightLevel);
        }
    }

    /**
     * Displays Might
     */
    public void displayMight(int might) {
        TextView mightView = findViewById(R.id.might);
        mightView.setText(String.valueOf(might));
    }

    /**
     * Increments Sanity by 1 when sanity +1 is pressed
     */
    public void addOneSanity(View v) {
        sanityLevel = sanityLevel + 1;
        displaySanity(sanityLevel);
    }

    /**
     * Decrements Sanity by 1 when sanity -1 is pressed, prevents user from going below score of zero, displays game over toast.
     */
    public void subtractOneSanity(View v) {
        if (sanityLevel < 2) {
            sanityLevel = 0;
            displaySanity(sanityLevel);
            Toast.makeText(MainActivity.this, "Ouch. x_x your character has died", Toast.LENGTH_LONG).show();
        } else {
            sanityLevel = sanityLevel - 1;
            displaySanity(sanityLevel);
        }
    }

    /**
     * Displays Sanity
     */

    public void displaySanity(int sanity) {
        TextView sanityView = findViewById(R.id.sanity);
        sanityView.setText(String.valueOf(sanity));
    }

    /**
     * Increments Knowledge by 1 when knowledge +1 is pressed
     */
    public void addOneKnowledge(View v) {
        knowledgeLevel = knowledgeLevel + 1;
        displayKnowledge(knowledgeLevel);
    }

    /**
     * Decrements Knowledge by 1 when knowledge -1 is pressed, prevents user from going below score of zero, displays game over toast.
     */
    public void subtractOneKnowledge(View v) {
        if (knowledgeLevel < 2) {
            knowledgeLevel = 0;
            displayKnowledge(knowledgeLevel);
            Toast.makeText(MainActivity.this, "Ouch. x_x your character has died", Toast.LENGTH_LONG).show();
        } else {
            knowledgeLevel = knowledgeLevel - 1;
            displayKnowledge(knowledgeLevel);
        }
    }

    /**
     * Displays Knowledge
     */
    public void displayKnowledge(int knowledge) {
        TextView knowledgeView = findViewById(R.id.knowledge);
        knowledgeView.setText(String.valueOf(knowledge));
    }


    /**
     * Increments Speed by 1 when speed +1 is pressed
     */
    public void addOneSpeed(View v) {
        speedLevel = speedLevel + 1;
        displaySpeed(speedLevel);
    }

    /**
     * Decrements Speed by 1 when speed -1 is pressed, prevents user from going below score of zero, displays game over toast.
     */
    public void subtractOneSpeed(View v) {
        if (speedLevel < 2) {
            speedLevel = 0;
            displaySpeed(speedLevel);
            Toast.makeText(MainActivity.this, "Ouch. x_x your character has died", Toast.LENGTH_LONG).show();
        } else {
            speedLevel = speedLevel - 1;
            displaySpeed(speedLevel);
        }
    }

    /**
     * Displays Speed
     */
    public void displaySpeed(int speed) {
        TextView speedView = findViewById(R.id.speed);
        speedView.setText(String.valueOf(speed));
    }

    /**
     * Resets scores to default values
     */
    public void resetAll(View v) {
        mightLevel = 4;
        sanityLevel = 4;
        knowledgeLevel = 4;
        speedLevel = 4;
        displayMight(mightLevel);
        displaySanity(sanityLevel);
        displayKnowledge(knowledgeLevel);
        displaySpeed(speedLevel);
    }
}
