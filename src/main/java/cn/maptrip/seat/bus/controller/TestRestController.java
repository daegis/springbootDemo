package cn.maptrip.seat.bus.controller;

import cn.maptrip.seat.bus.service.TestService;
import cn.maptrip.seat.bus.vo.TestResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Using IntelliJ IDEA.
 *
 * @author HNAyd.xian at 2018/3/16 15:36
 */
@RestController
@Slf4j
public class TestRestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/echo/{message}")
    public TestResponse echoTest(@PathVariable String message) {
        TestResponse response = new TestResponse();
        response.setMessage(message);
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        response.setTime(format);
        log.info("响应格式：{}", JSON.toJSONString(response));
        return response;
    }

    @RequestMapping("/double/{number}")
    public String getDouble(@PathVariable Long number) {
        return String.valueOf(testService.getDouble(number.intValue()));
    }

}
