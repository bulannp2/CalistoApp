package com.example.calistoshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotsLayouts;

    private SliderAdapter sliderAdapter;
    private Button mFinishbtn;

    private int mCurrentPage;

    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFinish = (Button) findViewById(R.id.finishBtn);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(getApplicationContext(), ActivityLogin.class);
                startActivity(intent);
            }
        });


        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotsLayouts = (LinearLayout) findViewById(R.id.dotsLayout);

        mFinishbtn = (Button) findViewById(R.id.finishBtn);

        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);

        ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                mCurrentPage = i;
                if (i == 0) {
                    mFinishbtn.setEnabled(true);
                    mFinishbtn.setVisibility(View.VISIBLE);

                    mFinishbtn.setText("Next");
                } else {
                    mFinishbtn.setEnabled(true);
                    mFinishbtn.setVisibility(View.VISIBLE);

                    mFinishbtn.setText("Finish");
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };
    }
}