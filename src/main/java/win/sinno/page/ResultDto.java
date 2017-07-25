package win.sinno.page;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import win.sinno.constant.ResultCode;

import java.io.Serializable;

/**
 * 结果dto
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-12-16 11:21.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultDto implements Serializable {

    /**
     * success.成功
     */
    public static final ResultDto SUCCESS = new ResultDto(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());

    /**
     * fail.失败
     */
    public static final ResultDto FAIL = new ResultDto(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());

    //code
    private Integer code;
    //msg
    private String msg;
    //obj
    private Object ret;

    public ResultDto(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultDto(Integer code, String msg, Object ret) {
        this.code = code;
        this.msg = msg;
        this.ret = ret;
    }

    public Integer getCode() {
        return code;
    }

    public ResultDto setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultDto setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getRet() {
        return ret;
    }

    public ResultDto setRet(Object ret) {
        this.ret = ret;
        return this;
    }

    public static ResultDto newSuccess(Object ret) {
        return new ResultDto(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), ret);
    }

    public static ResultDto newFail() {
        return new ResultDto(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());
    }
}
