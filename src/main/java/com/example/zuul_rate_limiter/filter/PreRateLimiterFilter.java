package com.example.zuul_rate_limiter.filter;

import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.RateLimitKeyGenerator;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.RateLimitUtils;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.RateLimiter;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.properties.RateLimitProperties;
import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.filters.RateLimitPreFilter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UrlPathHelper;

@Component
public class PreRateLimiterFilter extends RateLimitPreFilter {


    public PreRateLimiterFilter(RateLimitProperties properties, RouteLocator routeLocator, UrlPathHelper urlPathHelper, RateLimiter rateLimiter, RateLimitKeyGenerator rateLimitKeyGenerator, RateLimitUtils rateLimitUtils) {
        super(properties, routeLocator, urlPathHelper, rateLimiter, rateLimitKeyGenerator, rateLimitUtils);
    }

    public Object run() {
        boolean exceptionFlag = false;
        try{
            super.run();

        }catch (Exception e){
            exceptionFlag = true;
            System.out.println("----------------->");
        }
        return null;
    }
}
