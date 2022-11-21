package com.example.SingleLeague.entity;

/**
 * @author Chris Yang
 * created 2022-08-21 16:33
 **/
public class Page {


    // 当前页码
    private int current = 1;

    // 显示上限
    private int limit = 10;

    // 数据总数
    private int rows;

    // 查询路径
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return
     * @description 获取当前页的起始行
     * @author yxh
     * @date 2022-08-21 16:37:07
     * @para * @param: null
     */
    public int getOffset() {
        // current * limit = limit;
        return (current - 1) * limit;
    }

    /**
     * @return
     * @description 获取总页数
     * @author yxh
     * @date 2022-08-21 16:37:43
     * @para * @param: null
     */

    public int getTotal() {
        // rows / limit [+1]
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /**
     * @return
     * @description 获取起始页码
     * @author yxh
     * @date 2022-08-21 16:38:36
     * @para * @param: null
     */
    public int getFrom() {
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    /**
     * @return
     * @description 获取结束码
     * @author yxh
     * @date 2022-08-21 16:39:32
     * @para * @param: null
     */
    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }
}
