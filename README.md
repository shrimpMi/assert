# assert
断言|异常处理封装


1.引入包
<dependency>
    <groupId>zk.tools</groupId>
    <artifactId>assert</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

2.实现断言异常处理接口
@Component
public class ApiAssertHandler implements AssertHandler {

    @Override
    public Object handleException(int code, String message, AssertException e) {
        Map<String,Object> data = new HashMap<>();
        data.put("code",code);
        data.put("msg",message);
        System.out.println(data);
        return data;
    }

}

3.枚举异常类型
public enum Asserts implements ExceptionAssert {

    FAIL(1,"请求失败!"),
    ERROR(500,"请求异常"),
    INVALID_TOKEN(101,"无效的登录令牌"),
    ;

    Asserts(int code,String message){
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

4.使用例子: Asserts.FAIL.isNull(id);
@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping("/error")
    public Object error(String id){
        Asserts.FAIL.isNull(id);
        Map<String,Object> data = new HashMap<>();
        data.put("code",0);
        data.put("msg","ok");
        data.put("data",id);
        return data;
    }

}
页面返回信息:
{"msg":"请求失败!","code":1}
