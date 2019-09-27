package com.zlz.common.entity.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 10:36
 */
@TableName("info_user")
public class UserInfo {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private Integer gender;
    private Integer authority;
    private Integer isDeleted;
    private String createdUser;
    private String lastModifiedUser;
    private Date createdTime;
    private Date lastModifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer age) {
        this.authority = age;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", authority=" + authority +
                ", isDeleted='" + isDeleted + '\'' +
                ", createdUser='" + createdUser + '\'' +
                ", lastModifiedUser='" + lastModifiedUser + '\'' +
                ", createdTime=" + createdTime +
                ", lastModifiedTime=" + lastModifiedTime +
                '}';
    }
}
