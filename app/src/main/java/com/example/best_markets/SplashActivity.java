package com.example.best_markets;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends Activity {

    Animation anim_FadeIn;
    Animation anim_ball;
    ConstraintLayout constraintLayout;
    ImageView market_jjang1;
    ImageView market_jjang2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        constraintLayout=findViewById(R.id.constraintLayout);
        market_jjang1 = findViewById(R.id.market_jjang1);
        market_jjang2 = findViewById(R.id.market_jjang2);

        anim_FadeIn = AnimationUtils.loadAnimation(this, R.anim.splash_fadeln);
        anim_ball = AnimationUtils.loadAnimation(this, R.anim.splash_fadeln);

        anim_FadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        market_jjang1.startAnimation(anim_FadeIn);
        market_jjang2.startAnimation(anim_ball);
    }
}

/*import androidx.constraintlayout.widget.ConstraintLayout;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends Activity {
    Animation anim_FadeIn;
    Animation anim_ball;
    ConstraintLayout constraintLayout;
    ImageView lcklockImageView;
    ImageView oImageView;
    ImageView faceRecgnitionImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        constraintLayout=findViewById(R.id.constraintLayout);
        lcklockImageView=findViewById(R.id.lock_lck);
        oImageView=findViewById(R.id.imageView);
        faceRecgnitionImageView=findViewById(R.id.faceReconition);


        anim_FadeIn=AnimationUtils.loadAnimation(this,R.anim.splash_fadeln);
        anim_ball=AnimationUtils.loadAnimation(this,R.anim.splash_ball);


        anim_FadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        lcklockImageView.startAnimation(anim_FadeIn);
        faceRecgnitionImageView.startAnimation(anim_FadeIn);
        oImageView.startAnimation(anim_ball);

    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);	//theme??? ??????????????? ????????????.

        moveMain(1);	//1??? ??? main activity ??? ?????????
    }

    private void moveMain(int sec) {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                //new Intent(?????? context, ????????? activity)
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);	//intent ??? ????????? ??????????????? ??????

                finish();	//?????? ???????????? ??????
            }
        }, 1000 * sec); // sec??? ?????? ???????????? ??? ??? ??????
    }


}
*/