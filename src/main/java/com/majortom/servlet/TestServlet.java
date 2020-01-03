package servilet;


import com.majortom.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author 郑文斌Mz
 * @version 1.0.0
 * @date 2020/1/210:26
 * @copyright &copy; <a href="http://www.xuetang9.com">老九学堂</a> 版权所有
 * @address 成都市西部国际金融中心2栋2201老九学堂
 */
@WebServlet("/tlt")
public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        User user = new User();
        user.setUserId(1L);
        user.setUserName("舔男阿正");
        req.setAttribute("user",user);
        req.getRequestDispatcher(req.getContextPath()+"/jsp/nav.jsp").forward(req,resp);
    }
}
