package win.sinno.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ━━━━━━oooo━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃stay hungry stay foolish
 * 　　　　┃　　　┃Code is far away from bug with the animal protecting
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━oooo━━━━━━
 * <p>
 * base model
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2017/4/28 13:29
 */
public interface IBaseModel extends Serializable {

    Long getId();

    void setId(Long id);

    Date getAddTs();

    void setAddTs(Date addTs);

    Date getUpdateTs();

    void setUpdateTs(Date updateTs);
}
