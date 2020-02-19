package com.example.imgurstory.repository.remote.model.comments;

public class CommentListData {

    private String downs;

    private String author;

    private String has_admin_badge;

    private String album_cover;

    private String platform;

    private String points;

    private String datetime;

    private String deleted;

    private String parent_id;

    private String ups;

    private String comment;

    private String on_album;

    private String id;

    private String image_id;

    private String author_id;

    private int vote;

    public String getDowns() {
        return downs;
    }

    public void setDowns(String downs) {
        this.downs = downs;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHas_admin_badge() {
        return has_admin_badge;
    }

    public void setHas_admin_badge(String has_admin_badge) {
        this.has_admin_badge = has_admin_badge;
    }

    public String getAlbum_cover() {
        return album_cover;
    }

    public void setAlbum_cover(String album_cover) {
        this.album_cover = album_cover;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOn_album() {
        return on_album;
    }

    public void setOn_album(String on_album) {
        this.on_album = on_album;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "ClassPojo [downs = " + downs + ", author = " + author + ", has_admin_badge = " + has_admin_badge + ", album_cover = " + album_cover + ", platform = " + platform + ", points = " + points + ", datetime = " + datetime + ", deleted = " + deleted + ", parent_id = " + parent_id + ", ups = " + ups + ", comment = " + comment + ", on_album = " + on_album + ", id = " + id + ", image_id = " + image_id + ", author_id = " + author_id + ", vote = " + vote + "]";
    }
}
