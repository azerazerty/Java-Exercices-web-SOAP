
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour subtract complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="subtract">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="minuend" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="subtrahend" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtract", propOrder = {
    "minuend",
    "subtrahend"
})
public class Subtract {

    protected int minuend;
    protected int subtrahend;

    /**
     * Obtient la valeur de la propriété minuend.
     * 
     */
    public int getMinuend() {
        return minuend;
    }

    /**
     * Définit la valeur de la propriété minuend.
     * 
     */
    public void setMinuend(int value) {
        this.minuend = value;
    }

    /**
     * Obtient la valeur de la propriété subtrahend.
     * 
     */
    public int getSubtrahend() {
        return subtrahend;
    }

    /**
     * Définit la valeur de la propriété subtrahend.
     * 
     */
    public void setSubtrahend(int value) {
        this.subtrahend = value;
    }

}
