package win.sinno.web.resp.page;

import win.sinno.web.req.PaginationParam;

/**
 * win.sinno.web.resp.page.PaginationSearchParam
 *
 * @author chenlizhong@qipeng.com
 * @date 2018/2/9
 */
public class PaginationSearchParam extends SearchParam {

  private PaginationSearchParam() {
    add(PaginationParam.DEFAULT);
  }

  private PaginationSearchParam(PaginationParam paginationParam) {
    add(paginationParam);
  }

  public static PaginationSearchParam newInstance() {
    return new PaginationSearchParam();
  }

  public static PaginationSearchParam newInstance(PaginationParam paginationParam) {
    return new PaginationSearchParam(paginationParam);
  }

  public SearchParam add(PaginationParam paginationParam) {
    if (paginationParam == null) {
      paginationParam = PaginationParam.DEFAULT;
    }

    add(PaginationParam.OFFSET_PNAME, paginationParam.getOffset())
        .add(PaginationParam.CUR_PAGE_PNAME, paginationParam.getCurPage())
        .add(PaginationParam.PAGE_SIZE_PNAME, paginationParam.getPageSize());

    return this;
  }
}
