
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
 *         <element name="sCountryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sCountryName"
})
@XmlRootElement(name = "CountryISOCode")
public class CountryISOCode {

    @XmlElement(required = true)
    protected String sCountryName;

    /**
     * Obtient la valeur de la propriété sCountryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryName() {
        return sCountryName;
    }

    /**
     * Définit la valeur de la propriété sCountryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryName(String value) {
        this.sCountryName = value;
    }

}
