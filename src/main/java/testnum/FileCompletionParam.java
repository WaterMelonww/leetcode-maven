package testnum;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2019-12-30 14:58
 */

public class FileCompletionParam {
    /**
     * 图片文件名称
     */
    private String fileName;
    /**、
     * 图片文件url
     */
    private String url;

    /**
     * 图片文件类型 1 室内门头正面 2 室外门头侧面 3室外外摆照片。。。。。
     */
    private Integer type;


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
