package cn.maptrip.seat.bus.mapper;

import cn.maptrip.seat.bus.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Using IntelliJ IDEA.
 *
 * @author HNAyd.xian at 2018/3/19 10:29
 */
@Repository
public interface StudentMapper {
    List<Student> getAll();

    void insertSelective(Student student);
}
