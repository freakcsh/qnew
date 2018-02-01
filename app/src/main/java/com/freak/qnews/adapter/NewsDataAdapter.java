package com.freak.qnews.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.freak.qnews.R;
import com.freak.qnews.bean.NewsDataBean;

/**
 * Created by Administrator on 2017/12/13.
 */

public class NewsDataAdapter extends BaseQuickAdapter<NewsDataBean.ResultBean.DataBean,BaseViewHolder>{
    public NewsDataAdapter() {
        super(R.layout.item_news_data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsDataBean.ResultBean.DataBean item) {
        helper.setText(R.id.tv_news_detail_title,item.getTitle());
        helper.setText(R.id.tv_news_detail_author_name,item.getAuthor_name());
        helper.setText(R.id.tv_news_detail_date,item.getDate());
        /**
         * 这是item点击事件
         */
        helper.addOnClickListener(R.id.ll_news_detail);
        Glide.with(mContext)
                .load(item.getThumbnail_pic_s())
                .placeholder(R.mipmap.ic_error)
                .error(R.mipmap.ic_error)
                .crossFade()
                .centerCrop()
                .into((ImageView) helper.getView(R.id.iv_news_detail_pic));
    }
}
