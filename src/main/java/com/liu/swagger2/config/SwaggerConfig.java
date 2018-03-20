package com.liu.swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.RequestHandledEvent;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *@Project Name:springboot 
 * @author 刘佳瑞
 * @Package Name:com.liu.swagger2.config
 * @date 2018年3月20日下午8:18:32
 */
@EnableSwagger2
@Configuration
//spring自己本身的注解
//为了集成swagger2 通过
//@Import({Swagger2DocumentationConfiguration.class})
//引入了一个Swagger2DocumentationConfiguration类型的配置bean
//而这个就是swagger的核心配置，由通过EnableSwagger2 的注解
//向springContext注入了一系列的bean，并在系统启动的时候自动
//扫描系统的controller类，生成相应的api信息并且缓存起来。
//此外它还注入了一些被@Controller注解标识的controller类，
//作为ui模块访问api列表的入口
//比如swagger2Controller类。
//这个controller是ui模块中用来访问api列表的界面地址
//在访问http://127.0.0.1:8080/swagger-ui.html查看api列表时
//通过浏览器抓包就可以看到
//它是通过类似于http://localhost:8080/v2/api-docs?group=sysGroup
//这样的地址异步获取api信息(json格式)并显示到界面上
//这个地址后台对应的Controller入口就是上下文的swagger2Controller类
public class SwaggerConfig {
	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("apiGroup1")
				.apiInfo(apiInfo())
				.select()//选择哪些路径会和api生成document
				//为当前包下的api路径监控
				.apis(RequestHandlerSelectors.basePackage("com.liu.swagger2.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	public ApiInfo apiInfo() {
		ApiInfo build = new ApiInfoBuilder()
		.title("测试使用swagger2构建restfulApi")
		.contact(new Contact("liu","http://img.liujiarui.top", "15229106888@163.com"))
		.version("1.0")
		.description("Api描述")
		.build();
		return build;
	}
	
}
