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
    SUCCESS(200, "success"),

    /**
     * 400.fail
     */
    FAIL(400, "fail"),

    /**
     * 571.param-missing
     */
    PARAM_MISSING(571, "param-missing"),

    /**
     * 572.param-invalid
     */
    PARAM_INVALID(572, "param-invalid"),;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;

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
}
