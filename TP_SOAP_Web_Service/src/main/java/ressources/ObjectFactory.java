
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

    private final static QName _Add_QNAME = new QName("http://example.dz/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://example.dz/", "addResponse");
    private final static QName _Divide_QNAME = new QName("http://example.dz/", "divide");
    private final static QName _DivideResponse_QNAME = new QName("http://example.dz/", "divideResponse");
    private final static QName _Multiply_QNAME = new QName("http://example.dz/", "multiply");
    private final static QName _MultiplyResponse_QNAME = new QName("http://example.dz/", "multiplyResponse");
    private final static QName _Subtract_QNAME = new QName("http://example.dz/", "subtract");
    private final static QName _SubtractResponse_QNAME = new QName("http://example.dz/", "subtractResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ressources
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     * @return
     *     the new instance of {@link Add }
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     * @return
     *     the new instance of {@link AddResponse }
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     * @return
     *     the new instance of {@link Divide }
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     * @return
     *     the new instance of {@link DivideResponse }
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     * @return
     *     the new instance of {@link Multiply }
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     * @return
     *     the new instance of {@link MultiplyResponse }
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     * @return
     *     the new instance of {@link Subtract }
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     * @return
     *     the new instance of {@link SubtractResponse }
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.dz/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

}
