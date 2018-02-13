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
public class Result<R> extends RespStatus {

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
  private R ret;

  public Result(Integer code, String msg) {
    super(code, msg);
  }

  public Result(Integer code, String msg, R ret) {
    super(code, msg);
    this.ret = ret;
  }

  public boolean isSuccess() {
    return ResultCode.SUCCESS.getCode() == getCode();
  }

  public R getRet() {
    return ret;
  }

  public void setRet(R ret) {
    this.ret = ret;
  }

  public static <R> Result newSuccess() {
    return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
  }

  public static <R> Result newSuccess(R ret) {
    return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), ret);
  }

  public static Result newFail() {
    return new Result(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());
  }

  public static Result newFail(String msg) {
    return new Result(ResultCode.FAIL.getCode(), msg);
  }

  public static Result newFail(Integer code, String msg) {
    return new Result(code, msg);
  }

  public static Result newFail(ResultCode code) {
    return new Result(code.getCode(), code.getDescr());
  }

  public static Result newFail(ResultCode code, String msg) {
    return new Result(code.getCode(), code.getDescr() + msg);
  }

  @Override
  public String toString() {
    return "Result{" +
        "ret=" + ret +
        "} " + super.toString();
  }
}
