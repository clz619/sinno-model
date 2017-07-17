package win.sinno.page;

import java.io.Serializable;
import java.util.List;

/**
 * 分页参数-P为搜索参数，paginationResult:分页结果
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2016-08-25 14:49.
 */
public class Pagination<P extends SearchParam, R> implements Serializable {

    /**
     * 查询参数
     */
    private P param;

    /**
     * 分页结果
     */
    private PaginationResult paginationResult;


    /**
     * 设置页数
     *
     * @param curPage
     * @param pageSize
     */
    public Pagination(Integer curPage, Integer pageSize) {
        //分页结果
        this.paginationResult = new PaginationResult(curPage, pageSize);
    }

    public Pagination(Integer curPage, Integer pageSize, P param) {
        //分页参数
        this.param = param;
        //分页结果
        this.paginationResult = new PaginationResult(curPage, pageSize);
    }


    public Integer getCurPage() {
        return paginationResult.getCurPage();
    }

    public Integer getPageSize() {
        return paginationResult.getPageSize();
    }

    public Integer getBegin() {
        return paginationResult.getBegin();
    }

    public Long getBeginLong() {
        return paginationResult.getBeginLong();
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

    public P getParam() {
        return param;
    }

    public void setParam(P param) {
        this.param = param;
    }

    /**
     * 结果集
     *
     * @return
     */
    public List<R> getResultList() {
        return paginationResult.getResultList();
    }

    public void setResultList(List<R> resultList) {
        paginationResult.setResultList(resultList);
    }

    /**
     * pagination result
     *
     * @return
     */
    public PaginationResult getPaginationResult() {
        return paginationResult;
    }

    public void setPaginationResult(PaginationResult paginationResult) {
        this.paginationResult = paginationResult;
    }
}
