package mang.demo.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class Client4 {
	
	/**
	 * 本例 演示 用JaxWsDynamicClientFactory 调用webService
	 * 其不需要用工具生成客户端 只需要知道wsdl地址及调用的方法名  我感觉比较方便 但客户端里侵入了 cxf 的代码
	 * 来自 http://blog.csdn.net/zy609398738/article/details/7484331
	 * 官网参见 http://cxf.apache.org/docs/how-do-i-develop-a-client.html  关于Dynamic Client的章节
	 * */
	public static void main(String[] args) {
//		String url="http://127.0.0.1:8080/cxf-spring/services/demoService?wsdl";
		String url="http://10.4.124.57:8080/cxf-spring/services/demoService?wsdl";
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client = clientFactory.createClient(url);
		Object[] result;
		try {
			result = client.invoke("sayHello", "小天");
			System.out.println(result[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
