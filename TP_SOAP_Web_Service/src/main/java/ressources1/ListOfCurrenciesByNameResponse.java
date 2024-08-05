
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
 *         <element name="ListOfCurrenciesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCurrency"/>
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
    "listOfCurrenciesByNameResult"
})
@XmlRootElement(name = "ListOfCurrenciesByNameResponse")
public class ListOfCurrenciesByNameResponse {

    @XmlElement(name = "ListOfCurrenciesByNameResult", required = true)
    protected ArrayOftCurrency listOfCurrenciesByNameResult;

    /**
     * Obtient la valeur de la propriété listOfCurrenciesByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public ArrayOftCurrency getListOfCurrenciesByNameResult() {
        return listOfCurrenciesByNameResult;
    }

    /**
     * Définit la valeur de la propriété listOfCurrenciesByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public void setListOfCurrenciesByNameResult(ArrayOftCurrency value) {
        this.listOfCurrenciesByNameResult = value;
    }

}
