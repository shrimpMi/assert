package zk.tools.zassert;

import zk.tools.zassert.enums.ErrorModel;
import zk.tools.zassert.exception.AssertException;

/**
 * @Author: Z.K
 * @FileName: ExceptionAssert
 * @DateTime: 2020/9/10 0010
 * @Version 1.0
 * @Description:
 */
public interface ExceptionAssert extends ErrorModel,Assert {

    default AssertException newException(){
        return new AssertException(this);
    }
    default AssertException newException(String message){
        return new AssertException(this,message);
    }

}
