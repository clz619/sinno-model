package win.sinno.constant;

/**
 * 返回code和msg
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-12-16 11:34.
 */
public enum ResultCode {
  /**
   * 200.success
   */
  SUCCESS(200, "success", "成功"),

  /**
   * 500.fail
   */
  FAIL(500, "fail", "失败"),

  /**
   * 571.param-missing
   */
  PARAM_MISSING(571, "param-missing", "参数缺失"),

  /**
   * 572.param-invalid
   */
  PARAM_INVALID(572, "param-invalid", "参数非法"),

  /**
   * 573.data-exist
   */
  DATA_EXIST(573, "data-exist", "数据已存在"),
  //
  ;

  ResultCode(Integer code, String msg, String descr) {
    this.code = code;
    this.msg = msg;
    this.descr = descr;
  }

  private Integer code;

  private String msg;

  private String descr;

  public Integer getCode() {
    return code;
  }


  public String getMsg() {
    return msg;
  }

  public String getDescr() {
    return descr;
  }
}
