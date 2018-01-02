package com.reuters;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 * 启动类, @SpringBootApplication 指定这是一个spring boot的应用程序
 */
@SpringBootApplication
public class App extends WebMvcConfigurerAdapter
{
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    	super.configureMessageConverters(converters);
		//1.定义一个convert 转换消息的对象，
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

        //2. 添加fastJson的配置信息，比如是否格式化返回json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat
        );
        //3.convert中添加配置信息
        //4. 将convert添加到converts当中
        fastConverter.setFastJsonConfig(fastJsonConfig);
		
    	converters.add(fastConverter);
	}

	
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!  开始启动" );
        SpringApplication.run(App.class, args);
    }
}
