package com.it.springzuul;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class TokenFilter extends ZuulFilter{

	//过滤器是否生效
	@Override
	public boolean shouldFilter() {
		return true;
	}

	//业务代码逻辑
	@Override
	public Object run() throws ZuulException {
		
		//获取上下
		RequestContext currentContext = RequestContext.getCurrentContext();
		
		//获取request
		HttpServletRequest  request = currentContext.getRequest();
		
		String token =request.getHeader("token");
		
		if(StringUtils.isEmpty(token)) {
			currentContext.setSendZuulResponse(false);
			currentContext.setResponseBody("token is error");
			currentContext.setResponseStatusCode(401);
			return null;
		}
		
		//正常执行
		return null;
	}

	//过滤器类型pre 表示在请求之前执行
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	//过滤器执行顺序，当一个请求在同一个时候存在多个过滤器的时候，多个过滤器按顺序执行
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
