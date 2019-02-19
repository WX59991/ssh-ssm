package me.asherli.test.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by Administrator on 2019/2/19.
 */
public class myLogInterceptor  extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("记录日志开始");
		String recode = invocation.invoke();
		System.out.println("记录日志结束");
		return recode;
	}

}
