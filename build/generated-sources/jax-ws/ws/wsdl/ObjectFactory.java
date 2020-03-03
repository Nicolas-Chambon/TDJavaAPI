
package ws.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://aviation.ws/", "hello");
    private final static QName _GetStation_QNAME = new QName("http://aviation.ws/", "GetStation");
    private final static QName _GetStationResponse_QNAME = new QName("http://aviation.ws/", "GetStationResponse");
    private final static QName _JAXBException_QNAME = new QName("http://aviation.ws/", "JAXBException");
    private final static QName _HelloResponse_QNAME = new QName("http://aviation.ws/", "helloResponse");
    private final static QName _MalformedURLException_QNAME = new QName("http://aviation.ws/", "MalformedURLException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link GetStation }
     * 
     */
    public GetStation createGetStation() {
        return new GetStation();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetStationResponse }
     * 
     */
    public GetStationResponse createGetStationResponse() {
        return new GetStationResponse();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviation.ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviation.ws/", name = "GetStation")
    public JAXBElement<GetStation> createGetStation(GetStation value) {
        return new JAXBElement<GetStation>(_GetStation_QNAME, GetStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviation.ws/", name = "GetStationResponse")
    public JAXBElement<GetStationResponse> createGetStationResponse(GetStationResponse value) {
        return new JAXBElement<GetStationResponse>(_GetStationResponse_QNAME, GetStationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviation.ws/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviation.ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviation.ws/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

}
