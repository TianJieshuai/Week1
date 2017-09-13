package com.jiyun.shuaijie.mvpdemo.entity;

import java.util.List;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public class Entity {

    /**
     * reason : 请求成功
     * result : {"list":[{"id":"wechat_20170913047725","title":"【吃货】画笔下的冰淇淋、巧克力、饼干看的我直流口水\u2026\u2026","source":"51美术高考网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35546599.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047725"},{"id":"wechat_20170913048395","title":"童诗唤醒童心 |《童 话》","source":"第二书房阅读空间","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-12861618.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913048395"},{"id":"wechat_20170913044425","title":"人穷不坑三人，没钱不沾三情，失意不犯三贱，说的真好","source":"品茶时刻","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-41834847.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044425"},{"id":"wechat_20170913044352","title":"敦煌隋唐佛教艺术中的凤鸟纹饰","source":"丝路遗产","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45120932.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044352"},{"id":"wechat_20170913044433","title":"青花瓷丨食尽人间烟火，依然一尘不染","source":"案上雲煙","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45121068.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044433"},{"id":"wechat_20170913044399","title":"书房中最文质的七种绿植","source":"案上雲煙","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-43190990.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044399"},{"id":"wechat_20170913044375","title":"古人的笔架，美到惊艳了放笔的刹那！","source":"案上雲煙","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45120995.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044375"},{"id":"wechat_20170913044490","title":"新刊预告 | 九月，文字的魔幻术","source":"萌芽","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-36600864.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044490"},{"id":"wechat_20170913044738","title":"豆瓣9.0，这部三十多年前的动画作品，直到现在依然难被超越","source":"电影迷","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45122273.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044738"},{"id":"wechat_20170913044852","title":"诗词丨这么多绝美诗词，竟然不知作者是谁！","source":"枕边有书","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45122554.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044852"},{"id":"wechat_20170913045972","title":"古钱币长了有害锈怎么办？","source":"集币在线","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37625028.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913045972"},{"id":"wechat_20170913045964","title":"大爷1000块钱收来的银币，现在价值3万！这种银币你有吗？","source":"集币在线","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37625028.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913045964"},{"id":"wechat_20170913046311","title":"9月故宫年度大展先睹为快","source":"瞭望","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45126407.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913046311"},{"id":"wechat_20170913046295","title":"问诊博物馆，展览有三大症结","source":"瞭望","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45126385.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913046295"},{"id":"wechat_20170913047547","title":"为人中正 不偏不倚：用\u201c中庸\u201d观照现实","source":"腾讯儒学","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45130597.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047547"},{"id":"wechat_20170913047391","title":"欲成大事：志不可不高 心不可太大丨原创","source":"腾讯儒学","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-10244910.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047391"},{"id":"wechat_20170913047403","title":"读经明义丨《孝经》：忠孝并举 心怀天下","source":"腾讯儒学","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45130083.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047403"},{"id":"wechat_20170913044400","title":"远离这六件事，你会越来越顺，越早知道越好！","source":"品茶时刻","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45121033.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044400"},{"id":"wechat_20170913044613","title":"心，经不起冷；人，经不起伤","source":"励志爱情语录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45121871.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044613"},{"id":"wechat_20170913046477","title":"这些话太狠了，说到痛处","source":"水至如冰","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-32112854.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913046477"}],"totalPage":7240,"ps":20,"pno":1}
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
        /**
         * list : [{"id":"wechat_20170913047725","title":"【吃货】画笔下的冰淇淋、巧克力、饼干看的我直流口水\u2026\u2026","source":"51美术高考网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-35546599.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047725"},{"id":"wechat_20170913048395","title":"童诗唤醒童心 |《童 话》","source":"第二书房阅读空间","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-12861618.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913048395"},{"id":"wechat_20170913044425","title":"人穷不坑三人，没钱不沾三情，失意不犯三贱，说的真好","source":"品茶时刻","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-41834847.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044425"},{"id":"wechat_20170913044352","title":"敦煌隋唐佛教艺术中的凤鸟纹饰","source":"丝路遗产","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45120932.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044352"},{"id":"wechat_20170913044433","title":"青花瓷丨食尽人间烟火，依然一尘不染","source":"案上雲煙","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45121068.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044433"},{"id":"wechat_20170913044399","title":"书房中最文质的七种绿植","source":"案上雲煙","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-43190990.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044399"},{"id":"wechat_20170913044375","title":"古人的笔架，美到惊艳了放笔的刹那！","source":"案上雲煙","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45120995.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044375"},{"id":"wechat_20170913044490","title":"新刊预告 | 九月，文字的魔幻术","source":"萌芽","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-36600864.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044490"},{"id":"wechat_20170913044738","title":"豆瓣9.0，这部三十多年前的动画作品，直到现在依然难被超越","source":"电影迷","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45122273.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044738"},{"id":"wechat_20170913044852","title":"诗词丨这么多绝美诗词，竟然不知作者是谁！","source":"枕边有书","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45122554.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044852"},{"id":"wechat_20170913045972","title":"古钱币长了有害锈怎么办？","source":"集币在线","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37625028.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913045972"},{"id":"wechat_20170913045964","title":"大爷1000块钱收来的银币，现在价值3万！这种银币你有吗？","source":"集币在线","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-37625028.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913045964"},{"id":"wechat_20170913046311","title":"9月故宫年度大展先睹为快","source":"瞭望","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45126407.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913046311"},{"id":"wechat_20170913046295","title":"问诊博物馆，展览有三大症结","source":"瞭望","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45126385.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913046295"},{"id":"wechat_20170913047547","title":"为人中正 不偏不倚：用\u201c中庸\u201d观照现实","source":"腾讯儒学","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45130597.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047547"},{"id":"wechat_20170913047391","title":"欲成大事：志不可不高 心不可太大丨原创","source":"腾讯儒学","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-10244910.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047391"},{"id":"wechat_20170913047403","title":"读经明义丨《孝经》：忠孝并举 心怀天下","source":"腾讯儒学","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45130083.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047403"},{"id":"wechat_20170913044400","title":"远离这六件事，你会越来越顺，越早知道越好！","source":"品茶时刻","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45121033.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044400"},{"id":"wechat_20170913044613","title":"心，经不起冷；人，经不起伤","source":"励志爱情语录","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-45121871.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913044613"},{"id":"wechat_20170913046477","title":"这些话太狠了，说到痛处","source":"水至如冰","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-32112854.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170913046477"}]
         * totalPage : 7240
         * ps : 20
         * pno : 1
         */

        private int totalPage;
        private int ps;
        private int pno;
        private List<ListBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : wechat_20170913047725
             * title : 【吃货】画笔下的冰淇淋、巧克力、饼干看的我直流口水……
             * source : 51美术高考网
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-35546599.static/640
             * mark :
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20170913047725
             */

            private String id;
            private String title;
            private String source;
            private String firstImg;
            private String mark;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
