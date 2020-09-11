package zk.tools.zassert;

import zk.tools.zassert.exception.AssertException;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

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
    default void isNotNull(Object obj){
        if(obj!=null){
            throw newException();
        }
    }
    default void isNotNull(Object obj,String message){
        if(obj!=null){
            throw newException(message);
        }
    }
    default void isEmpty(String str){
        if(str==null || str.length()==0){
            throw newException();
        }
    }
    default void isEmpty(String str,String message){
        if(str==null || str.length()==0){
            throw newException(message);
        }
    }
    default void isEmpty(Object[] array){
        if(array == null || array.length == 0){
            throw newException();
        }
    }
    default void isEmpty(Object[] array,String message){
        if(array == null || array.length == 0){
            throw newException(message);
        }
    }
    default void isEmpty(Collection<?> collection){
        if(collection == null || collection.isEmpty()){
            throw newException();
        }
    }
    default void isEmpty(Collection<?> collection,String message){
        if(collection == null || collection.isEmpty()){
            throw newException(message);
        }
    }
    default void isEmpty(Map<?,?> map){
        if(map == null || map.isEmpty()){
            throw newException();
        }
    }
    default void isEmpty(Map<?,?> map,String message){
        if(map == null || map.isEmpty()){
            throw newException(message);
        }
    }
    default void isNotEmpty(String str){
        if(str!=null && str.length() > 0){
            throw newException();
        }
    }
    default void isNotEmpty(String str,String message){
        if(str!=null && str.length() > 0){
            throw newException(message);
        }
    }
    default void isNotEmpty(Object[] array){
        if(array != null && array.length > 0){
            throw newException();
        }
    }
    default void isNotEmpty(Object[] array,String message){
        if(array != null && array.length > 0){
            throw newException(message);
        }
    }
    default void isNotEmpty(Collection<?> collection){
        if(collection != null && !collection.isEmpty()){
            throw newException();
        }
    }
    default void isNotEmpty(Collection<?> collection,String message){
        if(collection != null && !collection.isEmpty()){
            throw newException(message);
        }
    }
    default void isNotEmpty(Map<?,?> map){
        if(map != null && !map.isEmpty()){
            throw newException();
        }
    }
    default void isNotEmpty(Map<?,?> map,String message){
        if(map != null && !map.isEmpty()){
            throw newException(message);
        }
    }
    default void equals(Object d1,Object d2){
        if(d1!=null && d1.equals(d2)){
            throw newException();
        }
    }
    default void equals(Object d1,Object d2,String message){
        if(d1!=null && d1.equals(d2)){
            throw newException(message);
        }
    }
    default void lt(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 < (double)d2);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) < 0);
        }
    }
    default void lt(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 < (double)d2,message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) < 0,message);
        }
    }
    default void lte(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 <= (double)d2);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) <= 0);
        }
    }
    default void lte(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 <= (double)d2,message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) <= 0,message);
        }
    }
    default void gt(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 > (double)d2);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) > 0);
        }
    }
    default void gt(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 > (double)d2,message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) > 0,message);
        }
    }
    default void gte(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 >= (double)d2);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) >= 0);
        }
    }
    default void gte(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue((double)d1 >= (double)d2,message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) >= 0,message);
        }
    }
    default void isTrue(Boolean val){
        if(val){
            throw newException();
        }
    }
    default void isTrue(Boolean val,String message){
        if(val){
            throw newException(message);
        }
    }
    default void isFalse(Boolean val){
        if(!val){
            throw newException();
        }
    }
    default void isFalse(Boolean val,String message){
        if(!val){
            throw newException(message);
        }
    }

}
