package win.sinno.web.req;

/**
 * win.sinno.web.req.PaginationParam
 *
 * @author chenlizhong@qipeng.com
 * @date 2018/2/9
 */
public class PaginationParam {

  public static final String OFFSET_PNAME = "offset";
  public static final String CUR_PAGE_PNAME = "curPage";
  public static final String PAGE_SIZE_PNAME = "pageSize";

  public static final Integer DEFAULT_CUR_PAGE = 1;
  public static final Integer DEFAULT_PAGE_SIZE = 10;

  public static final PaginationParam DEFAULT = new PaginationParam(DEFAULT_CUR_PAGE,
      DEFAULT_PAGE_SIZE);

  private Integer curPage = DEFAULT_CUR_PAGE;

  private Integer pageSize = DEFAULT_PAGE_SIZE;

  public PaginationParam() {
  }

  public PaginationParam(Integer curPage, Integer pageSize) {
    this.curPage = curPage;
    this.pageSize = pageSize;

    formatCurPage();
    formatPageSize();
  }

  public Integer getCurPage() {
    return curPage;
  }

  public void setCurPage(Integer curPage) {
    this.curPage = curPage;

    formatCurPage();
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    formatPageSize();
  }

  public Integer getOffset() {
    return (this.curPage - 1) * this.pageSize;
  }

  private void formatCurPage() {
    if (this.curPage == null || this.curPage <= 0) {
      this.curPage = 1;
    }
  }

  private void formatPageSize() {
    if (this.pageSize == null || this.pageSize <= 0) {
      this.pageSize = 10;
    }
  }

  @Override
  public String toString() {
    return "PaginationParam{" +
        "curPage=" + curPage +
        ", pageSize=" + pageSize +
        '}';
  }
}
