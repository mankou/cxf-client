package mang.demo.cxf.client.stub.demo.qname;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.spring.cxf.demo.mang/", name = "WsDemoService")
public interface WsDemoService {
	public String sayHello(String name);
}
