
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
 *         <element name="LanguageNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "languageNameResult"
})
@XmlRootElement(name = "LanguageNameResponse")
public class LanguageNameResponse {

    @XmlElement(name = "LanguageNameResult", required = true)
    protected String languageNameResult;

    /**
     * Obtient la valeur de la propriété languageNameResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageNameResult() {
        return languageNameResult;
    }

    /**
     * Définit la valeur de la propriété languageNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageNameResult(String value) {
        this.languageNameResult = value;
    }

}
