package com.example.imgurstory.repository.remote.model.catagory_response;

public class Tags {

    private String description;
    private String display_name;
    private String is_whitelisted;
    private String total_items;
    private String followers;
    private String following;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getIs_whitelisted() {
        return is_whitelisted;
    }

    public void setIs_whitelisted(String is_whitelisted) {
        this.is_whitelisted = is_whitelisted;
    }

    public String getTotal_items() {
        return total_items;
    }

    public void setTotal_items(String total_items) {
        this.total_items = total_items;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
