package com.example.calistoshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context = context;

    }

    public String[] slide_heading = {
             "Calisto",
            "How To Order",
            "How To Login"
    };

    public String[] slide_desc = {
            "Small Business. Big Heart.",
            "Masuk ke menu Order Here",
            "Username calisto"
    };

    public String[] slide_desc2 = {
            "",
            "Selamat berbelanja",
            "Password 123456"
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view,Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container,false);

        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(slide_desc [position]);

        slideDescription = (TextView) view.findViewById(R.id.slide_desc);
        slideDescription = (TextView) view.findViewById(R.id.slide_desc2);
        slideDescription.setText(slide_desc [position]);
        slideDescription.setText(slide_desc2 [position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);

    }
}
