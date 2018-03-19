package cn.maptrip.seat.bus;

import cn.maptrip.seat.bus.mapper.StudentMapper;
import cn.maptrip.seat.bus.model.Student;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void contextLoads() {
        List<Student> all = studentMapper.getAll();
        all.stream().forEach(student -> {
            System.out.println(JSON.toJSONString(student));
        });
    }

    @Test
    public void testInsert() {
        Student student = new Student();
        student.setName("李小鑫");
        student.setScore(666);
        student.setJoinTime(LocalDateTime.now());
        studentMapper.insertSelective(student);
    }

}
