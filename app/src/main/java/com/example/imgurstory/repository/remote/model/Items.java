package com.example.imgurstory.repository.remote.model;

public class Items {
    private String comment_count;

    private String in_most_viral;

    private String ad_type;

    private String link;

    private String description;

    private String privacy;

    private String section;

    private String cover_height;

    private String title;

    private Ad_config ad_config;

    private String points;

    private String cover;

    private String score;

    private String datetime;

    private String favorite_count;

    private String id;

    private String topic_id;

    private String in_gallery;

    private int vote;

    private String views;

    private String include_album_ads;

    private Images[] images;

    private String downs;

    private String nsfw;

    private String is_ad;

    private String ad_url;

    private String images_count;

    private Tags[] tags;

    private String layout;

    private String account_id;

    private String cover_width;

    private String is_album;

    private String account_url;

    private String ups;

    private String topic;

    private String favorite;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getComment_count() {
        return comment_count;
    }

    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    public String getIn_most_viral() {
        return in_most_viral;
    }

    public void setIn_most_viral(String in_most_viral) {
        this.in_most_viral = in_most_viral;
    }

    public String getAd_type() {
        return ad_type;
    }

    public void setAd_type(String ad_type) {
        this.ad_type = ad_type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCover_height() {
        return cover_height;
    }

    public void setCover_height(String cover_height) {
        this.cover_height = cover_height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Ad_config getAd_config() {
        return ad_config;
    }

    public void setAd_config(Ad_config ad_config) {
        this.ad_config = ad_config;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(String favorite_count) {
        this.favorite_count = favorite_count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(String topic_id) {
        this.topic_id = topic_id;
    }

    public String getIn_gallery() {
        return in_gallery;
    }

    public void setIn_gallery(String in_gallery) {
        this.in_gallery = in_gallery;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getInclude_album_ads() {
        return include_album_ads;
    }

    public void setInclude_album_ads(String include_album_ads) {
        this.include_album_ads = include_album_ads;
    }

    public Images[] getImages() {
        return images;
    }

    public void setImages(Images[] images) {
        this.images = images;
    }

    public String getDowns() {
        return downs;
    }

    public void setDowns(String downs) {
        this.downs = downs;
    }

    public String getNsfw() {
        return nsfw;
    }

    public void setNsfw(String nsfw) {
        this.nsfw = nsfw;
    }

    public String getIs_ad() {
        return is_ad;
    }

    public void setIs_ad(String is_ad) {
        this.is_ad = is_ad;
    }

    public String getAd_url() {
        return ad_url;
    }

    public void setAd_url(String ad_url) {
        this.ad_url = ad_url;
    }

    public String getImages_count() {
        return images_count;
    }

    public void setImages_count(String images_count) {
        this.images_count = images_count;
    }

    public Tags[] getTags() {
        return tags;
    }

    public void setTags(Tags[] tags) {
        this.tags = tags;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getCover_width() {
        return cover_width;
    }

    public void setCover_width(String cover_width) {
        this.cover_width = cover_width;
    }

    public String getIs_album() {
        return is_album;
    }

    public void setIs_album(String is_album) {
        this.is_album = is_album;
    }

    public String getAccount_url() {
        return account_url;
    }

    public void setAccount_url(String account_url) {
        this.account_url = account_url;
    }

    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "ClassPojo [comment_count = " + comment_count + ", in_most_viral = " + in_most_viral + ", ad_type = " + ad_type + ", link = " + link + ", description = " + description + ", privacy = " + privacy + ", section = " + section + ", cover_height = " + cover_height + ", title = " + title + ", ad_config = " + ad_config + ", points = " + points + ", cover = " + cover + ", score = " + score + ", datetime = " + datetime + ", favorite_count = " + favorite_count + ", id = " + id + ", topic_id = " + topic_id + ", in_gallery = " + in_gallery + ", vote = " + vote + ", views = " + views + ", include_album_ads = " + include_album_ads + ", images = " + images + ", downs = " + downs + ", nsfw = " + nsfw + ", is_ad = " + is_ad + ", ad_url = " + ad_url + ", images_count = " + images_count + ", tags = " + tags + ", layout = " + layout + ", account_id = " + account_id + ", cover_width = " + cover_width + ", is_album = " + is_album + ", account_url = " + account_url + ", ups = " + ups + ", topic = " + topic + ", favorite = " + favorite + "]";
    }
}
