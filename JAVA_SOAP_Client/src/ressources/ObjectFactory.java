
package ressources;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ressources package. 
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

    private final static QName _CalcDistance_QNAME = new QName("http://distservice.dz/", "CalcDistance");
    private final static QName _CalcDistanceResponse_QNAME = new QName("http://distservice.dz/", "CalcDistanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ressources
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcDistance }
     * 
     * @return
     *     the new instance of {@link CalcDistance }
     */
    public CalcDistance createCalcDistance() {
        return new CalcDistance();
    }

    /**
     * Create an instance of {@link CalcDistanceResponse }
     * 
     * @return
     *     the new instance of {@link CalcDistanceResponse }
     */
    public CalcDistanceResponse createCalcDistanceResponse() {
        return new CalcDistanceResponse();
    }

    /**
     * Create an instance of {@link Point }
     * 
     * @return
     *     the new instance of {@link Point }
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcDistance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcDistance }{@code >}
     */
    @XmlElementDecl(namespace = "http://distservice.dz/", name = "CalcDistance")
    public JAXBElement<CalcDistance> createCalcDistance(CalcDistance value) {
        return new JAXBElement<>(_CalcDistance_QNAME, CalcDistance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcDistanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcDistanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://distservice.dz/", name = "CalcDistanceResponse")
    public JAXBElement<CalcDistanceResponse> createCalcDistanceResponse(CalcDistanceResponse value) {
        return new JAXBElement<>(_CalcDistanceResponse_QNAME, CalcDistanceResponse.class, null, value);
    }

}
