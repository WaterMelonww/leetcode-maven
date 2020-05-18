package admin;

/**
 * @Description 返回信息类
 * @Author 郑泽睿
 * @Date 2019/10/22 16:40
 * */
public class Result<T> {

    /**
     * 成功编号
     */
    public static final int SUCCESS = 0;

    /**
     * 失败编号
     */
    public static final int ERROR = 9999;

    /**
     *  返回编号
     * */
    Integer code;

    /**
     *  返回信息
     * */
    String message;

    /**
     *  数据
     * */
    T data;

    Result(){

    }

    public static Result error(String message) {
        Result response = new Result();
        response.setCode(ERROR);
        response.setMessage(message);
        return response;
    }

    public static Result success(){
        Result response = new Result();
        response.setCode(SUCCESS);
        response.setMessage("");
        return response;
    }

    public static <T> Result<T> success(T data){
        Result response = new Result();
        response.setCode(SUCCESS);
        response.setMessage("");
        response.setData(data);
        return response;
    }

    public static <T> Result<T> success(T data,String message){
        Result response = new Result();
        response.setCode(SUCCESS);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
