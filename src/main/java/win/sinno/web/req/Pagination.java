package win.sinno.web.req;

/**
 * win.sinno.web.req.Pagination
 *
 * @author chenlizhong@qipeng.com
 * @date 2018/2/9
 */
public class Pagination {
  
  private Integer curPage;

  private Integer pageSize;

  public Integer getCurPage() {
    return curPage;
  }

  public void setCurPage(Integer curPage) {
    this.curPage = curPage;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }
}
