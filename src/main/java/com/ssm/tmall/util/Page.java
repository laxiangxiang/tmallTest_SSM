package com.ssm.tmall.util;

/**
 * Created by LXX on 2019/4/24.
 */
public class Page {
    private int start;//开始页数
    private int count;//每页显示个数
    private int total;//总个数
    private String param;//参数
    private static final int defaultCount = 5;//默认每页显示5条

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public static int getDefaultCount() {
        return defaultCount;
    }

    public Page(){
        count = defaultCount;
    }

    public Page(int start, int count) {
        this();
        this.start = start;
        this.count = count;
    }

    public boolean isHasPrevious(){
        if (start == 0){
            return false;
        }
        return true;
    }

    public boolean isHasNext(){
        if (start == getLastPage())
            return false;
        return true;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotalPage(){
        int totalPage;
        if (0 ==total % count){
            totalPage = total / count;
        }else {
            totalPage = total / count + 1;
        }
        if (0 == totalPage){
            totalPage = 1;
        }
        return totalPage;
    }

    /**
     * 获取最后一页的第一条
     * @return
     */
    public int getLastPage() {
        int last;
        if (0 == total % count){
            last = total - count;
        }else {
            last = total - total % count;
        }
        last = last < 0?0:last;
        return last;
    }

    @Override
    public String toString() {
        return "Page [start=" + start + ", count=" + count + ", total=" + total + ", getStart()=" + getStart()
                + ", getCount()=" + getCount() + ", isHasPrevious()=" + isHasPrevious() + ", isHasNext()="
                + isHasNext() + ", getTotalPage()=" + getTotalPage() + ", getLastPage()=" + getLastPage() + "]";
    }
}
