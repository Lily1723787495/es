package cn.edu.dgut.educationalsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//开启swagger api界面
@EnableSwagger2
//开启servlet扫描->filter
@ServletComponentScan
//扫描mapper
@MapperScan("cn.edu.dgut.educationalsystem.dao")
public class EducationalsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationalsystemApplication.class, args);
    }

}
