package com.fujias.itesting.base.bean;

public class Physical {

    // sessionID
    private String sessionID = null;
    
    // PCipAddress
    private String ipAddress = null;
    
    // macAddress
    private String macAddress = null;
    
    // accessToken
    private String accessToken  = null;
    
    // ヘルプファイルマッピング
    private String helpMapping = null;

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getHelpMapping() {
        return helpMapping;
    }

    public void setHelpMapping(String helpMapping) {
        this.helpMapping = helpMapping;
    }
    
    
}
