package com.freak.qnews.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.freak.qnews.R;
import com.freak.qnews.bean.TodayOfHistoryBean;

/**
 * Created by Administrator on 2017/12/14.
 */

public class TodayDataAdapter extends BaseQuickAdapter<TodayOfHistoryBean.ResultBean, BaseViewHolder> {
    public TodayDataAdapter() {
        super(R.layout.item_today);
    }

    @Override
    protected void convert(BaseViewHolder helper, TodayOfHistoryBean.ResultBean item) {
        helper.setText(R.id.tv_today_title, item.getTitle());
        helper.setText(R.id.tv_today_date, item.getDate());
    }
}
