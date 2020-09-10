package zk.tools.zassert;

import zk.tools.zassert.exception.AssertException;

/**
 * @Author: Z.K
 * @FileName: Assert
 * @DateTime: 2020/9/10 0010
 * @Version 1.0
 * @Description:
 */
public interface Assert {

    AssertException newException();
    AssertException newException(String message);

    default void isNull(Object obj){
        if(obj==null){
            throw newException();
        }
    }
    default void isNull(Object obj,String message){
        if(obj==null){
            throw newException(message);
        }
    }

}
