package win.sinno.model;

import java.io.Serializable;

/**
 * model with id
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2017/5/11 11:17
 */
public interface IModel extends Serializable {

    Long getId();

    void setId(Long id);
}
