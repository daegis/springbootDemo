package cn.maptrip.seat.bus.service.impl;

import cn.maptrip.seat.bus.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Using IntelliJ IDEA.
 *
 * @author HNAyd.xian at 2018/3/16 16:20
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {
    @Override
    public int getDouble(int i) {
        return i * 2;
    }
}
