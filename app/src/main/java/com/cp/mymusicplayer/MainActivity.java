package com.cp.mymusicplayer;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout root;
    private Toolbar controlToolbar;
    private RadioGroup radioGroupControl;
    private RadioButton playList;
    private RadioButton toMusic;
    private RadioButton toLocalFiles;
    private RadioButton toSettings;
    private ViewPager2 fragmentPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        intToolbar();

    }

    private void intToolbar() {
        setSupportActionBar(controlToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void initView(){
        root = (ConstraintLayout) findViewById(R.id.root);
        controlToolbar = (Toolbar) findViewById(R.id.control_toolbar);
        radioGroupControl = (RadioGroup) findViewById(R.id.radio_group_control);
        playList = (RadioButton) findViewById(R.id.play_list);
        toMusic = (RadioButton) findViewById(R.id.to_music);
        toLocalFiles = (RadioButton) findViewById(R.id.to_local_files);
        toSettings = (RadioButton) findViewById(R.id.to_settings);
        fragmentPager = (ViewPager2) findViewById(R.id.fragment_paper);
    }
}