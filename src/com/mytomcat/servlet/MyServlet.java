package com.mytomcat.servlet;

import com.mytomcat.MyRequest;
import com.mytomcat.MyResponse;

import java.util.Arrays;

public class MyServlet extends Servlet {
    @Override
    protected void doGet(MyRequest request, MyResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] roles = request.getParameterValues("role");

        response.write(username+", 您的身份是："+ Arrays.asList(roles)+ "，感谢测试MyTomcat！");
        response.setCode(200);
    }

    @Override
    protected void doPost(MyRequest request, MyResponse response) {
        doGet(request,response);
    }
}
