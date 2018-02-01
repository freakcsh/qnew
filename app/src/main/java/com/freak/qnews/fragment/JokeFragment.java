package com.freak.qnews.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.freak.qnews.R;
import com.freak.qnews.adapter.JokeDataAdapter;
import com.freak.qnews.bean.JokeBean;
import com.freak.qnews.net.QNewsCallBack;
import com.freak.qnews.net.QNewsClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/12/13.
 */

public class JokeFragment extends Fragment {
    @BindView(R.id.joke_toolbar)
    Toolbar jokeToolbar;
    @BindView(R.id.joke_recycler)
    RecyclerView jokeRecycler;
    @BindView(R.id.joke_srl)
    SwipeRefreshLayout jokeSrl;
    Unbinder unbinder;
    private JokeDataAdapter jokeDataAdapter;


    /**
     * 当前数量
     */
    private int mCurrentCounter;
    /**
     * 总的数量
     */
    private int mTotalCounter = 5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View joke = inflater.inflate(R.layout.joke_fragment, container, false);
        unbinder = ButterKnife.bind(this, joke);
        jokeDataAdapter = new JokeDataAdapter();
        jokeDataAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);

        jokeSrl.setColorSchemeColors(Color.BLUE, Color.BLUE);
        jokeSrl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                upDateData();
            }
        });


        jokeRecycler.setAdapter(jokeDataAdapter);

        jokeRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        jokeDataAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            /**
             * 加载更多监听
             */
            @Override
            public void onLoadMoreRequested() {
                jokeRecycler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (mCurrentCounter >= mTotalCounter) {
                            /**
                             * 数据加载完成
                             */
                            jokeDataAdapter.loadMoreEnd();
                        } else {
                            if (jokeDataAdapter.getItem(0) == null) {
                                return;
                            }
                            int unixTime = jokeDataAdapter.getItem(jokeDataAdapter.getItemCount() - 2).getUnixtime();
                            QNewsClient.getInstance().GetNowJokeData(unixTime + "", new QNewsCallBack<JokeBean>() {
                                @Override
                                public void onSuccess(JokeBean response, int id) {
                                    List<JokeBean.ResultBean.DataBean> data = response.getResult().getData();
                                    jokeDataAdapter.addData(data);
                                    mCurrentCounter = mTotalCounter;
                                    mTotalCounter += 5;
                                    jokeDataAdapter.loadMoreComplete();
                                }

                                @Override
                                public void onError(Exception e, int id) {
                                    jokeDataAdapter.loadMoreFail();
                                }
                            });
                        }
                    }
                }, 1000);

            }
        });
        upDateData();
        return joke;
    }

    private void upDateData() {
        jokeSrl.setRefreshing(true);
        QNewsClient.getInstance().GetNowJokeData(1, 8, new QNewsCallBack<JokeBean>() {
            @Override
            public void onSuccess(JokeBean response, int id) {
                jokeDataAdapter.setNewData(response.getResult().getData());
                jokeSrl.setRefreshing(false);
            }

            @Override
            public void onError(Exception e, int id) {
                jokeSrl.setRefreshing(false);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
