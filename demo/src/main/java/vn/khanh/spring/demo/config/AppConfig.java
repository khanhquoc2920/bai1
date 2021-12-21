package vn.khanh.spring.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


import vn.khanh.spring.demo.repository.InfoRepository;
import vn.khanh.spring.demo.repository.InfoRepositoryImpl;
import vn.khanh.spring.demo.repository.UserRepository;
import vn.khanh.spring.demo.repository.UserRepositoryImpl;
import vn.khanh.spring.demo.service.InfoService;
import vn.khanh.spring.demo.service.InfoServiceImpl;
import vn.khanh.spring.demo.service.UserService;
import vn.khanh.spring.demo.service.UserServiceImpl;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	    "vn.khanh.spring.demo"
	})
public class AppConfig implements WebMvcConfigurer {

	
	
	@Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Bean
    public InfoService infoService(){
        return new InfoServiceImpl();
    }

    @Bean
    public InfoRepository infoRepository(){
        return new InfoRepositoryImpl();
    }
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    @Bean
    public UserRepository  userRepository(){
        return new UserRepositoryImpl();
    }

}