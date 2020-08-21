package com.nekotori.entity;

import java.util.Date;

import com.nekotori.converter.StringtoUserStatusConverter;
import com.nekotori.entity.DO.UserDO;

public class User extends UserDO {

    UserStatus userStatus = new StringtoUserStatusConverter(status).Convert();

    private static final long serialVersionUID = -4454737765850239378L;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public UserStatus getStatus() {
        return userStatus;
    }

    public void setStatus(UserStatus status) {
        this.setStatusSuper(status.getInfo());
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "User [account=" + account + ", password=" + password + ", avatar=" + avatar + ", email=" + email
                + ", nickname=" + nickname + ", mobilePhoneNumber=" + mobilePhoneNumber + ", salt=" + salt
                + ", createDate=" + createDate + ", lastLogin=" + lastLogin + ", status=" + status + ", admin=" + admin
                + ", deleted=" + deleted + "]";
    }


}
