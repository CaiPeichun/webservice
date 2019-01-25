
package my.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Hello", targetNamespace = "http://impl.service.my/", wsdlLocation = "http://localhost:8000/my_server/hello?wsdl")
public class Hello_Service
    extends Service
{

    private final static URL HELLO_WSDL_LOCATION;
    private final static WebServiceException HELLO_EXCEPTION;
    private final static QName HELLO_QNAME = new QName("http://impl.service.my/", "Hello");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8000/my_server/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLO_WSDL_LOCATION = url;
        HELLO_EXCEPTION = e;
    }

    public Hello_Service() {
        super(__getWsdlLocation(), HELLO_QNAME);
    }

    public Hello_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLO_QNAME, features);
    }

    public Hello_Service(URL wsdlLocation) {
        super(wsdlLocation, HELLO_QNAME);
    }

    public Hello_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLO_QNAME, features);
    }

    public Hello_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Hello_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloimplPort")
    public Hello getHelloimplPort() {
        return super.getPort(new QName("http://impl.service.my/", "HelloimplPort"), Hello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloimplPort")
    public Hello getHelloimplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.my/", "HelloimplPort"), Hello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLO_EXCEPTION!= null) {
            throw HELLO_EXCEPTION;
        }
        return HELLO_WSDL_LOCATION;
    }

}
