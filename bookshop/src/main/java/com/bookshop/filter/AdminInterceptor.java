package com.bookshop.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.bookshop.domain.Member;


public class AdminInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    	String requestURI = request.getRequestURI();
    	
        // /sales/ ��ο� ���� ���� ó��
        if(requestURI.startsWith(request.getContextPath() + "/sales/")) {
            return true;
        }

        HttpSession session = request.getSession();
        Member ses = (Member) session.getAttribute("cus");
        
        if(session.getAttribute("cus")==null) { //�α����� ���� ���� ���
            response.sendRedirect(request.getContextPath()+"/member/login.do");
            return false;
        }
        
        if(ses.getId().equals("admin")){ //������(admin) ������ ��� (/admin/**) ���� ����
            return true;
        } else { //������(admin) ������ �ƴ� ���
            response.sendRedirect(request.getContextPath()+"/member/login.do");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}