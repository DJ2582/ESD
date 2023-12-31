package com.ESD_project.esd_project.model;

public class LoginMessage {
    String message;
    Boolean status;

    Integer id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LoginMessage(String message, Boolean status, Integer id) {
        this.message = message;
        this.status = status;
        this.id = id;
    }
}
