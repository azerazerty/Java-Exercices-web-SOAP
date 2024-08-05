
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CalcDistance complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="CalcDistance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="arg0" type="{http://distservice.dz/}point" minOccurs="0"/>
 *         <element name="arg1" type="{http://distservice.dz/}point" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcDistance", propOrder = {
    "arg0",
    "arg1"
})
public class CalcDistance {

    protected Point arg0;
    protected Point arg1;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setArg0(Point value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setArg1(Point value) {
        this.arg1 = value;
    }

}
