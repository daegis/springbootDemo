package cn.maptrip.seat.bus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.maptrip.seat.bus.mapper")
public class BusApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusApplication.class, args);
	}
}
