package com.example.lsankey.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.spotifyStreamerButton) Button spotifyStreamerButton;
    @Bind(R.id.scoresAppButton) Button scoresAppButton;
    @Bind(R.id.libraryAppButton) Button libraryAppButton;
    @Bind(R.id.buildItBiggerButton) Button buildItBiggerButton;
    @Bind(R.id.xyzReaderButton) Button xyzReaderButton;
    @Bind(R.id.capstoneButton) Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.spotifyStreamerButton)
    public void toastSpotifyStreamer(View v) {
        Toast.makeText(this, R.string.toast_spotify_streamer, Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.scoresAppButton)
    public void toastScoresApp(View v) {
        Toast.makeText(this, R.string.toast_scores_app, Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.libraryAppButton)
    public void toastLibraryApp(View v) {
        Toast.makeText(this, R.string.toast_library_app, Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.buildItBiggerButton)
    public void toastBuildItBigger(View v) {
        Toast.makeText(this, R.string.toast_build_it_bigger, Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.xyzReaderButton)
    public void toastxyzReaderButton(View v) {
        Toast.makeText(this, R.string.toast_xyz_reader, Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.capstoneButton)
    public void toastCapstonebutton(View v) {
        Toast.makeText(this, R.string.toast_capstone_app, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
