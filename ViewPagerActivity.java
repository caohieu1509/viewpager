package com.example.caova.viewpager;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ViewPagerActivity extends AppCompatActivity {
    public int currentimageindex=0;
    ImageView slidingimage;

    private int[] IMAGE_IDS = {
            R.drawable.baogia,
            R.drawable.theodoi,
            R.drawable.tiepnhan,
            R.drawable.cuochen
    };

    ViewPager viewPager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager =findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter();
        viewPager.setAdapter(adapter);
    }
    private class ViewPagerAdapter extends PagerAdapter {
        int NumberOfPages = 4;

        @Override
        public int getCount() {
            return NumberOfPages;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }
        @Override
        public Object instantiateItem(View container, int position) {


            ImageView imageView = new ImageView(ViewPagerActivity.this);
            imageView.setImageResource(IMAGE_IDS[position]);


            ((ViewPager) container).addView(imageView, 0);
            return imageView;
        }
        @Override
        public void destroyItem(View container, int position, Object object) {
            ((ViewPager) container).removeView((View) object);
        }
    }
}
