package admin.entity;

/**
 * @author wangru
 * @create 2019-11-18 13:29
 */

public enum Urls {
    /**
     * 获取所有的按钮标识
     */
    getAllCode("/adminback/getAllCode"),

    /**
     * 获取所有的系统列表
     */
    getSystemList("/adminback/getSystemList"),

    /**
     * 登陆退出
     */
    logoutSuccess("/adminback/logoutSuccess"),

    /**
     * 没有登陆时的登陆路径
     */
    loginInfo("/adminback/loginInfo");

    /**
     * 获取地址
     */
    private String url;

    /**
     * get方法
     */
    public String getUrl() {
        return url;
    }

    /**
     * set方法
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 构造函数
     */
    Urls(String url) {
        this.url = url;
    }
}
