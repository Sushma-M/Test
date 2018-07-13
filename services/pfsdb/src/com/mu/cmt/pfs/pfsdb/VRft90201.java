/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * VRft90201 generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`V_RFT9020_1`")
@IdClass(VRft90201Id.class)
public class VRft90201 implements Serializable {

    private String userid;
    private String appid;
    private String approle;
    private String rolename;
    private String loweruserid;
    private String approledes;

    @Id
    @Column(name = "`USERID`", nullable = false, length = 6)
    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "`APPID`", nullable = false, length = 20)
    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Id
    @Column(name = "`APPROLE`", nullable = false, length = 40)
    public String getApprole() {
        return this.approle;
    }

    public void setApprole(String approle) {
        this.approle = approle;
    }

    @Id
    @Column(name = "`ROLENAME`", nullable = false, length = 30)
    public String getRolename() {
        return this.rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Column(name = "`LOWERUSERID`", nullable = true, length = 6)
    public String getLoweruserid() {
        return this.loweruserid;
    }

    public void setLoweruserid(String loweruserid) {
        this.loweruserid = loweruserid;
    }

    @Column(name = "`APPROLEDES`", nullable = true, length = 100)
    public String getApproledes() {
        return this.approledes;
    }

    public void setApproledes(String approledes) {
        this.approledes = approledes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VRft90201)) return false;
        final VRft90201 vrft90201 = (VRft90201) o;
        return Objects.equals(getUserid(), vrft90201.getUserid()) &&
                Objects.equals(getAppid(), vrft90201.getAppid()) &&
                Objects.equals(getApprole(), vrft90201.getApprole()) &&
                Objects.equals(getRolename(), vrft90201.getRolename());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserid(),
                getAppid(),
                getApprole(),
                getRolename());
    }
}

