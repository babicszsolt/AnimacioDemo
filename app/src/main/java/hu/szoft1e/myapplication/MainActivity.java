package hu.szoft1e.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgKulker = findViewById(R.id.kulker);
        Button btnBlink=findViewById(R.id.btnBlink);

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation =
                        AnimationUtils.loadAnimation(MainActivity.this,R.animator.blink);
                imgKulker.startAnimation(animation);
            }
        });

        Button btnRotate= findViewById(R.id.btnRotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.animator.rotate);
                imgKulker.startAnimation(animation);
            }
        });

        imgKulker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.animator.rotate);
                imgKulker.startAnimation(animation);
            }
        });

        Button btnZoom = findViewById(R.id.btnZoom);
        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.animator.zoom);
                imgKulker.startAnimation(animation);
            }
        });

        Button btnMove= findViewById(R.id.btnMove);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.animator.move);
                imgKulker.startAnimation(animation);
            }
        });

        Button btnFade= findViewById(R.id.btnFade);
        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.animator.fade);
                imgKulker.startAnimation(animation);
            }
        });

        Button btnSlide= findViewById(R.id.btnSlide);
        btnSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.animator.slide);
                imgKulker.startAnimation(animation);
            }
        });

        Button btnStop= findViewById(R.id.btnStop);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgKulker.clearAnimation();
            }
        });
    }

}