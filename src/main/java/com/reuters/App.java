package com.reuters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * 启动类, @SpringBootApplication 指定这是一个spring boot的应用程序
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!  开始启动" );
        SpringApplication.run(App.class, args);
    }
}
