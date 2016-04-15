package Interviewsamples;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyImplementor {

	public static void main(String[] args) {
		Interviewsamples.Proxy p = (Interviewsamples.Proxy) Proxy.newProxyInstance(
				Interviewsamples.Proxy.class.getClassLoader(), new Class[] { Interviewsamples.Proxy.class },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//System.out.println("Executing display method in Proxy interface ");
						if(method.getName().equals("display")){
							System.out.println("Executing display method in Proxy interface ");
						}
						if(method.getName().equals("test")){
							System.out.println("Executing test method in Proxy interface ");
						}
						return null;
					}
				});
		p.display();
		p.test();

	}

}
