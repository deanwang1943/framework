package com.dean.learn.dubbo.api.model;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private Long id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String defaultAd;

    public UserAddress(Long id, String userAddress, String userId, String consignee, String defaultAd) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.defaultAd = defaultAd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getDefaultAd() {
        return defaultAd;
    }

    public void setDefaultAd(String defaultAd) {
        this.defaultAd = defaultAd;
    }
}
