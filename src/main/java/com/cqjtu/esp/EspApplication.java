package com.cqjtu.esp;

import com.cqjtu.esp.config.FileProperties;
import com.cqjtu.esp.config.SecurityProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Spring Boot 入口
 *
 * @author suwen
 * @date 2020/2/21 下午3:29
 */
@MapperScan(basePackages = {"com.cqjtu.esp.mapper"})
@SpringBootApplication
@EnableConfigurationProperties({FileProperties.class, SecurityProperties.class})
public class EspApplication {

  public static void main(String[] args) {
    SpringApplication.run(EspApplication.class, args);
  }
}
