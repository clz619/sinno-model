package win.sinno.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 * win.sinno.resp.RespStatus
 *
 * @author : admin@chenlizhong.cn
 * @date 2018/2/5
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RespStatus implements Serializable {

  //code
  private Integer code;
  //msg
  private String msg;

  public RespStatus() {
  }

  public RespStatus(Integer code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return "RespStatus{" +
        "code=" + code +
        ", msg='" + msg + '\'' +
        '}';
  }
}
