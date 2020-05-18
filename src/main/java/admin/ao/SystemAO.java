package admin.ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangru
 * @create 2019-11-12 20:02
 */
@Data
public class SystemAO implements Serializable {

    /**
     * 系统名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 系统标识
     */
    @JsonProperty("code")
    private String code;

    /**
     * 系统id
     */
    @JsonProperty("systemId")
    private Long systemId;

}
