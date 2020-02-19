package com.example.imgurstory.repository.remote.model.comments;

import java.util.ArrayList;

public class CommentListResponse {

    private ArrayList<CommentListData> data;
    private String success;
    private String status;

    public ArrayList<CommentListData> getData() {
        return data;
    }

    public void setData(ArrayList<CommentListData> data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClassPojo [data = " + data + ", success = " + success + ", status = " + status + "]";
    }
}
