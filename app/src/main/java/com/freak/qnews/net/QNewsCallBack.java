package com.freak.qnews.net;

/**
 * Created by Administrator on 2017/12/13.
 */

/**
 * 新闻数据回调接口
 *
 * @param <T>
 */
public interface QNewsCallBack<T> {
    /**
     * 数据回调成功
     *
     * @param response 成功回调的结果
     * @param id       成功码
     */
    void onSuccess(T response, int id);

    /**
     * 数据回调失败
     *
     * @param e  失败是回调异常
     * @param id 失败码
     */
    void onError(Exception e, int id);
}
