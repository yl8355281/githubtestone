package com.qf.mygittest;

/**
 * Created by Administrator on 2016/8/29 0029.
 */
public class News {
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public News(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
