package admin.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangru
 * @create 2019-10-29 8:37
 */
@Data
public class UpdateAdminInfoAO implements Serializable {
    /**
     * 用户id
     */
    @JsonProperty("adminId")
    private Long adminId;
    /**
     * 用户名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 用户手机号
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 用户密码
     */
    @JsonProperty("password")
    private String password;

}
