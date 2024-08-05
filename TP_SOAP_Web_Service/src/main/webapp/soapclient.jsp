<%@ page import="org.apache.jasper.tagplugins.jstl.core.Catch" %>
<%@ page import="ressources1.CountryInfoService"%>
<%@ page import="ressources1.CountryInfoServiceSoapType"%>
<%@ page import="ressources1.TContinent"%>
<%@ page import="ressources1.TCountryInfo"%>
<%@ page import="ressources1.TCurrency"%>
<%@ page import="ressources1.TLanguage"%>
<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>

<%!
	// Function to convert the provided country code to uppercase
	String convertToUpperCase(String code) {
	    return code.toUpperCase(Locale.ENGLISH);
	}

    // Function to check if a country code exists
    boolean countryCodeExists(String code, CountryInfoServiceSoapType client) {
        try {
            TCountryInfo countryInfo = client.fullCountryInfo(code);
            return countryInfo != null && countryInfo.getSISOCode() != null && !countryInfo.getSISOCode().isEmpty();
        } catch (Exception e) {
            return false;
        }
    }
%>

<html>
<head>
    <title>Country Info Service</title>
</head>
<body>

<h1>Country Info Service</h1>

<%
    CountryInfoService service = new CountryInfoService();
    CountryInfoServiceSoapType client = service.getCountryInfoServiceSoap();

    // Perform operations based on user input
    String operation = request.getParameter("operation");

    if (operation != null) {
        switch (operation) {
            case "ListOfContinentsByName":
                // Example: Get the list of continents
                List<TContinent> continents = client.listOfContinentsByName().getTContinent();
                out.println("List of Continents:<br>");
                for (TContinent continent : continents) {
                    out.println(continent.getSCode() + ": " + continent.getSName() + "<br>");
                }
                break;
            case "FullCountryInfo":
                // Example: Get country information by country code
                String countryCode = request.getParameter("countryCode");
                if (countryCode != null && !countryCode.isEmpty()) {
                    countryCode = convertToUpperCase(countryCode);
                    if (countryCodeExists(countryCode, client)) {
                        TCountryInfo country = client.fullCountryInfo(countryCode);
                        if (country != null) {
                            out.println("Country Information for " + country.getSISOCode() + " (" + country.getSName() + "):<br><br>");
                            out.println("Capital City: " + country.getSCapitalCity() + "<br><br>");
                            out.println("Phone Code: +" + country.getSPhoneCode() + "<br><br>");
                            out.println("Continent: " + country.getSContinentCode() + "<br><br>");
                            out.println("Currency: " + country.getSCurrencyISOCode() + "<br><br>");
                            out.println("Languages:<br><br>");
                            List<TLanguage> languages = country.getLanguages().getTLanguage();
                            for (TLanguage language : languages) {
                                out.println(" - " + language.getSName() + " (" + language.getSISOCode() + ")<br>");
                            }
                        } else {
                            out.println("Country not found in the database.<br>");
                        }
                    } else {
                        out.println("Country Code does not exist.<br>");
                    }
                } else {
                    out.println("Country Code is required for this operation.<br>");
                }
                break;
            case "CountryCurrency":
                // Example: Get country currency by country code
                String currencyCode = request.getParameter("countryCode");
                if (currencyCode != null && !currencyCode.isEmpty()) {
                    currencyCode = convertToUpperCase(currencyCode);
                    if (countryCodeExists(currencyCode, client)) {
                        TCurrency currency = client.countryCurrency(currencyCode);
                        out.println("Country Currency for " + currencyCode + ":<br>");
                        out.println("Currency Code: " + currency.getSISOCode() + "<br>");
                        out.println("Currency Name: " + currency.getSName() + "<br>");
                    } else {
                        out.println("Country Code does not exist.<br>");
                    }
                } else {
                    out.println("Country Code is required for this operation.<br>");
                }
                break;
            default:
                out.println("Invalid operation.<br>");
        }
    } else {
        out.println("Operation is not specified.<br>");
    }
%>

</body>
</html>
