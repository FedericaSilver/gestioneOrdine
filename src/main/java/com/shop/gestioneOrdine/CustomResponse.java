package com.shop.gestioneOrdine;

import org.springframework.http.HttpStatus;

import javax.xml.crypto.Data;

public class CustomResponse <T>{
    private int code;
    private HttpStatus status;
    private T data;

    public CustomResponse(int code, HttpStatus status, T data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public CustomResponse(int code,HttpStatus status) {
        this.status = status;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }
}
