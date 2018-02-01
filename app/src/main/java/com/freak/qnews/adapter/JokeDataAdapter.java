package com.freak.qnews.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.freak.qnews.R;
import com.freak.qnews.bean.JokeBean;

/**
 * Created by Administrator on 2017/12/13.
 */

public class JokeDataAdapter extends BaseQuickAdapter<JokeBean.ResultBean.DataBean, BaseViewHolder> {


    public JokeDataAdapter() {
        super(R.layout.item_jokes);
    }

    @Override
    protected void convert(BaseViewHolder helper, JokeBean.ResultBean.DataBean item) {
        helper.setText(R.id.joke_contents, item.getContent());
        helper.setText(R.id.joke_dates,item.getUpdatetime());
    }
}
