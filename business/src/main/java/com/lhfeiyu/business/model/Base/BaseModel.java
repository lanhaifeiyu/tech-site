package com.lhfeiyu.business.model.Base;

import java.util.Date;

/**
 * @author:Gene.A.Wang
 * @date:2019/5/30
 * @time:16:32
 */
public class BaseModel {

    /**
     * 状态
     */
    private Byte status;

    /**
     * 创建用户id
     */
    private Long createUserId;

    /**
     * 创建用户名
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 编辑用户id
     */
    private Long editUserId;

    /**
     * 编辑用户名
     */
    private String editUserName;

    /**
     * 编辑时间
     */
    private Date editDate;


    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getEditUserId() {
        return editUserId;
    }

    public void setEditUserId(Long editUserId) {
        this.editUserId = editUserId;
    }

    public String getEditUserName() {
        return editUserName;
    }

    public void setEditUserName(String editUserName) {
        this.editUserName = editUserName == null ? null : editUserName.trim();
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
}
