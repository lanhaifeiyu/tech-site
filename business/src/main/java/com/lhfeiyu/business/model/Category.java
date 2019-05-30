package com.lhfeiyu.business.model;

import com.lhfeiyu.business.model.Base.BaseModel;

/**
 * @author:wangaimin
 * @date:2019/05/30 16:47
 * @description:分类表
 */
public class Category extends BaseModel {
    /**
     * 系统编号
     */
    private Long id;

    /**
     * 父节点系统编号
     */
    private Long parentId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 排序优先级
     */
    private Short priority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }
}