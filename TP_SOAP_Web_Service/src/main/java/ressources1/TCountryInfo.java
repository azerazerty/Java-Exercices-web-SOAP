
package ressources1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tCountryInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="tCountryInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sCapitalCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sPhoneCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sContinentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sCurrencyISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sCountryFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Languages" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftLanguage"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCountryInfo", propOrder = {
    "sisoCode",
    "sName",
    "sCapitalCity",
    "sPhoneCode",
    "sContinentCode",
    "sCurrencyISOCode",
    "sCountryFlag",
    "languages"
})
public class TCountryInfo {

    @XmlElement(name = "sISOCode", required = true)
    protected String sisoCode;
    @XmlElement(required = true)
    protected String sName;
    @XmlElement(required = true)
    protected String sCapitalCity;
    @XmlElement(required = true)
    protected String sPhoneCode;
    @XmlElement(required = true)
    protected String sContinentCode;
    @XmlElement(required = true)
    protected String sCurrencyISOCode;
    @XmlElement(required = true)
    protected String sCountryFlag;
    @XmlElement(name = "Languages", required = true)
    protected ArrayOftLanguage languages;

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

    /**
     * Obtient la valeur de la propriété sName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Définit la valeur de la propriété sName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Obtient la valeur de la propriété sCapitalCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCapitalCity() {
        return sCapitalCity;
    }

    /**
     * Définit la valeur de la propriété sCapitalCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCapitalCity(String value) {
        this.sCapitalCity = value;
    }

    /**
     * Obtient la valeur de la propriété sPhoneCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPhoneCode() {
        return sPhoneCode;
    }

    /**
     * Définit la valeur de la propriété sPhoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPhoneCode(String value) {
        this.sPhoneCode = value;
    }

    /**
     * Obtient la valeur de la propriété sContinentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSContinentCode() {
        return sContinentCode;
    }

    /**
     * Définit la valeur de la propriété sContinentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSContinentCode(String value) {
        this.sContinentCode = value;
    }

    /**
     * Obtient la valeur de la propriété sCurrencyISOCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCurrencyISOCode() {
        return sCurrencyISOCode;
    }

    /**
     * Définit la valeur de la propriété sCurrencyISOCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCurrencyISOCode(String value) {
        this.sCurrencyISOCode = value;
    }

    /**
     * Obtient la valeur de la propriété sCountryFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryFlag() {
        return sCountryFlag;
    }

    /**
     * Définit la valeur de la propriété sCountryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryFlag(String value) {
        this.sCountryFlag = value;
    }

    /**
     * Obtient la valeur de la propriété languages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public ArrayOftLanguage getLanguages() {
        return languages;
    }

    /**
     * Définit la valeur de la propriété languages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public void setLanguages(ArrayOftLanguage value) {
        this.languages = value;
    }

}
