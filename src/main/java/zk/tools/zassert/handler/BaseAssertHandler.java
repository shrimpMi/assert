package zk.tools.zassert.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import zk.tools.zassert.exception.AssertException;

/**
 Author: Z.K
 FileName: AssertHandler
 DateTime: 2020/9/10 0010
 Version 1.0
 Description:
 */
@Configuration
@RestControllerAdvice
public class BaseAssertHandler {

    @Autowired
    private AssertHandler handler;

    /**
     * 处理字段校验异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object handleException(MethodArgumentNotValidException e){
        StringBuffer msgBuffer = new StringBuffer();
        for (FieldError error : e.getBindingResult().getFieldErrors()) {
            msgBuffer.append(error.getDefaultMessage()).append("\n");
        }
        String msg = msgBuffer.toString();
        msg = msg.substring(0, msg.length() - 1);
        return handler.handleException(new AssertException(102,msg,e));
    }

    /**
     * 处理自定义异常
     */
    @ExceptionHandler(AssertException.class)
    public Object handleAssertException(AssertException e){
        return handler.handleException(e);
    }

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e){
        return handler.handleException(new AssertException(500,e.getMessage(),e));
    }
}