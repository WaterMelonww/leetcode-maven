package admin.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangru
 * @create 2019-10-31 10:27
 */
@Data
public class SystemPermissonAO implements Serializable {
    /**
     * 用户id
     */
    @JsonProperty("adminId")
    private Long adminId;
    /**
     *权限id集合
     */
    @JsonProperty("systemPermissionList")
    private List<Long> systemPermissionList;

}
