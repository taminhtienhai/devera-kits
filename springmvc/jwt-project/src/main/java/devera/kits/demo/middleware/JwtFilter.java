package devera.kits.demo.middleware;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import devera.kits.demo.error.UnAuthorization;
import devera.kits.demo.service.JwtService;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    JwtService jwt;

    // @Override
    // public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    //     var req = (HttpServletRequest) request;
    //     var bearer = (String) Optional.ofNullable(req.getHeader("Authorization")).orElse("");

    //     System.out.println(bearer);

    //     var token = bearer.split("\s+");

    //     Arrays.stream(token).forEach(System.out::println);


    //     if (token.length < 2 || token[1] == null) {
    //         throw new ServletException("Missing Bearer Token");
    //     }

    //     chain.doFilter(request, response);
    // }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        var req = (HttpServletRequest) request;
        var bearer = (String) Optional.ofNullable(req.getHeader("Authorization")).orElse("");

        var token = bearer.split("\s+");

        if (token.length < 2 || token[1] == null) {
            throw new UnAuthorization("Missing Bearer Token");
        }

        var decoded = jwt.verify(token[1]);

        if (Objects.isNull(decoded)) {
            throw new UnAuthorization("Invalid token");
        }

        filterChain.doFilter(request, response);
    }
    
}
