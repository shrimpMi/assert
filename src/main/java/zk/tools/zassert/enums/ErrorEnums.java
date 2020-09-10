package zk.tools.zassert.enums;

import zk.tools.zassert.ExceptionAssert;

/**
 * @Author: Z.K
 * @FileName: ErrorEnums
 * @DateTime: 2020/9/10 0010
 * @Version 1.0
 * @Description:
 */
public enum ErrorEnums implements ExceptionAssert{

    FAIL(1,"请求失败!"),
    ERROR(500,"请求异常"),
    INVALID_TOKEN(101,"无效的登录令牌"),
    ;

    ErrorEnums(int code,String message){
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
