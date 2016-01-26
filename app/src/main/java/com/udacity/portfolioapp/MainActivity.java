package com.udacity.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button spotifyStreamer, scoreApp, libraryApp, buildIt, xyzReader, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Views with Ids
        spotifyStreamer = (Button) findViewById(R.id.spotifyStreamer);
        scoreApp = (Button) findViewById(R.id.scoresApp);
        libraryApp = (Button) findViewById(R.id.libraryApp);
        buildIt = (Button) findViewById(R.id.buildIt);
        xyzReader = (Button) findViewById(R.id.xyzReader);
        capstone = (Button) findViewById(R.id.capstone);

        //Attached onClickListener
        spotifyStreamer.setOnClickListener(this);
        scoreApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildIt.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        capstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.spotifyStreamer:

                Toast.makeText(this,"This button will launch my spotify streamer app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.scoresApp:
                Toast.makeText(this,"This button will launch my score app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.libraryApp:
                Toast.makeText(this,"This button will launch my library app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buildIt:
                Toast.makeText(this,"This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.xyzReader:
                Toast.makeText(this,"This button will launch my xyz reader app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone:
                Toast.makeText(this,"This button will launch my capstone app", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
