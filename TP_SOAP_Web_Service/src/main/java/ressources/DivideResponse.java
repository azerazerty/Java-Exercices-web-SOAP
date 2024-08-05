
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour divideResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="divideResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="quotient" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divideResponse", propOrder = {
    "quotient"
})
public class DivideResponse {

    protected float quotient;

    /**
     * Obtient la valeur de la propriété quotient.
     * 
     */
    public float getQuotient() {
        return quotient;
    }

    /**
     * Définit la valeur de la propriété quotient.
     * 
     */
    public void setQuotient(float value) {
        this.quotient = value;
    }

}
