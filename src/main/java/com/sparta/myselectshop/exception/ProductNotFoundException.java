package com.sparta.myselectshop.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message); // 부모쪽으로 메시지 전달
    }
}
