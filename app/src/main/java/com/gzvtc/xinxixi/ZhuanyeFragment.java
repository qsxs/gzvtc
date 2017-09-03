package com.gzvtc.xinxixi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ZhuanyeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragemnt_zhuanye, container, false);
        final View title1 = view.findViewById(R.id.tv_title1);
        final View body1 = view.findViewById(R.id.tv_body1);
        View title2 = view.findViewById(R.id.tv_title2);
        final View body2 = view.findViewById(R.id.tv_body2);
        View title3 = view.findViewById(R.id.tv_title3);
        final View body3 = view.findViewById(R.id.tv_body3);
        View title4 = view.findViewById(R.id.tv_title4);
        final View body4 = view.findViewById(R.id.tv_body4);
        View title5 = view.findViewById(R.id.tv_title5);
        final View body5 = view.findViewById(R.id.tv_body5);

        title1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body1.setVisibility(title1.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                body2.setVisibility(View.GONE);
                body3.setVisibility(View.GONE);
                body5.setVisibility(View.GONE);
                body5.setVisibility(View.GONE);
            }
        });
        title1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body1.setVisibility(body1.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                body2.setVisibility(View.GONE);
                body3.setVisibility(View.GONE);
                body4.setVisibility(View.GONE);
                body5.setVisibility(View.GONE);
            }
        });
        title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body2.setVisibility(body2.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                body1.setVisibility(View.GONE);
                body3.setVisibility(View.GONE);
                body5.setVisibility(View.GONE);
                body5.setVisibility(View.GONE);
            }
        });
        title3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body3.setVisibility(body3.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                body2.setVisibility(View.GONE);
                body1.setVisibility(View.GONE);
                body4.setVisibility(View.GONE);
                body5.setVisibility(View.GONE);
            }
        });
        title4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body4.setVisibility(body4.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                body2.setVisibility(View.GONE);
                body3.setVisibility(View.GONE);
                body1.setVisibility(View.GONE);
                body5.setVisibility(View.GONE);
            }
        });
        title5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                body5.setVisibility(body5.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
                body2.setVisibility(View.GONE);
                body3.setVisibility(View.GONE);
                body4.setVisibility(View.GONE);
                body1.setVisibility(View.GONE);
            }
        });

        return view;
    }
}
