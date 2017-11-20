package mang.demo.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import mang.demo.cxf.client.stub.demo.qname.WsDemoService;


public class Client3 {

	/**
	 * 本例演示 JAX-WS Proxy 的方式调用webService
	 *  虽然其不需要用工具生成全部的客户端代码，只需要客户端代码中的 接口类(而且接口类至少要用@webService 注解)
	 * 
	 * 来自 官网: http://cxf.apache.org/docs/how-do-i-develop-a-client.html
	 * 来自 http://cxf.apache.org/docs/how-do-i-develop-a-client.html
	 * */
	public static void main(String[] args) {
		try {
//			URL wsdlURL = new URL("http://127.0.0.1:8080/cxf-spring/services/demoService?wsdl");
			URL wsdlURL = new URL("http://10.4.124.57:8080/cxf-spring/services/demoService?wsdl");
			// namespaceURI 就是wsdl中的 targetNamespace
			// localPart 就是wsdl中的 service name
			QName SERVICE_NAME = new QName("http://ws.spring.cxf.demo.mang/", "WsDemoServiceService");
			Service service = Service.create(wsdlURL, SERVICE_NAME);
			WsDemoService client = service.getPort(WsDemoService.class);
			String result = client.sayHello("小天");
			System.out.println(result);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
