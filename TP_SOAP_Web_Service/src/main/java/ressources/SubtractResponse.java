
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour subtractResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="subtractResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="difference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtractResponse", propOrder = {
    "difference"
})
public class SubtractResponse {

    protected int difference;

    /**
     * Obtient la valeur de la propriété difference.
     * 
     */
    public int getDifference() {
        return difference;
    }

    /**
     * Définit la valeur de la propriété difference.
     * 
     */
    public void setDifference(int value) {
        this.difference = value;
    }

}
