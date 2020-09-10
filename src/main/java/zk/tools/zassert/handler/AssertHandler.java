package zk.tools.zassert.handler;

import zk.tools.zassert.exception.AssertException;

/**
 * @Author: Z.K
 * @FileName: AssertHandler
 * @DateTime: 2020/9/10 0010
 * @Version 1.0
 * @Description:
 */
public interface AssertHandler {

    Object handleException(int code,String message,AssertException e);

}
