package com.freak.qnews.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.freak.qnews.R;
import com.freak.qnews.activity.NewsDataShowActivity;
import com.freak.qnews.adapter.NewsDataAdapter;
import com.freak.qnews.bean.NewsDataBean;
import com.freak.qnews.net.QNewsCallBack;
import com.freak.qnews.net.QNewsClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/12/13.
 */

public class NewsDetailFragment extends BaseFragment {
    /**
     * 新闻类型
     */
    private String type;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.srl)
    SwipeRefreshLayout srl;
    Unbinder unbinder;
    private NewsDataAdapter newsDataAdapter;

    public NewsDetailFragment() {

    }

    public NewsDetailFragment(String type) {
        this.type = type;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View detail = inflater.inflate(R.layout.fragment_news_detail, container, false);
        unbinder = ButterKnife.bind(this, detail);
        newsDataAdapter = new NewsDataAdapter();
        newsDataAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        /***************************设置下拉刷新**********************************/
        /**
         * 设置圈圈颜色
         */
        srl.setColorSchemeColors(Color.BLUE, Color.BLUE);
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                upData();
            }
        });
        /**
         * 设置布局管理者
         */
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        /********************************  recyclerView初始化数据  ********************************/
        /**
         * 设置适配器adapter
         */
        recyclerView.setAdapter(newsDataAdapter);

        /**
         * 设置item点击事件
         */
        recyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
            @Override
            public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent=new Intent();
                intent.setClass(getActivity(), NewsDataShowActivity.class);
                intent.putExtra("url",newsDataAdapter.getItem(position).getUrl());
                startActivity(intent);
            }
        });
        return detail;
    }

    private void upData() {
        srl.setRefreshing(true);
        Log.i("type",type);
        QNewsClient.getInstance().getNewsData(type, new QNewsCallBack<NewsDataBean>() {
            @Override
            public void onSuccess(NewsDataBean response, int id) {
               Log.i("cai",response.getResult().getData().toString());
                newsDataAdapter.setNewData(response.getResult().getData());
                srl.setRefreshing(false);
            }

            @Override
            public void onError(Exception e, int id) {
                srl.setRefreshing(false);
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void fetchData() {
        upData();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
