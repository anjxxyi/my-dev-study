package com.tj.edu.practice4.interceptor_filter.interceptors;

import com.tj.edu.practice4.interceptor_filter.annotations.AuthLog;
import com.tj.edu.practice4.interceptor_filter.annotations.AuthUser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Annotation;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerInterceptor.super.preHandle(request, response, handler);
        System.out.println("   - AuthInterceptor preHandle 실행");

        // request URL 문자열을 parsing 해서 특정한 url만 interceptor 후 처리가능
        request.getRequestURI();    // /authapt/...

        boolean isValidAccessAuthUserAnnotation = checkAccessValidAnnotation(handler, AuthUser.class);
        boolean isValidAccessAuthLogAnnotation = checkAccessValidAnnotation(handler, AuthLog.class);

        // AuthUser 혹은 AuthLog어노테이션이 적용된 클래스(Controller)은 통과
        if(isValidAccessAuthUserAnnotation || isValidAccessAuthLogAnnotation) {
            return true;
        }

        return false;
    }

    private boolean checkAccessValidAnnotation(Object handler, Class clazz) {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Object authUserHandlerMethod = handlerMethod.getMethodAnnotation(clazz);
        Annotation annotation = handlerMethod.getBeanType().getAnnotation(clazz);

        if (authUserHandlerMethod != null || annotation != null) {
            System.out.println("     -> Annotation Check ClassName : " + AuthUser.class.getName());
            return true;
        }
        return false;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);

        System.out.println("AuthInterceptor postHandle 실행");
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);

        System.out.println("AuthInterceptor afterCompletion 실행");
    }
}
