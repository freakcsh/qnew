package com.freak.qnews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freak.qnews.R;

/**
 * Created by Administrator on 2017/12/13.
 */

public class RobotFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View robot=inflater.inflate(R.layout.robot_fragment,container,false);

        return robot;
    }
}
