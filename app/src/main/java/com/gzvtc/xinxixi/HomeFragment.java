package com.gzvtc.xinxixi;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment {
    ViewPager viewpage;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            removeMessages(66);
            if (viewpage != null) {
                int currentItem = viewpage.getCurrentItem();
                int i = currentItem + 1;
                if (i > 2) {
                    i = 0;
                }
                viewpage.setCurrentItem(i);
            }
            sendEmptyMessageDelayed(66, 1500);
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_home, container, false);
        viewpage = (ViewPager) view.findViewById(R.id.viewpage);
        viewpage.setOffscreenPageLimit(3);
        viewpage.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                if (position == 0) {
                    imageView.setImageResource(R.drawable.list_banner1);
                } else if (position == 1) {
                    imageView.setImageResource(R.drawable.list_banner2);
                } else {
                    imageView.setImageResource(R.drawable.list_banner3);
                }
                container.addView(imageView, 0);
                return imageView;
            }
        });

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        handler.sendEmptyMessageDelayed(66, 1500);
    }

    @Override
    public void onStop() {
        super.onStop();
        handler.removeMessages(66);
    }
}
