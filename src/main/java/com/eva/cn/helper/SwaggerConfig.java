package com.eva.cn.helper;

import com.eva.cn.helper.utils.ConfigUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.PathProvider;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;

/**
 * Create By ZhangSenWei on 2018/11/22
 **/
@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket swaggerSpringMvcPlugin(ServletContext servletContext){
        String host =ConfigUtil.getAttribute("swagger.host", "bg-manager");
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.eva.cn"))
                .paths(PathSelectors.any())
                .build();
                /*.pathProvider(new RelativePathProvider(servletContext){
                    @Override
                    public String getApplicationBasePath() {
                        return "/bg-manager";
                    }
                })
                .host(host);*/


    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("ARK-WEB构建restful接口api")//文档标题
                .description("此API提供接口调用")//文档说明
                .version("2.0.0").build();//版本号
    }
}
