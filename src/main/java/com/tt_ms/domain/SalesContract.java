package com.tt_ms.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by mm on 2018/4/9.
 */
public class SalesContract implements Serializable{

    private int id;
    private String userName;
    private String password;
    private String sex;

    //private List<UserPermisson> userPermisson;
    private Set<String> userPermisson;

    public Set<String> getUserPermisson() {
        return userPermisson;
    }

    public void setUserPermisson(Set<String> userPermisson) {
        this.userPermisson = userPermisson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesContract user = (SalesContract) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", userPermisson='" + userPermisson + '\'' +
                '}';
    }
}
