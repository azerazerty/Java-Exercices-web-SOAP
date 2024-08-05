
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
 *         <element name="sLanguageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sLanguageName"
})
@XmlRootElement(name = "LanguageISOCode")
public class LanguageISOCode {

    @XmlElement(required = true)
    protected String sLanguageName;

    /**
     * Obtient la valeur de la propriété sLanguageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLanguageName() {
        return sLanguageName;
    }

    /**
     * Définit la valeur de la propriété sLanguageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLanguageName(String value) {
        this.sLanguageName = value;
    }

}
