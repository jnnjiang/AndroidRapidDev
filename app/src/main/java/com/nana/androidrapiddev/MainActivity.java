package com.nana.androidrapiddev;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nana.tools.BitmapClip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        Fragment fragment = new Fragment();
//        fragmentTransaction.add(fragment,"no ui");
//        finishAndRemoveTask();
//        PorterDuffColorFilter
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundTintList(getResources().getColorStateList(R.color.colorPrimary));
            }
        });

//        button.setElevation(10f);
//        button.setTranslationZ(20f);

//        Button button1 = findViewById(R.id.button1);
//        Drawable drawable = button1.getBackground();
//        BitmapDrawable bd = (BitmapDrawable) drawable;
//        Bitmap bitmap = BitmapClip.fillet(BitmapClip.ALL,bd.getBitmap(),8);
//        button1.setBackground(new BitmapDrawable(getResources(),bitmap));
//        RippleDrawable
    }
}
