package com.example.imgurstory.repository.remote.model.catagory_response;

import java.util.ArrayList;

public class CatagoryListResponse {

    private ArrayList<ImageListData> data;
    private String success;
    private String status;

    public ArrayList<ImageListData> getData() {
        return data;
    }

    public void setData(ArrayList<ImageListData> data) {
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