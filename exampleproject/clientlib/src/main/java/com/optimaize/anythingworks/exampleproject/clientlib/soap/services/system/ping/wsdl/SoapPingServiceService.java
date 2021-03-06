
package com.optimaize.anythingworks.exampleproject.clientlib.soap.services.system.ping.wsdl;

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
@WebServiceClient(name = "SoapPingServiceService", targetNamespace = "http://ping.system.soap.services.server.exampleproject.anythingworks.optimaize.com/", wsdlLocation = "http://localhost:80/soap/v1/system/ping?wsdl")
public class SoapPingServiceService
    extends Service
{

    private final static URL SOAPPINGSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPPINGSERVICESERVICE_EXCEPTION;
    private final static QName SOAPPINGSERVICESERVICE_QNAME = new QName("http://ping.system.soap.services.server.exampleproject.anythingworks.optimaize.com/", "SoapPingServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:80/soap/v1/system/ping?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPPINGSERVICESERVICE_WSDL_LOCATION = url;
        SOAPPINGSERVICESERVICE_EXCEPTION = e;
    }

    public SoapPingServiceService() {
        super(__getWsdlLocation(), SOAPPINGSERVICESERVICE_QNAME);
    }

    public SoapPingServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPPINGSERVICESERVICE_QNAME, features);
    }

    public SoapPingServiceService(URL wsdlLocation) {
        super(wsdlLocation, SOAPPINGSERVICESERVICE_QNAME);
    }

    public SoapPingServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPPINGSERVICESERVICE_QNAME, features);
    }

    public SoapPingServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapPingServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SoapPingService
     */
    @WebEndpoint(name = "SoapPingServicePort")
    public SoapPingService getSoapPingServicePort() {
        return super.getPort(new QName("http://ping.system.soap.services.server.exampleproject.anythingworks.optimaize.com/", "SoapPingServicePort"), SoapPingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapPingService
     */
    @WebEndpoint(name = "SoapPingServicePort")
    public SoapPingService getSoapPingServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ping.system.soap.services.server.exampleproject.anythingworks.optimaize.com/", "SoapPingServicePort"), SoapPingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPPINGSERVICESERVICE_EXCEPTION!= null) {
            throw SOAPPINGSERVICESERVICE_EXCEPTION;
        }
        return SOAPPINGSERVICESERVICE_WSDL_LOCATION;
    }

}
