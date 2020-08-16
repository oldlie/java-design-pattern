package com.oldlie.learning.java.designparrent.chainofresponsibility;

/**
 * 责任链模式，配置好链路之后依次调用
 */
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("auth");
        BusinessHandler businessHandler = new BusinessHandler("business");
        ResponseHandler responseHandler = new ResponseHandler("response");
        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(responseHandler);
        authHandler.operator();
    }
}
