package com.thegrahamidentity.simplepictureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private PhotoCycler photoCycler;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(this);

        photoCycler = new PhotoCycler();
        imageView.setImageResource(photoCycler.next());
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

    private boolean switched = false;
    @Override
    public void onClick(View v) {
        Log.d(TAG, "Clicked!");
        if (!switched) {
            Log.d(TAG, "Switching images");
            ImageView img = (ImageView) v;
            img.setImageResource(photoCycler.next());
            Log.d(TAG, "Images should be switched");
        }
    }
}
