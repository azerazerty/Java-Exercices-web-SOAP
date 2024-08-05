
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour multiply complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="multiply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="factor1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="factor2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiply", propOrder = {
    "factor1",
    "factor2"
})
public class Multiply {

    protected int factor1;
    protected int factor2;

    /**
     * Obtient la valeur de la propriété factor1.
     * 
     */
    public int getFactor1() {
        return factor1;
    }

    /**
     * Définit la valeur de la propriété factor1.
     * 
     */
    public void setFactor1(int value) {
        this.factor1 = value;
    }

    /**
     * Obtient la valeur de la propriété factor2.
     * 
     */
    public int getFactor2() {
        return factor2;
    }

    /**
     * Définit la valeur de la propriété factor2.
     * 
     */
    public void setFactor2(int value) {
        this.factor2 = value;
    }

}
