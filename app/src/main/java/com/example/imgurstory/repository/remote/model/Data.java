package com.example.imgurstory.repository.remote.model;

public class Data {
    private String background_hash;

    private String is_promoted;

    private String background_is_animated;

    private String thumbnail_hash;

    private String description;

    private String display_name;

    private String is_whitelisted;

    private String total_items;

    private String accent;

    private String thumbnail_is_animated;

    private String followers;

    private String following;

    private String name;

    private String logo_hash;

    private String description_annotations;

    private String logo_destination_url;

    private Items[] items;

    public String getBackground_hash() {
        return background_hash;
    }

    public void setBackground_hash(String background_hash) {
        this.background_hash = background_hash;
    }

    public String getIs_promoted() {
        return is_promoted;
    }

    public void setIs_promoted(String is_promoted) {
        this.is_promoted = is_promoted;
    }

    public String getBackground_is_animated() {
        return background_is_animated;
    }

    public void setBackground_is_animated(String background_is_animated) {
        this.background_is_animated = background_is_animated;
    }

    public String getThumbnail_hash() {
        return thumbnail_hash;
    }

    public void setThumbnail_hash(String thumbnail_hash) {
        this.thumbnail_hash = thumbnail_hash;
    }

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

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public String getThumbnail_is_animated() {
        return thumbnail_is_animated;
    }

    public void setThumbnail_is_animated(String thumbnail_is_animated) {
        this.thumbnail_is_animated = thumbnail_is_animated;
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

    public String getLogo_hash() {
        return logo_hash;
    }

    public void setLogo_hash(String logo_hash) {
        this.logo_hash = logo_hash;
    }

    public String getDescription_annotations() {
        return description_annotations;
    }

    public void setDescription_annotations(String description_annotations) {
        this.description_annotations = description_annotations;
    }

    public String getLogo_destination_url() {
        return logo_destination_url;
    }

    public void setLogo_destination_url(String logo_destination_url) {
        this.logo_destination_url = logo_destination_url;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ClassPojo [background_hash = " + background_hash + ", is_promoted = " + is_promoted + ", background_is_animated = " + background_is_animated + ", thumbnail_hash = " + thumbnail_hash + ", description = " + description + ", display_name = " + display_name + ", is_whitelisted = " + is_whitelisted + ", total_items = " + total_items + ", accent = " + accent + ", thumbnail_is_animated = " + thumbnail_is_animated + ", followers = " + followers + ", following = " + following + ", name = " + name + ", logo_hash = " + logo_hash + ", description_annotations = " + description_annotations + ", logo_destination_url = " + logo_destination_url + ", items = " + items + "]";
    }
}
