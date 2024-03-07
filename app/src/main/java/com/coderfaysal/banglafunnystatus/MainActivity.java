package com.coderfaysal.banglafunnystatus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    LinearLayout loveSMS, happySMS, sadSMS, monePoraSMS, morningSMS, nightSMS, islamicSMS, friendSMS, eidSMS, newYearSMS, birthdaySMS, aboutMe, FBStatus02, FBStatus01;
    LinearLayout thanks;
    private static final String ONESIGNAL_APP_ID = "f544d6ad-f6b3-4711-98f0-25c22f67842e";
    Switch switch_dark_mode;
    boolean nightMODE;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_text_center);


        // Night Mode Apply Settings
        switch_dark_mode = findViewById(R.id.switch_dark_mode);

        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE);
        nightMODE = sharedPreferences.getBoolean("night", false);

        if (nightMODE){
            switch_dark_mode.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }

        switch_dark_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nightMODE){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", false);
                } else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", true);
                }
                editor.apply();
            }
        });


        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);


        loveSMS = findViewById(R.id.loveSMS);
        happySMS = findViewById(R.id.happySMS);
        sadSMS = findViewById(R.id.sadSMS);
        monePoraSMS = findViewById(R.id.monePoraSMS);
        morningSMS = findViewById(R.id.morningSMS);
        nightSMS = findViewById(R.id.nightSMS);
        islamicSMS = findViewById(R.id.islamicSMS);
        friendSMS = findViewById(R.id.friendSMS);
        eidSMS = findViewById(R.id.eidSMS);
        newYearSMS = findViewById(R.id.newYearSMS);
        birthdaySMS = findViewById(R.id.birthdaySMS);
        aboutMe = findViewById(R.id.aboutMe);
        FBStatus01 = findViewById(R.id.FBStatus01);
        FBStatus02 = findViewById(R.id.FBStatus02);

        thanks = findViewById(R.id.thanks);


        loveSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, LoveSMS.class));
        });

        happySMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, HappySMS.class));
        });

        sadSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, SadSMS.class));
        });

        monePoraSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, MonePoraSMS.class));
        });

        morningSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, MorningSMS.class));
        });

        nightSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, NightSMS.class));
        });

        islamicSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, IslamicSMS.class));
        });

        friendSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, FriendSMS.class));
        });

        eidSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, EidSMS.class));
        });

        newYearSMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, NewYearSMS.class));
        });

        birthdaySMS.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, BirthdaySMS.class));
        });

        aboutMe.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, AboutMe.class));
        });

        FBStatus01.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, FBStatus01.class));
        });

        FBStatus02.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, FBStatus02.class));
        });

        thanks.setOnClickListener(v->{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.coderfaysal.banglafunnystatus")));
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.share){
            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "share app");
                String shareMassage = "https://play.google.com/store/apps/details?id=com.coderfaysal.banglafunnystatus";
                intent.putExtra(Intent.EXTRA_TEXT, shareMassage);
                startActivity(Intent.createChooser(intent, "Share by"));
            } catch (Exception e) {
                Toast.makeText(MainActivity.this, "Error occurred", Toast.LENGTH_SHORT).show();
            }
        }
        if (item.getItemId() == R.id.rating){
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.coderfaysal.banglafunnystatus")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.coderfaysal.banglafunnystatus")));
            }
        }
        if (item.getItemId() == R.id.more_app){
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=5338546810958790262")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Innovative Programmer")));
            }
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.create();
        builder.setTitle("Love Bangla SMS");
        builder.setMessage("Do you want to Close this APP?");
        builder.setCancelable(false);
        builder.setPositiveButton(
                "Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }
        );
        builder.setNegativeButton(
                "No, Thanks",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }
        );
        builder.show();
    }



}