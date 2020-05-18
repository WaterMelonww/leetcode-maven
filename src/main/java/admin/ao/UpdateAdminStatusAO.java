package admin.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author wangru
 * @create 2019-11-12 11:20
 */
@Data
public class UpdateAdminStatusAO implements Serializable {
    /**
     * 用户id
     */
    @JsonProperty("adminId")
    private Long adminId;

    /**
     * 用户状态
     */
    @JsonProperty("status")
    private Integer status;
}
