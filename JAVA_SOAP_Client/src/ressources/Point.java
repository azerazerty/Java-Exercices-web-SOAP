
package ressources;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour point complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="point">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "point", propOrder = {
    "x",
    "y"
})
public class Point {

    protected int x;
    protected int y;

    /**
     * Obtient la valeur de la propriété x.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Définit la valeur de la propriété x.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Obtient la valeur de la propriété y.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Définit la valeur de la propriété y.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

}
