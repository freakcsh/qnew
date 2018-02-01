package com.freak.qnews.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/13.
 */

public class NewsDataBean {

    @Override
    public String toString() {
        return "NewsDataBean{" +
                "result=" + result +
                '}';
    }
    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"37be34cd5d215cd5c9c4b8f586e6984a","title":"\u201c中国铁路心脏\u201d，可以通往全国所有省会城市，你知道是哪里吗？","date":"2017-12-13 17:32","category":"头条","author_name":"飞飞生活","url":"http://mini.eastday.com/mobile/171213173253008.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_2_mwpm_03200403.jpg"},{"uniquekey":"10979a3e7ab9d90c9aa8ac32d99d5350","title":"无证上岗？美军2艘\"撞船\"军舰训练证书过期2年多","date":"2017-12-13 18:00","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213180059704.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213180059_c00dfcc398fbe69a400d2b33a1c804c2_1_mwpm_03200403.jpg"},{"uniquekey":"2944169cbef0181c8ebf00fe44083672","title":"为什么手机电量低于20%就要提醒充电？原来真相竟是这样！","date":"2017-12-13 17:28","category":"头条","author_name":"荣耀官方旗舰店","url":"http://mini.eastday.com/mobile/171213172802392.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213172802_9c8bdab1b7dd887f878c978d1b24816d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213172802_9c8bdab1b7dd887f878c978d1b24816d_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213172802_9c8bdab1b7dd887f878c978d1b24816d_3_mwpm_03200403.jpg"},{"uniquekey":"82ca7d7593342ecc6e15376192965b4d","title":"帮巴铁研发五代机？抢走中国几十亿订单：如今啥话都没了","date":"2017-12-13 17:15","category":"头条","author_name":"鹰眼图说军事","url":"http://mini.eastday.com/mobile/171213171502790.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171213/20171213_b2ba87b1fb0de05aec51a30d28da4a2a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171213/20171213_6d6a36da4838b744dfbb7c4788deb596_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171213/20171213_c8b4fd54d4a80584dc422541b8a98418_cover_mwpm_03200403.jpg"},{"uniquekey":"e892b1c5b8220b13fd14c71f71e7f5ec","title":"从西班牙杰出青年企业家到中西友好交流的使者 \u2014\u2014访西班牙-中国\u201c一带一路\u201d促进会执行会长向静","date":"2017-12-13 17:11","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171213171109440.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171213/20171213171109_19db618677f1ef5f2828aa13009f788b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171213/20171213171109_8fbb1507f7cc274842c198f3c983f78e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171213/20171213171109_5c4b4389837e55208a0d1b9278dc82d9_1_mwpm_03200403.jpg"},{"uniquekey":"841e015788e9ddd6ef1169e6353e6848","title":"韩国总统文在寅夫妇访华 第一夫人兴致勃勃拉二胡","date":"2017-12-13 17:10","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213171001827.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213171001_1d5fa3d3c3f43b9f96c839ba038f3292_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171213/20171213171001_1d5fa3d3c3f43b9f96c839ba038f3292_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171213/20171213171001_1d5fa3d3c3f43b9f96c839ba038f3292_3_mwpm_03200403.jpg"},{"uniquekey":"b8820894481dcb055081153120702c20","title":"南京大屠杀80周年，台湾\u201c集体失忆\u201d了吗？","date":"2017-12-13 17:09","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/171213170908822.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171213/20171213170908_68716437e8ac25e6b576f6ab273207a6_1_mwpm_03200403.jpg"},{"uniquekey":"2dd975ca65013e9393e406d428ea8a76","title":"图片故事：\u201c熊猫人\u201d韦华坚守深山 选择不一样的青春","date":"2017-12-13 17:06","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171213170624872.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171213/20171213170624_a816be88a39a9e5a8ee6e4c87032c33e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171213/20171213170624_c2120d861f35076ccf1c7b97ac427a44_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171213/20171213170624_a0772a39f794310b6b8c9ed4d0533293_2_mwpm_03200403.jpg"},{"uniquekey":"749437ba32b6d3a3a5a546c093363210","title":"该国买中国武器后翻脸称不能用：对华要赔偿自己却偷偷用","date":"2017-12-13 17:05","category":"头条","author_name":"鹰眼图说军事","url":"http://mini.eastday.com/mobile/171213170506397.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171213/20171213_fb29861c0ddc93b05bb9e8b700d1ee51_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171213/20171213_1292312652940a50517572e86445367b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171213/20171213_4238737dd7c63b7f05ef3fa8535bf37c_cover_mwpm_03200403.jpg"},{"uniquekey":"97b59b4804d3b5785c9c794cd9c1e7a6","title":"11月份上海居民消费价格（CPI）同比上升1.2%","date":"2017-12-13 17:00","category":"头条","author_name":"新民网","url":"http://mini.eastday.com/mobile/171213170058172.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171213/20171213170058_a483adc8eda855090147abf3e1644e79_1_mwpm_03200403.jpg"},{"uniquekey":"26276a0dc613c0e2be2f789f832ceb62","title":"刚刚，美国突然答应不设前提对朝谈判，只是\u2026\u2026","date":"2017-12-13 16:57","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/171213165745608.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171213/20171213_377d03197938d9662a06793f46c2d856_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171213/20171213_4d80a02915f65ebcc354e0a42943cef0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171213/20171213_5b1a14ab9f3637c9b55583f5f61f6350_cover_mwpm_03200403.jpg"},{"uniquekey":"8504f3c28adb287cc0592e14bdd1305e","title":"检方依法批准逮捕携程亲子园虐童案五名犯罪嫌疑人","date":"2017-12-13 16:45","category":"头条","author_name":"上海长宁人民检察院","url":"http://mini.eastday.com/mobile/171213164532545.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213164532_22c6ea178f466bb5b89eb10cf0c887d0_1_mwpm_03200403.jpg"},{"uniquekey":"acb0668fd67436e1cd0bf93587a83e4f","title":"杨幂深夜发文爆出婚姻状况，他有机会娶杨幂了？","date":"2017-12-13 16:32","category":"头条","author_name":"八百电影","url":"http://mini.eastday.com/mobile/171213163252945.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213_889ecb3444013fe679d179cefaeec3ac_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171213/20171213_81f45d4c331564e096d7a636647d8045_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171213/20171213_8417183a83a8880ef5ef9bb48e1cd8d2_cover_mwpm_03200403.jpg"},{"uniquekey":"d7e947eb40c00c020e2dfdce3b55e019","title":"印尼菜市场里各种稀奇古怪的食物，连摊主都叫不出名字，你认识么","date":"2017-12-13 16:32","category":"头条","author_name":"我是栗子","url":"http://mini.eastday.com/mobile/171213163217634.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171213/20171213163217_3e52ad03c135ec57657cf7292543d5c1_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171213/20171213163217_3e52ad03c135ec57657cf7292543d5c1_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171213/20171213163217_3e52ad03c135ec57657cf7292543d5c1_1_mwpm_03200403.jpg"},{"uniquekey":"d1c1b80c7cd8c6c61bc5acd1a6d9b7f9","title":"继续炒作水问题？印官员：上游中国的建筑活动弄脏下游印度的水","date":"2017-12-13 16:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213162913699.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171213/20171213162913_b48f4d57b98a9d4739e5f309bd7a9c4f_1_mwpm_03200403.jpg"},{"uniquekey":"57a50a5ca6fdbe98a78aa99f57fc3146","title":"第一次去农村，吃到了这几道菜，我再也不想回家了！","date":"2017-12-13 16:25","category":"头条","author_name":"薛媛的厨房","url":"http://mini.eastday.com/mobile/171213162518330.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171213/20171213162518_6839b46c48b33043bfeb237014f363d5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171213/20171213162518_6839b46c48b33043bfeb237014f363d5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171213/20171213162518_6839b46c48b33043bfeb237014f363d5_3_mwpm_03200403.jpg"},{"uniquekey":"969ca490d0ec1011f1b2326a08f531ed","title":"这些生肖的终生寿命，后半生大富大贵，接福龙！","date":"2017-12-13 16:21","category":"头条","author_name":"生肖晓生","url":"http://mini.eastday.com/mobile/171213162111916.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171213/20171213162111_5a35686b67dcce8fddec987025047c90_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171213/20171213162111_5a35686b67dcce8fddec987025047c90_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171213/20171213162111_5a35686b67dcce8fddec987025047c90_2_mwpm_03200403.jpg"},{"uniquekey":"78d4e865b1051d15cee86701fec88826","title":"美国准备与朝鲜对话？青瓦台：蒂勒森不代表美官方立场","date":"2017-12-13 16:19","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213161903910.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171213/20171213161903_6c4153aa401fd2bb271041bc44666fcc_1_mwpm_03200403.jpg"},{"uniquekey":"e02a1d455ce04b0662dad7bfb2c3c6da","title":"小伙每天在河边捡垃圾，一个月后却发现惊喜，感动身边无数人","date":"2017-12-13 16:16","category":"头条","author_name":"看天下社会奇闻","url":"http://mini.eastday.com/mobile/171213161645197.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171213/20171213_7108eb8e639e715670a2794bc93b12b3_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171213/20171213_d511653c9f66fa80c56f5d23c503d81c_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20171213/20171213_e1c86b213fe7b1a4f34c57b9788d9329_cover_mwpm_03200403.jpg"},{"uniquekey":"eda7c70911bc32a646990681c7851b41","title":"文在寅谈南京大屠杀：中国受的苦 韩国人感同身受","date":"2017-12-13 16:13","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/171213161344556.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171213/20171213161344_0d06f1c8ff1c3d5eefe195b5ebeb4f3d_1_mwpm_03200403.jpg"},{"uniquekey":"5bf7b1a1940cbd72b12abc573c62b7a6","title":"驻日美军机零件再次坠落校园 居民愤怒要求美军撤离","date":"2017-12-13 16:08","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213160852290.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213160852_e02c8708f33c81e0946abbd16fd6b959_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213160852_e02c8708f33c81e0946abbd16fd6b959_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213160852_e02c8708f33c81e0946abbd16fd6b959_2_mwpm_03200403.jpg"},{"uniquekey":"df6d4ee5923aa2f97cec5f7ed29ad907","title":"王志敏：保护\u201c非遗\u201d 在传承中与时俱进","date":"2017-12-13 16:06","category":"头条","author_name":"：凤凰房产长沙站 ","url":"http://mini.eastday.com/mobile/171213160624629.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171213/20171213160624_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171213/20171213160624_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"391798cc2feee64430c62ee85c7bb054","title":"医院抢救危重病患亲属不签字 最高法明确责任界定","date":"2017-12-13 15:58","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/171213155810555.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213155810_3d1decba60233b769377bbc90756386b_1_mwpm_03200403.jpg"},{"uniquekey":"a83bdfb9675bb3ce7c23141bf83dcbcf","title":"此国因出言不逊得罪中国，一怒之下直接把它打成中国一个省","date":"2017-12-13 15:54","category":"头条","author_name":"猛禽","url":"http://mini.eastday.com/mobile/171213155442114.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171213/20171213_01c728bc269672a7f777b972347d66bf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171213/20171213_4d9de3e69768e48c4ff582862700dd65_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171213/20171213_d2986d7b95ca5ff09c86baff1e41c111_cover_mwpm_03200403.jpg"},{"uniquekey":"9dddb1bb9e1a5d20a30208b2dec632fd","title":"男子路边洞内抓蛇，手刚伸进去就传来一阵刺痛，接着就起了大水泡","date":"2017-12-13 15:53","category":"头条","author_name":"娱樂乐翻天","url":"http://mini.eastday.com/mobile/171213155317990.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213_485c5ff72a0ecca454424156d85cd557_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213_50e2e94befc7b9465747356852433070_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213_331ec1a6742c31451c70557c273acabe_cover_mwpm_03200403.jpg"},{"uniquekey":"310324f0603ede220bce92ee0e226071","title":"中俄\u201c合作-2017\u201d联合反恐演训圆满结束","date":"2017-12-13 15:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213154829916.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171213/20171213154829_ed6a0acaf21af879312e1499fed180d1_1_mwpm_03200403.jpg"},{"uniquekey":"c99b28eac68cdd0350ef792f900e10af","title":"四家券商精准预测2017年A股走势 2018年十大金股新鲜出炉（附股）","date":"2017-12-13 15:46","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171213154628129.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213154628_600b2327a2472344ced932360f82eaef_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171213/20171213154628_600b2327a2472344ced932360f82eaef_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171213/20171213154628_600b2327a2472344ced932360f82eaef_3_mwpm_03200403.jpg"},{"uniquekey":"aa90e2d6399ff8a265fc426afde2c20c","title":"各地举行国家公祭日纪念活动","date":"2017-12-13 15:30","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/171213153014628.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213153014_edf053f5c942b48292663ac4d9082dcc_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213153014_7f1934c6ca22ead3eef5ee60a4a092d4_2_mwpm_03200403.jpg"},{"uniquekey":"c4bb04ef45e31157f94a30c534446524","title":"这3大生肖，注定大器晚成，中年后一年比一年富有，后福无穷！","date":"2017-12-13 15:25","category":"头条","author_name":"星座大萌子","url":"http://mini.eastday.com/mobile/171213152551374.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213152551_f7e077fb9ff6cab1d322ed8900d11caa_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213152551_f7e077fb9ff6cab1d322ed8900d11caa_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213152551_f7e077fb9ff6cab1d322ed8900d11caa_2_mwpm_03200403.jpg"},{"uniquekey":"e71ba40e99a589486d100ca7bf7a3f8d","title":"男子听见田间有响声，走近一看，竟发现一条大蜈蚣和一条蛇在打架","date":"2017-12-13 15:24","category":"头条","author_name":"爱上奇闻趣事","url":"http://mini.eastday.com/mobile/171213152438603.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171213/20171213_ab8c2159b0a5bcfda3db8bcf71a95f60_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171213/20171213_6a7fe9e0d9092fd0423a04d8b4ded1a5_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171213/20171213_fc190f1c09b7647a78df3fde7ec5fbfa_cover_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

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

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        @Override
        public String toString() {
            return "ResultBean{" +
                    "data=" + data +
                    '}';
        }
        /**
         * stat : 1
         * data : [{"uniquekey":"37be34cd5d215cd5c9c4b8f586e6984a","title":"\u201c中国铁路心脏\u201d，可以通往全国所有省会城市，你知道是哪里吗？","date":"2017-12-13 17:32","category":"头条","author_name":"飞飞生活","url":"http://mini.eastday.com/mobile/171213173253008.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_2_mwpm_03200403.jpg"},{"uniquekey":"10979a3e7ab9d90c9aa8ac32d99d5350","title":"无证上岗？美军2艘\"撞船\"军舰训练证书过期2年多","date":"2017-12-13 18:00","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213180059704.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213180059_c00dfcc398fbe69a400d2b33a1c804c2_1_mwpm_03200403.jpg"},{"uniquekey":"2944169cbef0181c8ebf00fe44083672","title":"为什么手机电量低于20%就要提醒充电？原来真相竟是这样！","date":"2017-12-13 17:28","category":"头条","author_name":"荣耀官方旗舰店","url":"http://mini.eastday.com/mobile/171213172802392.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213172802_9c8bdab1b7dd887f878c978d1b24816d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213172802_9c8bdab1b7dd887f878c978d1b24816d_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213172802_9c8bdab1b7dd887f878c978d1b24816d_3_mwpm_03200403.jpg"},{"uniquekey":"82ca7d7593342ecc6e15376192965b4d","title":"帮巴铁研发五代机？抢走中国几十亿订单：如今啥话都没了","date":"2017-12-13 17:15","category":"头条","author_name":"鹰眼图说军事","url":"http://mini.eastday.com/mobile/171213171502790.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171213/20171213_b2ba87b1fb0de05aec51a30d28da4a2a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171213/20171213_6d6a36da4838b744dfbb7c4788deb596_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171213/20171213_c8b4fd54d4a80584dc422541b8a98418_cover_mwpm_03200403.jpg"},{"uniquekey":"e892b1c5b8220b13fd14c71f71e7f5ec","title":"从西班牙杰出青年企业家到中西友好交流的使者 \u2014\u2014访西班牙-中国\u201c一带一路\u201d促进会执行会长向静","date":"2017-12-13 17:11","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171213171109440.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171213/20171213171109_19db618677f1ef5f2828aa13009f788b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171213/20171213171109_8fbb1507f7cc274842c198f3c983f78e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171213/20171213171109_5c4b4389837e55208a0d1b9278dc82d9_1_mwpm_03200403.jpg"},{"uniquekey":"841e015788e9ddd6ef1169e6353e6848","title":"韩国总统文在寅夫妇访华 第一夫人兴致勃勃拉二胡","date":"2017-12-13 17:10","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213171001827.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213171001_1d5fa3d3c3f43b9f96c839ba038f3292_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171213/20171213171001_1d5fa3d3c3f43b9f96c839ba038f3292_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171213/20171213171001_1d5fa3d3c3f43b9f96c839ba038f3292_3_mwpm_03200403.jpg"},{"uniquekey":"b8820894481dcb055081153120702c20","title":"南京大屠杀80周年，台湾\u201c集体失忆\u201d了吗？","date":"2017-12-13 17:09","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/171213170908822.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171213/20171213170908_68716437e8ac25e6b576f6ab273207a6_1_mwpm_03200403.jpg"},{"uniquekey":"2dd975ca65013e9393e406d428ea8a76","title":"图片故事：\u201c熊猫人\u201d韦华坚守深山 选择不一样的青春","date":"2017-12-13 17:06","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/171213170624872.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171213/20171213170624_a816be88a39a9e5a8ee6e4c87032c33e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171213/20171213170624_c2120d861f35076ccf1c7b97ac427a44_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171213/20171213170624_a0772a39f794310b6b8c9ed4d0533293_2_mwpm_03200403.jpg"},{"uniquekey":"749437ba32b6d3a3a5a546c093363210","title":"该国买中国武器后翻脸称不能用：对华要赔偿自己却偷偷用","date":"2017-12-13 17:05","category":"头条","author_name":"鹰眼图说军事","url":"http://mini.eastday.com/mobile/171213170506397.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171213/20171213_fb29861c0ddc93b05bb9e8b700d1ee51_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171213/20171213_1292312652940a50517572e86445367b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171213/20171213_4238737dd7c63b7f05ef3fa8535bf37c_cover_mwpm_03200403.jpg"},{"uniquekey":"97b59b4804d3b5785c9c794cd9c1e7a6","title":"11月份上海居民消费价格（CPI）同比上升1.2%","date":"2017-12-13 17:00","category":"头条","author_name":"新民网","url":"http://mini.eastday.com/mobile/171213170058172.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171213/20171213170058_a483adc8eda855090147abf3e1644e79_1_mwpm_03200403.jpg"},{"uniquekey":"26276a0dc613c0e2be2f789f832ceb62","title":"刚刚，美国突然答应不设前提对朝谈判，只是\u2026\u2026","date":"2017-12-13 16:57","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/171213165745608.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171213/20171213_377d03197938d9662a06793f46c2d856_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171213/20171213_4d80a02915f65ebcc354e0a42943cef0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171213/20171213_5b1a14ab9f3637c9b55583f5f61f6350_cover_mwpm_03200403.jpg"},{"uniquekey":"8504f3c28adb287cc0592e14bdd1305e","title":"检方依法批准逮捕携程亲子园虐童案五名犯罪嫌疑人","date":"2017-12-13 16:45","category":"头条","author_name":"上海长宁人民检察院","url":"http://mini.eastday.com/mobile/171213164532545.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213164532_22c6ea178f466bb5b89eb10cf0c887d0_1_mwpm_03200403.jpg"},{"uniquekey":"acb0668fd67436e1cd0bf93587a83e4f","title":"杨幂深夜发文爆出婚姻状况，他有机会娶杨幂了？","date":"2017-12-13 16:32","category":"头条","author_name":"八百电影","url":"http://mini.eastday.com/mobile/171213163252945.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213_889ecb3444013fe679d179cefaeec3ac_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171213/20171213_81f45d4c331564e096d7a636647d8045_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171213/20171213_8417183a83a8880ef5ef9bb48e1cd8d2_cover_mwpm_03200403.jpg"},{"uniquekey":"d7e947eb40c00c020e2dfdce3b55e019","title":"印尼菜市场里各种稀奇古怪的食物，连摊主都叫不出名字，你认识么","date":"2017-12-13 16:32","category":"头条","author_name":"我是栗子","url":"http://mini.eastday.com/mobile/171213163217634.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171213/20171213163217_3e52ad03c135ec57657cf7292543d5c1_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171213/20171213163217_3e52ad03c135ec57657cf7292543d5c1_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171213/20171213163217_3e52ad03c135ec57657cf7292543d5c1_1_mwpm_03200403.jpg"},{"uniquekey":"d1c1b80c7cd8c6c61bc5acd1a6d9b7f9","title":"继续炒作水问题？印官员：上游中国的建筑活动弄脏下游印度的水","date":"2017-12-13 16:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213162913699.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171213/20171213162913_b48f4d57b98a9d4739e5f309bd7a9c4f_1_mwpm_03200403.jpg"},{"uniquekey":"57a50a5ca6fdbe98a78aa99f57fc3146","title":"第一次去农村，吃到了这几道菜，我再也不想回家了！","date":"2017-12-13 16:25","category":"头条","author_name":"薛媛的厨房","url":"http://mini.eastday.com/mobile/171213162518330.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171213/20171213162518_6839b46c48b33043bfeb237014f363d5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171213/20171213162518_6839b46c48b33043bfeb237014f363d5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171213/20171213162518_6839b46c48b33043bfeb237014f363d5_3_mwpm_03200403.jpg"},{"uniquekey":"969ca490d0ec1011f1b2326a08f531ed","title":"这些生肖的终生寿命，后半生大富大贵，接福龙！","date":"2017-12-13 16:21","category":"头条","author_name":"生肖晓生","url":"http://mini.eastday.com/mobile/171213162111916.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171213/20171213162111_5a35686b67dcce8fddec987025047c90_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171213/20171213162111_5a35686b67dcce8fddec987025047c90_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171213/20171213162111_5a35686b67dcce8fddec987025047c90_2_mwpm_03200403.jpg"},{"uniquekey":"78d4e865b1051d15cee86701fec88826","title":"美国准备与朝鲜对话？青瓦台：蒂勒森不代表美官方立场","date":"2017-12-13 16:19","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213161903910.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171213/20171213161903_6c4153aa401fd2bb271041bc44666fcc_1_mwpm_03200403.jpg"},{"uniquekey":"e02a1d455ce04b0662dad7bfb2c3c6da","title":"小伙每天在河边捡垃圾，一个月后却发现惊喜，感动身边无数人","date":"2017-12-13 16:16","category":"头条","author_name":"看天下社会奇闻","url":"http://mini.eastday.com/mobile/171213161645197.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171213/20171213_7108eb8e639e715670a2794bc93b12b3_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171213/20171213_d511653c9f66fa80c56f5d23c503d81c_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20171213/20171213_e1c86b213fe7b1a4f34c57b9788d9329_cover_mwpm_03200403.jpg"},{"uniquekey":"eda7c70911bc32a646990681c7851b41","title":"文在寅谈南京大屠杀：中国受的苦 韩国人感同身受","date":"2017-12-13 16:13","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/171213161344556.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171213/20171213161344_0d06f1c8ff1c3d5eefe195b5ebeb4f3d_1_mwpm_03200403.jpg"},{"uniquekey":"5bf7b1a1940cbd72b12abc573c62b7a6","title":"驻日美军机零件再次坠落校园 居民愤怒要求美军撤离","date":"2017-12-13 16:08","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213160852290.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213160852_e02c8708f33c81e0946abbd16fd6b959_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213160852_e02c8708f33c81e0946abbd16fd6b959_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213160852_e02c8708f33c81e0946abbd16fd6b959_2_mwpm_03200403.jpg"},{"uniquekey":"df6d4ee5923aa2f97cec5f7ed29ad907","title":"王志敏：保护\u201c非遗\u201d 在传承中与时俱进","date":"2017-12-13 16:06","category":"头条","author_name":"：凤凰房产长沙站 ","url":"http://mini.eastday.com/mobile/171213160624629.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171213/20171213160624_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171213/20171213160624_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"391798cc2feee64430c62ee85c7bb054","title":"医院抢救危重病患亲属不签字 最高法明确责任界定","date":"2017-12-13 15:58","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/171213155810555.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213155810_3d1decba60233b769377bbc90756386b_1_mwpm_03200403.jpg"},{"uniquekey":"a83bdfb9675bb3ce7c23141bf83dcbcf","title":"此国因出言不逊得罪中国，一怒之下直接把它打成中国一个省","date":"2017-12-13 15:54","category":"头条","author_name":"猛禽","url":"http://mini.eastday.com/mobile/171213155442114.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171213/20171213_01c728bc269672a7f777b972347d66bf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171213/20171213_4d9de3e69768e48c4ff582862700dd65_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171213/20171213_d2986d7b95ca5ff09c86baff1e41c111_cover_mwpm_03200403.jpg"},{"uniquekey":"9dddb1bb9e1a5d20a30208b2dec632fd","title":"男子路边洞内抓蛇，手刚伸进去就传来一阵刺痛，接着就起了大水泡","date":"2017-12-13 15:53","category":"头条","author_name":"娱樂乐翻天","url":"http://mini.eastday.com/mobile/171213155317990.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213_485c5ff72a0ecca454424156d85cd557_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213_50e2e94befc7b9465747356852433070_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213_331ec1a6742c31451c70557c273acabe_cover_mwpm_03200403.jpg"},{"uniquekey":"310324f0603ede220bce92ee0e226071","title":"中俄\u201c合作-2017\u201d联合反恐演训圆满结束","date":"2017-12-13 15:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/171213154829916.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171213/20171213154829_ed6a0acaf21af879312e1499fed180d1_1_mwpm_03200403.jpg"},{"uniquekey":"c99b28eac68cdd0350ef792f900e10af","title":"四家券商精准预测2017年A股走势 2018年十大金股新鲜出炉（附股）","date":"2017-12-13 15:46","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171213154628129.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171213/20171213154628_600b2327a2472344ced932360f82eaef_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171213/20171213154628_600b2327a2472344ced932360f82eaef_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171213/20171213154628_600b2327a2472344ced932360f82eaef_3_mwpm_03200403.jpg"},{"uniquekey":"aa90e2d6399ff8a265fc426afde2c20c","title":"各地举行国家公祭日纪念活动","date":"2017-12-13 15:30","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/171213153014628.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213153014_edf053f5c942b48292663ac4d9082dcc_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213153014_7f1934c6ca22ead3eef5ee60a4a092d4_2_mwpm_03200403.jpg"},{"uniquekey":"c4bb04ef45e31157f94a30c534446524","title":"这3大生肖，注定大器晚成，中年后一年比一年富有，后福无穷！","date":"2017-12-13 15:25","category":"头条","author_name":"星座大萌子","url":"http://mini.eastday.com/mobile/171213152551374.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171213/20171213152551_f7e077fb9ff6cab1d322ed8900d11caa_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171213/20171213152551_f7e077fb9ff6cab1d322ed8900d11caa_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171213/20171213152551_f7e077fb9ff6cab1d322ed8900d11caa_2_mwpm_03200403.jpg"},{"uniquekey":"e71ba40e99a589486d100ca7bf7a3f8d","title":"男子听见田间有响声，走近一看，竟发现一条大蜈蚣和一条蛇在打架","date":"2017-12-13 15:24","category":"头条","author_name":"爱上奇闻趣事","url":"http://mini.eastday.com/mobile/171213152438603.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171213/20171213_ab8c2159b0a5bcfda3db8bcf71a95f60_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171213/20171213_6a7fe9e0d9092fd0423a04d8b4ded1a5_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171213/20171213_fc190f1c09b7647a78df3fde7ec5fbfa_cover_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 37be34cd5d215cd5c9c4b8f586e6984a
             * title : “中国铁路心脏”，可以通往全国所有省会城市，你知道是哪里吗？
             * date : 2017-12-13 17:32
             * category : 头条
             * author_name : 飞飞生活
             * url : http://mini.eastday.com/mobile/171213173253008.html
             * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_3_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_1_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20171213/20171213173253_914e1863648652a4879a2225a6eb8f0c_2_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
            @Override
            public String toString() {
                return "DataBean{" +
                        "title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        '}';
            }
        }
    }
}
