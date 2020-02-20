package com.example.imgurstory.repository.remote.model.catagory_response;

import java.util.ArrayList;

public class CatagoryListResponse {

    private ArrayList<ImageData> data;
    private String success;
    private String status;

    public ArrayList<ImageData> getData() {
        return data;
    }

    public void setData(ArrayList<ImageData> data) {
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