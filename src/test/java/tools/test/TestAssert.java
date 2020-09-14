package tools.test;

import zk.tools.zassert.ExceptionAssert;

/**
 Author: Z.K
 FileName: TestAssert
 DateTime: 2020/9/11 0011
 Version 1.0
 Description:
 */
public enum TestAssert implements ExceptionAssert{

    FAIL(1,"异常");

    private int code;
    private String message;

    TestAssert(int code,String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
