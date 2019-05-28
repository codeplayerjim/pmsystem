package com.spaker.pmsystem.model;

import java.io.Serializable;

public class PmsFamily implements Serializable {
    /**
    *
     *
     * @mbggenerated
    */
    private Integer id;

    /**
    *父母联系人
     *
     * @mbggenerated
    */
    private Integer parentId;

    /**
    *
     *
     * @mbggenerated
    */
    private Integer spouseId;

    /**
    *
     *
     * @mbggenerated
    */
    private Integer childId;

    /**
    *紧急联系人
     *
     * @mbggenerated
    */
    private Integer friendId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(Integer spouseId) {
        this.spouseId = spouseId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", spouseId=").append(spouseId);
        sb.append(", childId=").append(childId);
        sb.append(", friendId=").append(friendId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}