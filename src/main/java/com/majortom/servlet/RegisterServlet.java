package com.majortom.servlet;


import com.majortom.entity.User;
import com.majortom.service.impl.UserService;
import com.majortom.utils.Constant;
import com.majortom.utils.Md5Tool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 李文海
 * @version 1.0
 * @desc 登录与注册,注销处理
 * @date 2020.01.01.
 * @copyright &copy; xuetang9
 * @address
 */
@WebServlet("/state/*")
public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        String op = path.substring(path.lastIndexOf("/")+1);
        if (Constant.ENTER.equals(op)){
            enter(req,resp);
        }else if (Constant.REGISTER.equals(op)){
            register(req, resp);
        }else if (Constant.LOGOUT.equals(op)){
            logout(req, resp);
        }

    }

    /**
     * 登录
     * @param request
     * @param response
     */
    private void enter(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String Md5password = Md5Tool.md5(password);
        User user = userService.queryByName(account);
        if (user!=null && Md5password.equals(user.getPassword())){
            HttpSession session = request.getSession();
            session.setAttribute("current",user);
            session.setMaxInactiveInterval(3600);
            response.sendRedirect("");
        }else {
            response.getWriter().write("false");
        }
    }

    /**
     * 注册
     * @param request
     * @param response
     */
    private void register(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String account = request.getParameter("register-account");
        String password = request.getParameter("register-password");
        String md5password = Md5Tool.md5(password);
//        验证是电话还是邮箱 前端验证了格式
//        邮箱
        User user = userService.queryByName(account);

        int type = -1;
        if (user!= null){
            response.getWriter().write("false");
        }
        if (user==null && account.contains(Constant.AT)){
            type = 1;
            toRegister(response, account, md5password, type);
        }else if (user==null){
            type = 2;
            toRegister(response, account, md5password, type);
        }


    }

    /**
     * 注销
     * @param request
     * @param response
     */
    private void logout(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("current");
//        跳转至主页
        response.sendRedirect("");
    }

    /**
     * 创建用户对象，根据注册信息保存至数据库，并根据存入状态跳转或返回信息
     * @param response
     * @param account
     * @param md5password
     * @param type
     * @throws IOException
     */
    private void toRegister(HttpServletResponse response, String account, String md5password, int type) throws IOException {
        User newUser = new User();
        if (type ==1) {
            newUser.setEmail(account);
        }else if (type ==2){
            newUser.setTel(account);
        }
        newUser.setPassword(md5password);
        boolean add = userService.add(newUser);
        if (add){
//                    重定向至的登录界面
            response.sendRedirect("");
        }else {
            response.getWriter().write("false");
        }
    }
}
//package com.majortom.servlet;
//
//
//import com.majortom.entity.User;
//import com.majortom.service.impl.UserService;
//import com.majortom.utils.Constant;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
///**
// * @author 李文海
// * @version 1.0
// * @desc 登录与注册,注销处理
// * @date 2020.01.01.
// * @copyright &copy; xuetang9
// * @address
// */
//@WebServlet("/state/*")
//public class RegisterServlet extends HttpServlet {
//    private UserService userService = new UserService();
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String path = req.getRequestURI();
//        String op = path.substring(path.lastIndexOf("/")+1);
//        if (Constant.ENTER.equals(op)){
//            enter(req,resp);
//        }else if (Constant.REGISTER.equals(op)){
//            register(req, resp);
//        }else if (Constant.LOGOUT.equals(op)){
//            logout(req, resp);
//        }
//
//    }
//
//    /**
//     * 登录
//     * @param request
//     * @param response
//     */
//    private void enter(HttpServletRequest request,HttpServletResponse response) throws IOException {
//        String account = request.getParameter("account");
//        String password = request.getParameter("password");
//        String Md5password = Md5Tool.md5(password);
//        User user = userService.queryByName(account);
//        if (user!=null && Md5password.equals(user.getPassword())){
//            HttpSession session = request.getSession();
//            session.setAttribute("current",user);
//            session.setMaxInactiveInterval(3600);
//            response.sendRedirect("");
//        }else {
//            response.getWriter().write("false");
//        }
//    }
//
//    /**
//     * 注册
//     * @param request
//     * @param response
//     */
//    private void register(HttpServletRequest request,HttpServletResponse response) throws IOException {
//        String account = request.getParameter("register-account");
//        String password = request.getParameter("register-password");
//        String md5password = Md5Tool.md5(password);
////        验证是电话还是邮箱 前端验证了格式
////        邮箱
//        User user = userService.queryByName(account);
//
//        int type = -1;
//        if (user!= null){
//            response.getWriter().write("false");
//        }
//        if (user==null && account.contains(Constant.AT)){
//            type = 1;
//            toRegister(response, account, md5password, type);
//        }else if (user==null){
//            type = 2;
//            toRegister(response, account, md5password, type);
//        }
//
//
//    }
//
//    /**
//     * 注销
//     * @param request
//     * @param response
//     */
//    private void logout(HttpServletRequest request,HttpServletResponse response) throws IOException {
//        HttpSession session = request.getSession();
//        session.removeAttribute("current");
////        跳转至主页
//        response.sendRedirect("");
//    }
//
//    /**
//     * 创建用户对象，根据注册信息保存至数据库，并根据存入状态跳转或返回信息
//     * @param response
//     * @param account
//     * @param md5password
//     * @param type
//     * @throws IOException
//     */
//    private void toRegister(HttpServletResponse response, String account, String md5password, int type) throws IOException {
//        User newUser = new User();
//        if (type ==1) {
//            newUser.setEmail(account);
//        }else if (type ==2){
//            newUser.setTel(account);
//        }
//        newUser.setPassword(md5password);
//        boolean add = userService.add(newUser);
//        if (add){
////                    重定向至的登录界面
//            response.sendRedirect("");
//        }else {
//            response.getWriter().write("false");
//        }
//    }
//}
