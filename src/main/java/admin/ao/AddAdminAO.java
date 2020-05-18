package admin.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangru
 * @create 2019-11-12 11:22
 */
@Data
public class AddAdminAO implements Serializable {
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

}
