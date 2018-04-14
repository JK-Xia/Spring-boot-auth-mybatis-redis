package com.tt_ms.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by poker0325@me.com  on 2018/4/9.
 */
public class User implements Serializable{

    private int id;
    private String userName;
    private String password;
    private String gender;
    private String cellphone;
    private String email;
    private String status;
    private boolean loginPermisson;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isLoginPermisson() {
        return loginPermisson;
    }

    public void setLoginPermisson(boolean loginPermisson) {
        this.loginPermisson = loginPermisson;
    }

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
        return gender;
    }

    public void setSex(String sex) {
        this.gender = sex;
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
        User user = (User) o;
        return id == user.id &&
                loginPermisson == user.loginPermisson &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(cellphone, user.cellphone) &&
                Objects.equals(email, user.email) &&
                Objects.equals(status, user.status) &&
                Objects.equals(userPermisson, user.userPermisson);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userName, password, gender, cellphone, email, status, loginPermisson, userPermisson);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", loginPermisson=" + loginPermisson +
                ", userPermisson=" + userPermisson +
                '}';
    }
}
