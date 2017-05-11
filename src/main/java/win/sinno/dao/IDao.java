package win.sinno.dao;

import win.sinno.model.IModel;

import java.util.List;

/**
 * dao interface
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2017/5/11 11:10
 */
public interface IDao<T extends IModel> {

    Long countAll();

    T selectById(Long id);

    Long insert(T t);

    Long insertBatch(List<T> list);

    Long updateById(T t);

    Long updateBatch(List<T> list);

    Long deleteById(Long id);
}
