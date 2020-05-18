package admin.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangru
 * @create 2019-11-13 14:02
 */
@Data
public class DeleteSystemAO implements Serializable {
    /**
     * 系统Id
     */
    @JsonProperty("systemId")
    private Long systemId;

    /**
     * 权限Id
     */
    @JsonProperty("permissionId")
    private Long permissionId;
}
