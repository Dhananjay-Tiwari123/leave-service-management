package com.glaFinalProject.common.response;

public class MessageDTO {
    public MessageDTO() {
    }

    private String rsp;

    public MessageDTO(String rsp) {
        this.rsp = rsp;
    }

    public String getRsp() {
        return rsp;
    }

    public void setRsp(String rsp) {
        this.rsp = rsp;
    }
}

