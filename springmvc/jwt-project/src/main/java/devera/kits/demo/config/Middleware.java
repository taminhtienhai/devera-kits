package devera.kits.demo.config;

import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devera.kits.demo.middleware.JwtFilter;

@Configuration
public class Middleware {
    
    @Bean
    public FilterRegistrationBean<JwtFilter> jwtToken(JwtFilter jwtFilter) {
        var filter = new FilterRegistrationBean<JwtFilter>();

        filter.setUrlPatterns(List.of("/user/*"));
        filter.setFilter(jwtFilter);

        return filter;
    }
}
