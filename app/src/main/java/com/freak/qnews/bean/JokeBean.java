package com.freak.qnews.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/13.
 */

public class JokeBean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"单纯的大块头男生，第一次吃火龙果，吃了一宿才吃完一个，这是为什么呢？ 因为， 他吐籽\u2026\u2026 ","hashId":"c92b8a70d1bc5914685e5340d8334db8","unixtime":1513077060,"updatetime":"2017-12-12 19:11:00"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 单纯的大块头男生，第一次吃火龙果，吃了一宿才吃完一个，这是为什么呢？ 因为， 他吐籽……
             * hashId : c92b8a70d1bc5914685e5340d8334db8
             * unixtime : 1513077060
             * updatetime : 2017-12-12 19:11:00
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
