package com.freak.qnews.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.freak.qnews.R;
import com.freak.qnews.adapter.TodayDataAdapter;
import com.freak.qnews.bean.TodayOfHistoryBean;
import com.freak.qnews.net.QNewsCallBack;
import com.freak.qnews.net.QNewsClient;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/12/13.
 */

public class TodayFragment extends Fragment {
    @BindView(R.id.today_toolbar)
    Toolbar todayToolbar;
    @BindView(R.id.today_recycler_view)
    RecyclerView todayRecyclerView;
    @BindView(R.id.today_srl)
    SwipeRefreshLayout todaySrl;
    Unbinder unbinder;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    private TodayDataAdapter todayDataAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View today = inflater.inflate(R.layout.today_fragment, container, false);
        unbinder = ButterKnife.bind(this, today);
        todayDataAdapter = new TodayDataAdapter();
        todayDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);

        todaySrl.setColorSchemeColors(Color.BLUE, Color.RED);
        todaySrl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                upDataDate();
            }
        });

        todayRecyclerView.setAdapter(todayDataAdapter);
        todayRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (todayRecyclerView!=null){
                    todayRecyclerView.scrollToPosition(0);
                }
            }
        });
        upDataDate();
        return today;
    }

    private void upDataDate() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        todaySrl.setRefreshing(true);
        QNewsClient.getInstance().GetTodayOfHistoryData(month, day, new QNewsCallBack<TodayOfHistoryBean>() {
            @Override
            public void onSuccess(TodayOfHistoryBean response, int id) {
                todayDataAdapter.setNewData(response.getResult());
                todaySrl.setRefreshing(false);
            }

            @Override
            public void onError(Exception e, int id) {
                todaySrl.setRefreshing(false);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
