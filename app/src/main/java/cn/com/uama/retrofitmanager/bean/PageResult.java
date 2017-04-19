package cn.com.uama.retrofitmanager.bean;

/**
 * Created by liwei on 2017/4/18 11:56
 * Email: liwei@uama.com.cn
 * Description: 分页参数
 */

public class PageResult {
    private int curPage;
    private int pageSize;
    private boolean hasMore;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }
}