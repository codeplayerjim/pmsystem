package com.spaker.pmsystem.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PmsRewardsAndPunishments implements Serializable {
    private Integer id;

    @ApiModelProperty(value="奖励")
    private String rewards;

    @ApiModelProperty(value="奖励时间")
    private Date rewardTime;

    @ApiModelProperty(value="惩罚")
    private String punishments;

    @ApiModelProperty(value="惩罚时间")
    private Date punishmentTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }

    public Date getRewardTime() {
        return rewardTime;
    }

    public void setRewardTime(Date rewardTime) {
        this.rewardTime = rewardTime;
    }

    public String getPunishments() {
        return punishments;
    }

    public void setPunishments(String punishments) {
        this.punishments = punishments;
    }

    public Date getPunishmentTime() {
        return punishmentTime;
    }

    public void setPunishmentTime(Date punishmentTime) {
        this.punishmentTime = punishmentTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rewards=").append(rewards);
        sb.append(", rewardTime=").append(rewardTime);
        sb.append(", punishments=").append(punishments);
        sb.append(", punishmentTime=").append(punishmentTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}