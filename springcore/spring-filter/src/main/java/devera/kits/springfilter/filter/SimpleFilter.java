package devera.kits.springfilter.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SimpleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("[Filter]:" + request.getRemoteHost());
        System.out.println("[Filter]:" + request.getRemotePort());
        
        filterChain.doFilter(request, response);

        System.out.println("[Filter]: After Request");

    }
    
}
