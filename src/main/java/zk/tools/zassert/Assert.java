package zk.tools.zassert;

import zk.tools.zassert.exception.AssertException;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/**
 * FileName: Assert
 * DateTime: 2020/9/10 0010
 * Version 1.0
 * Description:
 */
public interface Assert {

    AssertException newException();
    AssertException newException(String message);

    default Assert isNull(Object obj){
        if(obj==null){
            throw newException();
        }
        return this;
    }
    default Assert isNull(Object obj,String message){
        if(obj==null){
            throw newException(message);
        }
        return this;
    }
    default Assert isNotNull(Object obj){
        if(obj!=null){
            throw newException();
        }
        return this;
    }
    default Assert isNotNull(Object obj,String message){
        if(obj!=null){
            throw newException(message);
        }
        return this;
    }
    default Assert isEmpty(String str){
        if(str==null || str.length()==0){
            throw newException();
        }
        return this;
    }
    default Assert isEmpty(String str,String message){
        if(str==null || str.length()==0){
            throw newException(message);
        }
        return this;
    }
    default Assert isEmpty(Object[] array){
        if(array == null || array.length == 0){
            throw newException();
        }
        return this;
    }
    default Assert isEmpty(Object[] array,String message){
        if(array == null || array.length == 0){
            throw newException(message);
        }
        return this;
    }
    default Assert isEmpty(Collection<?> collection){
        if(collection == null || collection.isEmpty()){
            throw newException();
        }
        return this;
    }
    default Assert isEmpty(Collection<?> collection,String message){
        if(collection == null || collection.isEmpty()){
            throw newException(message);
        }
        return this;
    }
    default Assert isEmpty(Map<?,?> map){
        if(map == null || map.isEmpty()){
            throw newException();
        }
        return this;
    }
    default Assert isEmpty(Map<?,?> map,String message){
        if(map == null || map.isEmpty()){
            throw newException(message);
        }
        return this;
    }
    default Assert isNotEmpty(String str){
        if(str!=null && str.length() > 0){
            throw newException();
        }
        return this;
    }
    default Assert isNotEmpty(String str,String message){
        if(str!=null && str.length() > 0){
            throw newException(message);
        }
        return this;
    }
    default Assert isNotEmpty(Object[] array){
        if(array != null && array.length > 0){
            throw newException();
        }
        return this;
    }
    default Assert isNotEmpty(Object[] array,String message){
        if(array != null && array.length > 0){
            throw newException(message);
        }
        return this;
    }
    default Assert isNotEmpty(Collection<?> collection){
        if(collection != null && !collection.isEmpty()){
            throw newException();
        }
        return this;
    }
    default Assert isNotEmpty(Collection<?> collection,String message){
        if(collection != null && !collection.isEmpty()){
            throw newException(message);
        }
        return this;
    }
    default Assert isNotEmpty(Map<?,?> map){
        if(map != null && !map.isEmpty()){
            throw newException();
        }
        return this;
    }
    default Assert isNotEmpty(Map<?,?> map,String message){
        if(map != null && !map.isEmpty()){
            throw newException(message);
        }
        return this;
    }
    default Assert equals(Object d1,Object d2){
        if(d1!=null && d1.equals(d2)){
            throw newException();
        }
        return this;
    }
    default Assert equals(Object d1,Object d2,String message){
        if(d1!=null && d1.equals(d2)){
            throw newException(message);
        }
        return this;
    }
    default Assert lt(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() < ((Number) d2).doubleValue());
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) < 0);
        }
        return this;
    }
    default Assert lt(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() < ((Number) d2).doubleValue(),message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) < 0,message);
        }
        return this;
    }
    default Assert lte(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() <= ((Number) d2).doubleValue());
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) <= 0);
        }
        return this;
    }
    default Assert lte(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() <= ((Number) d2).doubleValue(),message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) <= 0,message);
        }
        return this;
    }
    default Assert gt(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() > ((Number) d2).doubleValue());
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) > 0);
        }
        return this;
    }
    default Assert gt(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() > ((Number) d2).doubleValue(),message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) > 0,message);
        }
        return this;
    }
    default Assert gte(Object d1,Object d2){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() >= ((Number) d2).doubleValue());
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) >= 0);
        }
        return this;
    }
    default Assert gte(Object d1,Object d2,String message){
        isNull(d1);
        isNull(d2);
        if(d1 instanceof Number && d2 instanceof Number){
            isTrue(((Number) d1).doubleValue() >= ((Number) d2).doubleValue(),message);
        }else{
            isTrue(new BigDecimal(d1.toString()).compareTo(new BigDecimal(d2.toString())) >= 0,message);
        }
        return this;
    }
    default Assert isTrue(Boolean val){
        if(val){
            throw newException();
        }
        return this;
    }
    default Assert isTrue(Boolean val,String message){
        if(val){
            throw newException(message);
        }
        return this;
    }
    default Assert isFalse(Boolean val){
        if(!val){
            throw newException();
        }
        return this;
    }
    default Assert isFalse(Boolean val,String message){
        if(!val){
            throw newException(message);
        }
        return this;
    }

}
