package com.bjpowernode.entity;

/**
 * @author 林哥哥
 */
public class Dept {

    private Integer deptNo;
    private String dname;
    private String loc;

//    有参和无参的构造方法

    public Dept(Integer deptNo, String dname, String loc) {
        this.deptNo = deptNo;
        this.dname = dname;
        this.loc = loc;
    }

    public Dept() {
    }


//        添加getter和setter

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
