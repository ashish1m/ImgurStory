package com.example.imgurstory.repository.remote.model;

public class Ad_config {
    private String showsAds;

    private String[] unsafeFlags;

    private String[] wallUnsafeFlags;

    private String[] safeFlags;

    private String[] highRiskFlags;

    public String getShowsAds() {
        return showsAds;
    }

    public void setShowsAds(String showsAds) {
        this.showsAds = showsAds;
    }

    public String[] getUnsafeFlags() {
        return unsafeFlags;
    }

    public void setUnsafeFlags(String[] unsafeFlags) {
        this.unsafeFlags = unsafeFlags;
    }

    public String[] getWallUnsafeFlags() {
        return wallUnsafeFlags;
    }

    public void setWallUnsafeFlags(String[] wallUnsafeFlags) {
        this.wallUnsafeFlags = wallUnsafeFlags;
    }

    public String[] getSafeFlags() {
        return safeFlags;
    }

    public void setSafeFlags(String[] safeFlags) {
        this.safeFlags = safeFlags;
    }

    public String[] getHighRiskFlags() {
        return highRiskFlags;
    }

    public void setHighRiskFlags(String[] highRiskFlags) {
        this.highRiskFlags = highRiskFlags;
    }

    @Override
    public String toString() {
        return "ClassPojo [showsAds = " + showsAds + ", unsafeFlags = " + unsafeFlags + ", wallUnsafeFlags = " + wallUnsafeFlags + ", safeFlags = " + safeFlags + ", highRiskFlags = " + highRiskFlags + "]";
    }
}
