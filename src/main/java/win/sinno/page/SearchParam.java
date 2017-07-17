package win.sinno.page;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 搜索参数
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-08-25 15:23.
 */
public class SearchParam implements Serializable {

    private Map<String, Object> params = new HashMap<String, Object>();

    public void put(String key, Object val) {
        params.put(key, val);
    }

    public Object get(String key) {
        return params.get(key);
    }

    public void remove(String key) {
        params.remove(key);
    }

}
