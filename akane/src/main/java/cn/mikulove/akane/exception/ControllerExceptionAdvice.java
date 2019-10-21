package cn.mikulove.akane.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String,Object> exceptionHandle(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg",e.getMessage());
        return map;
    }


    @ExceptionHandler(value = ApplicationException.class)
    @ResponseBody
    public Map<String,Object> appExceptionHandle(ApplicationException ae){
        Map<String,Object> map = new HashMap<>();
        map.put("code",ae.getCode());
        map.put("msg",ae.getMessage());
        return map;
    }
}
