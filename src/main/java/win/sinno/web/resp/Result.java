package win.sinno.web.resp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import win.sinno.constant.ResultCode;

/**
 * 结果dto
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-12-16 11:21.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result extends RespStatus {

  /**
   * success.成功
   */
  public static final Result SUCCESS = new Result(ResultCode.SUCCESS.getCode(),
      ResultCode.SUCCESS.getMsg());

  /**
   * fail.失败
   */
  public static final Result FAIL = new Result(ResultCode.FAIL.getCode(),
      ResultCode.FAIL.getMsg());

  //obj
  private Object ret;

  public Result(Integer code, String msg) {
    super(code, msg);
  }

  public Result(Integer code, String msg, Object ret) {
    super(code, msg);
    this.ret = ret;
  }


  public Object getRet() {
    return ret;
  }

  public void setRet(Object ret) {
    this.ret = ret;
  }

  public static Result newSuccess(Object ret) {
    return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), ret);
  }

  public static Result newFail() {
    return new Result(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());
  }
}
