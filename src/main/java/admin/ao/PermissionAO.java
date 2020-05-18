package admin.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author wangru
 * @create 2019-11-13 5:58
 */
@Data
public class PermissionAO {
    /**
     * 权限名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 权限路径
     */
    @JsonProperty("url")
    private String url;

    /**
     * 权限标识(用来映射前端按钮）
     */
    @JsonProperty("code")
    private String code;

    /**
     * 权限所属于的系统
     */
    @JsonProperty("systemId")
    private Long systemId;

    /**
     * 权限id
     */
    @JsonProperty("permissionId")
    private Long permissionId;
}
