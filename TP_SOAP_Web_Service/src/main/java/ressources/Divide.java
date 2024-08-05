
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour divide complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="divide">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dividend" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="divisor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divide", propOrder = {
    "dividend",
    "divisor"
})
public class Divide {

    protected int dividend;
    protected int divisor;

    /**
     * Obtient la valeur de la propriété dividend.
     * 
     */
    public int getDividend() {
        return dividend;
    }

    /**
     * Définit la valeur de la propriété dividend.
     * 
     */
    public void setDividend(int value) {
        this.dividend = value;
    }

    /**
     * Obtient la valeur de la propriété divisor.
     * 
     */
    public int getDivisor() {
        return divisor;
    }

    /**
     * Définit la valeur de la propriété divisor.
     * 
     */
    public void setDivisor(int value) {
        this.divisor = value;
    }

}
