package win.sinno.web.resp.page;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 搜索参数
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-08-25 15:23.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchParam implements Serializable {

  private Map<String, Object> params = new HashMap<String, Object>(8);

  protected SearchParam() {
  }

  public static SearchParam newInstance() {
    return new SearchParam();
  }

  public SearchParam add(String key, Object val) {
    params.put(key, val);
    return this;
  }

  public Object get(String key) {
    return params.get(key);
  }

  public SearchParam remove(String key) {
    params.remove(key);
    return this;
  }

  public Map<String, Object> getParams() {
    return Collections.unmodifiableMap(params);
  }

  @Override
  public String toString() {
    return "SearchParam{" +
        "params=" + params +
        '}';
  }
}
