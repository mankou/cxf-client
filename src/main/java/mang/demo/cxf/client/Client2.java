package mang.demo.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;

import mang.demo.cxf.client.stub.demo.localwsdlfile.WsDemoService;
import mang.demo.cxf.client.stub.demo.localwsdlfile.WsDemoServiceService;

public class Client2 {

	/**
	 * 本例演示  用wsdl2java 生成客户端后 如何调用服务端 
	 * 注1:如下地址可通过参数传入
	 * 注2:客户端代码是通过本地wsdl文件生成的，但我仍然可通过传入实际的wsdl地址去调用  这就解决了别人只给wsdl文件 你如何开发客户端的问题
	 * */
	public static void main(String[] args) {
		try {
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
