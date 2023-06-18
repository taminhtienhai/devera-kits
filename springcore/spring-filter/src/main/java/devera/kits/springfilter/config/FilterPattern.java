package devera.kits.springfilter.config;

import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devera.kits.springfilter.filter.GeneralFilter;
import devera.kits.springfilter.filter.SimpleFilter;

@Configuration
public class FilterPattern {

    @Bean
    public FilterRegistrationBean<SimpleFilter> filterBean() {
        var registration = new FilterRegistrationBean<SimpleFilter>();

        registration.setFilter(new SimpleFilter());
        registration.setUrlPatterns(List.of("/index/*"));

        return registration;
    }


    @Bean
    public FilterRegistrationBean<GeneralFilter> filterGeneral() {
        var registration = new FilterRegistrationBean<GeneralFilter>();

        registration.setFilter(new GeneralFilter());
        registration.setUrlPatterns(List.of("/general/*"));

        return registration;
    }
}
