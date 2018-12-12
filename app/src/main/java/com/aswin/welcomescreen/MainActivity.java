package com.aswin.welcomescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView bgapp, clover;
    LinearLayout textsplash, texthome, menus,spl;
    Animation frombottom;Button bu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);


        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);
        spl = (LinearLayout) findViewById(R.id.spl);
        bu=(Button)findViewById(R.id.bu);
        menus.setAlpha(0);
        texthome.setAlpha(0);






//animation starts here

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menus.setAlpha(1);
                texthome.setAlpha(1);

                bgapp.animate().translationY(-1400).setDuration(800).setStartDelay(1000);
                clover.animate().alpha(0).setDuration(800).setStartDelay(1000);
                textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);
                spl.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);


                texthome.startAnimation(frombottom);
                menus.startAnimation(frombottom);
            }
        });



    }




    }

