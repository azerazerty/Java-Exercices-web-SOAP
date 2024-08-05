
package ressources1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sisoCode"
})
@XmlRootElement(name = "LanguageName")
public class LanguageName {

    @XmlElement(name = "sISOCode", required = true)
    protected String sisoCode;

    /**
     * Obtient la valeur de la propriété sisoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISOCode() {
        return sisoCode;
    }

    /**
     * Définit la valeur de la propriété sisoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISOCode(String value) {
        this.sisoCode = value;
    }

}
