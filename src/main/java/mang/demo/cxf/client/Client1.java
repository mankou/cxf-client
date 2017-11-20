package mang.demo.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;

import mang.demo.cxf.client.stub.demo.localurl.WsDemoService;
import mang.demo.cxf.client.stub.demo.localurl.WsDemoServiceService;

public class Client1 {

	/**
	 * 本例演示  用wsdl2java 生成客户端后 如何调用服务端 
	 * 注1:如下地址可通过参数传入
	 * 注2: 生成客户端的wsdl的地址 和调用的真正的wsdl的地址可以不一样  
	 * 客户端的类是通过 http://127.0.0.1:8080/cxf-spring/services/demoService?wsdl 生成的，但我调用的实际地址是 http://10.4.124.57:8080/cxf-spring/services/demoService?wsdl
	 * */
	public static void main(String[] args) {
		try {
			//注 如果你不传入url 则其用默认的地址
//			URL wsdlUrl = new URL("http://127.0.0.1:8080/cxf-spring/services/demoService?wsdl");
			URL wsdlUrl = new URL("http://10.4.124.57:8080/cxf-spring/services/demoService?wsdl");
			WsDemoServiceService wss =new WsDemoServiceService(wsdlUrl);
			WsDemoService servicePort=wss.getWsDemoServicePort();
			String result=servicePort.sayHello("小天");
			System.out.println(result);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
