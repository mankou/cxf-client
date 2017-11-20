package mang.demo.cxf.client.stub.demo.localwsdlfile;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-20T10:26:30.058+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "WsDemoServiceService", 
                  wsdlLocation = "file:/c:/Users/mang/Desktop/WsDemoServiceService.wsdl",
                  targetNamespace = "http://ws.spring.cxf.demo.mang/") 
public class WsDemoServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.spring.cxf.demo.mang/", "WsDemoServiceService");
    public final static QName WsDemoServicePort = new QName("http://ws.spring.cxf.demo.mang/", "WsDemoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/c:/Users/mang/Desktop/WsDemoServiceService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WsDemoServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/c:/Users/mang/Desktop/WsDemoServiceService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WsDemoServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsDemoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsDemoServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WsDemoServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WsDemoServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WsDemoServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WsDemoService
     */
    @WebEndpoint(name = "WsDemoServicePort")
    public WsDemoService getWsDemoServicePort() {
        return super.getPort(WsDemoServicePort, WsDemoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsDemoService
     */
    @WebEndpoint(name = "WsDemoServicePort")
    public WsDemoService getWsDemoServicePort(WebServiceFeature... features) {
        return super.getPort(WsDemoServicePort, WsDemoService.class, features);
    }

}
