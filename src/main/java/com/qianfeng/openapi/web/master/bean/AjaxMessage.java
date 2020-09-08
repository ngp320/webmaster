package com.qianfeng.openapi.web.master.bean;

public class AjaxMessage {
    private boolean status;
    private String message;
    private Object result;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public AjaxMessage() {
    }
    public AjaxMessage(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public AjaxMessage(boolean status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }
}
