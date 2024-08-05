
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
 *         <element name="LanguageISOCodeResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "languageISOCodeResult"
})
@XmlRootElement(name = "LanguageISOCodeResponse")
public class LanguageISOCodeResponse {

    @XmlElement(name = "LanguageISOCodeResult", required = true)
    protected String languageISOCodeResult;

    /**
     * Obtient la valeur de la propriété languageISOCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageISOCodeResult() {
        return languageISOCodeResult;
    }

    /**
     * Définit la valeur de la propriété languageISOCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageISOCodeResult(String value) {
        this.languageISOCodeResult = value;
    }

}
