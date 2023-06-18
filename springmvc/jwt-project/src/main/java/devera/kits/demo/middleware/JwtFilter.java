package devera.kits.demo.middleware;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class JwtFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        var req = (HttpServletRequest) request;
        var bearer = (String) Optional.ofNullable(req.getHeader("Authorization")).orElse("");

        System.out.println(bearer);

        var token = bearer.split("\s+");

        Arrays.stream(token).forEach(System.out::println);


        if (token.length < 2 || token[1] == null) {
            throw new ServletException("Missing Bearer Token");
        }

        chain.doFilter(request, response);
    }
    
}
