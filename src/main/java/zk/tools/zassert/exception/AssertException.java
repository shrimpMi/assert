package zk.tools.zassert.exception;

import zk.tools.zassert.enums.ErrorModel;

/**
 * @Author: Z.K
 * @FileName: BaseException
 * @DateTime: 2020/9/10 0010
 * @Version 1.0
 * @Description:
 */
public class AssertException extends RuntimeException {

    private int code;
    private String message;

    public AssertException() {
        super();
    }

    public AssertException(ErrorModel model) {
        super(model.getMessage());
        this.code = model.getCode();
        this.message = model.getMessage();
    }
    public AssertException(ErrorModel model,String message) {
        super(model.getMessage());
        this.code = model.getCode();
        this.message = message==null || message.length()==0 ? model.getMessage() : message;
    }

    public AssertException(int code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
