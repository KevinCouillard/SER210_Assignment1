/**
 * StartActivity hanles the starting screen with the rules/name and intent to GameActivity from button
 * @author kCouillard
 * @date 2/4/21
 */
package com.hfad.assignment1_part2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends Activity {
    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //called when the user clicks the button and sets the player name in GameActivity
    public void onClick(View view) {
        name = getString(R.string.PlayerName);
        EditText PlayerName = (EditText) findViewById(R.id.PlayerName);
        name = PlayerName.getText().toString();
        Intent intent = new Intent(StartActivity.this, GameActivity.class);
        startActivity(intent);

    }
}