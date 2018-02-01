package com.freak.qnews.net;

import com.freak.qnews.bean.JokeBean;
import com.freak.qnews.bean.NewsDataBean;
import com.freak.qnews.bean.TodayOfHistoryBean;
import com.freak.qnews.bean.TodayOfHistoryDetailBean;
import com.freak.qnews.commoms.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Call;

/**
 * Created by Administrator on 2017/12/13.
 */

public class QNewsClient {
    private QNewsCallBack mQNewsCallBack;
    private static QNewsClient mQNewsClient;
    private Gson mGson;

    public QNewsClient() {
        mGson = new Gson();
    }

    /**
     * 单例模式
     *
     * @return
     */
    public static QNewsClient getInstance() {
        if (mQNewsClient == null) {
            synchronized (QNewsClient.class) {
                if (mQNewsClient == null) {
                    mQNewsClient = new QNewsClient();
                }
            }
        }
        return mQNewsClient;
    }

    /**
     * 根据相应的新闻类型获取新闻数据
     *
     * @param type     新闻的类型
     * @param callBack 新闻的回调接口
     */
    public void getNewsData(String type, QNewsCallBack callBack) {
        mQNewsCallBack = callBack;
        OkHttpUtils.post()
                .url(Constants.NEWS_DATA_URL)
                .addParams("type", type)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        mQNewsCallBack.onError(e, id);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        NewsDataBean newsDataBean = mGson.fromJson(response, NewsDataBean.class);
                        mQNewsCallBack.onSuccess(newsDataBean, id);
                    }
                });
    }

    /**
     * 根据用户输入的消息进行回答
     * @param info     用户输入的消息
     * @param callBack 回调的接口
     */
    public void GetQARobotData(String info, QNewsCallBack callBack) {
        mQNewsCallBack = callBack;
        OkHttpUtils.post()
                .url(Constants.Q_A_ROBOT_URL)
                .addParams("info", info)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        mQNewsCallBack.onError(e, id);
                    }

                    @Override
                    public void onResponse(String response, int id) {

                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONObject result = jsonObject.getJSONObject("result");
                            String text = result.getString("text");
                            mQNewsCallBack.onSuccess(text, id);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

    /**
     * 根据年月，获取 历史上的今天 的概述
     * @param month         查询的c月
     * @param day           查询的日
     * @param callback      查询回调的接口
     */
    public void GetTodayOfHistoryData(int month, int day, QNewsCallBack callback){
        mQNewsCallBack = callback;

        String params = month + "/" + day;

        OkHttpUtils.post()
                .url(Constants.TODAY_OF_HISTORY_URP)
                .addParams("date", params)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        mQNewsCallBack.onError(e,id);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        TodayOfHistoryBean todayOfHistoryBean = mGson.fromJson(response, TodayOfHistoryBean.class);
                        mQNewsCallBack.onSuccess(todayOfHistoryBean, id);
                    }
                });
    }

    /**
     * 根据上一个方法成功查询后回调结果中的e_id，获取详细数据
     * @param e_id          上一个方法成功查询后回调结果中的e_id
     * @param callback      查询回调的接口
     */
    public void GetTodayOfHistoryDetailData(String e_id, QNewsCallBack callback){

        mQNewsCallBack = callback;

        OkHttpUtils.post()
                .url(Constants.TODAY_OF_HISTORY_DETAIL_URL)
                .addParams("e_id", e_id)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        mQNewsCallBack.onError(e,id);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        TodayOfHistoryDetailBean bean = mGson.fromJson(response, TodayOfHistoryDetailBean.class);
                        mQNewsCallBack.onSuccess(bean, id);
                    }
                });
    }


    /**
     * 获取实时段子
     * @param page          显示页数
     * @param pageSize      一页显示的数量
     * @param callback      查询回调的接口
     */
    public void GetNowJokeData(int page, int pageSize, QNewsCallBack callback){

        mQNewsCallBack = callback;

        OkHttpUtils.post()
                .url(Constants.JOKE_URL)
                .addParams("page", page+"")
                .addParams("pageSize", pageSize+"")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        mQNewsCallBack.onError(e,id);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        JokeBean bean = mGson.fromJson(response, JokeBean.class);
                        mQNewsCallBack.onSuccess(bean, id);
                    }
                });
    }

    /**
     * 根据指定时间，获取之前的段子数据
     * @param time
     * @param callback
     */
    public void GetNowJokeData(String time, QNewsCallBack callback){

        mQNewsCallBack = callback;

        OkHttpUtils.post()
                .url(Constants.JOKE_DESC_URL)
                .addParams("time", time)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        mQNewsCallBack.onError(e, id);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        JokeBean bean = mGson.fromJson(response, JokeBean.class);
                        mQNewsCallBack.onSuccess(bean, id);
                    }
                });
    }


}
