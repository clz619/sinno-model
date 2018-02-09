package win.sinno.web.resp.page;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import win.sinno.web.resp.RespStatus;

/**
 * 分页结果集
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-08-25 14:45.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationResult<R> extends RespStatus {

  /**
   * 当前页
   */
  private Integer curPage;

  /**
   * 页大小
   */
  private Integer pageSize;

  /**
   * 总数
   */
  private Long count;

  /**
   * 结果集
   */
  private List<R> resultList;

  public PaginationResult(Integer code, String msg) {
    super(code, msg);
    init();
  }

  public PaginationResult(Integer curPage, Integer pageSize) {
    this.curPage = curPage;
    this.pageSize = pageSize;
    init();
  }

  public PaginationResult(Integer code, String msg, Integer curPage, Integer pageSize) {
    super(code, msg);
    this.curPage = curPage;
    this.pageSize = pageSize;
    init();
  }

  private void init() {
    if ((this.curPage == null) || (this.curPage <= 0)) {
      this.curPage = 1;
    }

    if ((this.pageSize == null) || (this.pageSize <= 0)) {
      this.pageSize = 10;
    }
    count = 0l;
  }


  public Integer getCurPage() {
    return curPage;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public Integer getBegin() {
    return (this.curPage - 1) * this.pageSize;
  }

  public Integer getPageCount() {
    //
    if (this.count == null || this.pageSize == null) {
      return 0;
    }

    int mod = ((this.count % this.pageSize) == 0) ? 0 : 1;

    int divide = (int) (this.count / this.pageSize);

    return divide + mod;
  }

  public Long getCount() {
    return count;
  }

  public List<R> getResultList() {
    return resultList;
  }

  public void setResultList(List<R> resultList) {
    this.resultList = resultList;
  }

  @Override
  public String toString() {
    return "PaginationResult{" +
        "curPage=" + curPage +
        ", pageSize=" + pageSize +
        ", count=" + count +
        ", resultList=" + resultList +
        "} " + super.toString();
  }
}
