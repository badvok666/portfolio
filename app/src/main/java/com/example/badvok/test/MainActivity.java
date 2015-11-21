package com.example.badvok.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnSpotifyStreamer, btnScoresApp, btnLibraryApp, btnBuildItBigger, btnXyzReader, btnMyOwnApp;
    String thisWillLaunch = "This button will launch my ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //     ButterKnife.bind(this);

        addUI();
        onClickListeners();


    }

    public void addUI(){
        btnSpotifyStreamer = (Button)findViewById(R.id.menu_button_1);
        btnScoresApp = (Button)findViewById(R.id.menu_button_2);
        btnLibraryApp = (Button)findViewById(R.id.menu_button_3);
        btnBuildItBigger = (Button)findViewById(R.id.menu_button_4);
        btnXyzReader = (Button)findViewById(R.id.menu_button_5);
        btnMyOwnApp = (Button)findViewById(R.id.menu_button_6);
    }

    public void onClickListeners(){

        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonToast(getString(R.string.menu_button_1)).show();
            }
        });

        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonToast(getString(R.string.menu_button_2)).show();
            }
        });

        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonToast(getString(R.string.menu_button_3)).show();
            }
        });

        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonToast(getString(R.string.menu_button_4)).show();
            }
        });

        btnXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonToast(getString(R.string.menu_button_5)).show();
            }
        });

        btnMyOwnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonToast(getString(R.string.menu_button_6)).show();
            }
        });

    }


    public Toast buttonToast(String btnName){
        return Toast.makeText(getApplicationContext(),thisWillLaunch + btnName,Toast.LENGTH_LONG);
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
