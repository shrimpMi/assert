package zk.tools.zassert;

/**
 * @Author: Z.K
 * @FileName: Assert
 * @DateTime: 2020/9/10 0010
 * @Version 1.0
 * @Description:
 */
public class Assert {

    public static void isNull(Object obj,String msg){
        if(obj==null){
            throw new RuntimeException(msg);
        }
    }

}
