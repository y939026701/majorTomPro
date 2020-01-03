import com.majortom.dao.*;
import com.majortom.entity.*;
import com.majortom.utils.DBHelper;
import com.sun.javafx.iio.ImageMetadata;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class MybatisTest {


    @Test
    public void test() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        ImagesMapper mapper = sqlSession.getMapper(ImagesMapper.class);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Videos videos = new Videos(null, 3L, "安妮霍尔", "伍迪艾伦的经典作");
//        System.out.println(mapper.add(videos));
//        System.out.println(mapper.deleteById(1L, Videos.class));
        UserMapper mapper = DBHelper.getMapper(UserMapper.class);
//        System.out.println(mapper.queryFollowingByUserId(5));
        System.out.println(mapper.queryFollowingMovieGroupInfoByUserId(5));
//        System.out.println(mapper.queryCommentByUserId(5));
// User s = new User(null, "郑文斌",
//                1,30L , new Date(19970805), "16345345345",
//                "16345345345.com" ,"陕西" ,"111111199708053334" ,"胖虎" ,"123");
//        System.out.println(mapper.add(s));
//        User ss = new User(null, "李文海",
//                1,26L , new Date(19901010), "13543342134",
//                "13543342134.com" ,"江西" ,"111111199708053334" ,"蚊子" ,"123");
//        System.out.println(mapper.add(ss));
//        User sss = new User(null, "易恩雨",
//                1,26L , new Date(1997,8,5), "12165346546",
//                "12165346546.com" ,"陕西" ,"111111199708053334" ,"老易" ,"123");
//        System.out.println(mapper.add(sss));

//        System.out.println(s.getUserId());
//        System.out.println(mapper.queryIdentificationByUserId(1));
//        Images images = new Images(null, 1L, 1, "xxxxsss");
//        System.out.println(mapper.update(images));
//        System.out.println(mapper.getById(1L,Images.class));
//        System.out.println(mapper.updateByColumn(1L,Images.class,"imgUrl","ww"));
//        System.out.println(mapper.get(images));
//        System.out.println(mapper.add(images));
//        System.out.println(images.getCIId());
//        System.out.println(mapper.delete(images));
//        System.out.println(mapper.insert(s));
//        System.out.println(mapper.delete(s));
//        System.out.println(mapper.deleteById(7L, User.class));
//        System.out.println(mapper.deleteById(2L,Images.class));
//        System.out.println(mapper.get(1L,Images.class));
    }
}
