package win.sinno.dao;

import java.util.List;
import java.util.Map;
import win.sinno.model.IModel;

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

  List<T> selectAll(Map<String, Object> params);

  Long insert(T t);

  Long insertBatch(List<T> list);

  Long updateById(T t);

  Long updateBatch(List<T> list);

  Long deleteById(Long id);
}
