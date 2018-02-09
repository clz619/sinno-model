package win.sinno.web.resp.page;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;
import win.sinno.web.req.PaginationParam;

/**
 * 分页参数-P为搜索参数，paginationResult:分页结果
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-08-25 14:49.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pagination<P extends SearchParam, R> implements Serializable {

  /**
   * 查询参数
   */
  private P params;

  /**
   * 分页结果
   */
  @JsonIgnore
  private PaginationResult paginationResult;


  private Pagination(P params, PaginationParam paginationParam) {
    if (paginationParam == null) {
      paginationParam = PaginationParam.DEFAULT;
    }

    this.paginationResult = new PaginationResult(paginationParam.getCurPage(),
        paginationParam.getPageSize());

    this.params = params;
  }

  public static <P extends SearchParam> Pagination newInstance(P params,
      PaginationParam paginationParam) {
    return new Pagination(params, paginationParam);
  }


  public Integer getCurPage() {
    return paginationResult.getCurPage();
  }

  public Integer getPageSize() {
    return paginationResult.getPageSize();
  }

  public Integer getOffset() {
    return paginationResult.getOffset();
  }

  public Integer getCurPageSize() {

    if (paginationResult == null || paginationResult.getResultList() == null) {
      return 0;
    }

    return paginationResult.getResultList().size();
  }

  public Integer getPageCount() {
    return paginationResult.getPageCount();
  }

  //数量
  public Long getCount() {
    return paginationResult.getCount();
  }

  public void setCount(Long count) {
    paginationResult.setCount(count);
  }

  public P getParams() {
    return params;
  }

  public void setParams(P params) {
    this.params = params;
  }

  /**
   * 结果集
   */
  public List<R> getResultList() {
    return paginationResult.getResultList();
  }

  public void setResultList(List<R> resultList) {
    paginationResult.setResultList(resultList);
  }

  /**
   * pagination result
   */
  public PaginationResult getPaginationResult() {
    return paginationResult;
  }

  public void setPaginationResult(PaginationResult paginationResult) {
    this.paginationResult = paginationResult;
  }


}
