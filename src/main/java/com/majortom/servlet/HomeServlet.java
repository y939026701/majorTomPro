package com.majortom.servlet;

import com.majortom.commons.PageBean;
import com.majortom.entity.Activity;
import com.majortom.service.impl.ActivityServer;
import com.majortom.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 李文海
 * @version 1.0
 * @desc  主页请求处理
 * @date 2020.01.02. \ 20:14
 * @copyright &copy; xuetang9
 * @address
 */
@WebServlet("/home/*")
public class HomeServlet extends HttpServlet {
    private ActivityServer activityServer = new ActivityServer();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        String op = path.substring(path.lastIndexOf("/")+1);
        if (Constant.HOME_SHOW.equals(op)){

        }
        super.service(req, resp);
    }

    private void show(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int currentPage = 1;
        int pageSize = 20;
        String strPage = request.getParameter("page");
        if (strPage!= null && strPage.matches(Constant.ENSURENUM)){
            currentPage = Integer.parseInt(strPage);
        }
        int count = activityServer.count();
        int pageCount = count%pageSize==0?count / pageSize : count / pageSize+1;
        List<Activity> activities = activityServer.queryPage((currentPage-1)*pageSize,pageSize);
        PageBean<Activity> pageBean = new PageBean<>();
        pageBean.setPageUp(currentPage-1>1?currentPage-1:1);
        pageBean.setPageDown(currentPage+1>pageCount?pageCount:currentPage+1);
        pageBean.setPageEnd(pageCount);
        pageBean.setDatas(activities);
        request.setAttribute("pageBean",pageBean);
        request.getRequestDispatcher("").forward(request,response);
    }
}
