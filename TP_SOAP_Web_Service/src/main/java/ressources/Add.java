
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour add complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="add">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="number1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="number2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "number1",
    "number2"
})
public class Add {

    protected int number1;
    protected int number2;

    /**
     * Obtient la valeur de la propriété number1.
     * 
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Définit la valeur de la propriété number1.
     * 
     */
    public void setNumber1(int value) {
        this.number1 = value;
    }

    /**
     * Obtient la valeur de la propriété number2.
     * 
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Définit la valeur de la propriété number2.
     * 
     */
    public void setNumber2(int value) {
        this.number2 = value;
    }

}
