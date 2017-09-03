package com.gzvtc.xinxixi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.navigation_page1:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_page2:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_page3:
                    viewPager.setCurrentItem(3);
                    return true;
                case R.id.navigation_page4:
                    viewPager.setCurrentItem(4);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpage);
        List<Fragment> fs = new ArrayList<>();
        fs.add(new SchoolFragment());
        fs.add(new shizhiFragment());
        fs.add(new HomeFragment());
        fs.add(new ChengguoFragment());
        fs.add(new ZhuanyeFragment());
        viewPager.setAdapter(new FragmentViewPagerAdapter(getSupportFragmentManager(), fs));
        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                navigation.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

}
