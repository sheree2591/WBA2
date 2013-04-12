//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.10 um 04:53:11 PM CEST 
//


package org.example.aufgabe_2_d;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allgemein">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="zutaten" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Zutaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Zubereitung">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="schwierigkeitsgrad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Kommentar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="uhrzeit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="antwort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="text_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allgemein",
    "zutaten",
    "zubereitung",
    "kommentar"
})
@XmlRootElement(name = "rezept")
public class Rezept {

    @XmlElement(name = "Allgemein", required = true)
    protected Rezept.Allgemein allgemein;
    @XmlElement(name = "Zutaten", required = true)
    protected Rezept.Zutaten zutaten;
    @XmlElement(name = "Zubereitung", required = true)
    protected Rezept.Zubereitung zubereitung;
    @XmlElement(name = "Kommentar", required = true)
    protected Rezept.Kommentar kommentar;

    /**
     * Ruft den Wert der allgemein-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezept.Allgemein }
     *     
     */
    public Rezept.Allgemein getAllgemein() {
        return allgemein;
    }

    /**
     * Legt den Wert der allgemein-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezept.Allgemein }
     *     
     */
    public void setAllgemein(Rezept.Allgemein value) {
        this.allgemein = value;
    }

    /**
     * Ruft den Wert der zutaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezept.Zutaten }
     *     
     */
    public Rezept.Zutaten getZutaten() {
        return zutaten;
    }

    /**
     * Legt den Wert der zutaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezept.Zutaten }
     *     
     */
    public void setZutaten(Rezept.Zutaten value) {
        this.zutaten = value;
    }

    /**
     * Ruft den Wert der zubereitung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezept.Zubereitung }
     *     
     */
    public Rezept.Zubereitung getZubereitung() {
        return zubereitung;
    }

    /**
     * Legt den Wert der zubereitung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezept.Zubereitung }
     *     
     */
    public void setZubereitung(Rezept.Zubereitung value) {
        this.zubereitung = value;
    }

    /**
     * Ruft den Wert der kommentar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezept.Kommentar }
     *     
     */
    public Rezept.Kommentar getKommentar() {
        return kommentar;
    }

    /**
     * Legt den Wert der kommentar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezept.Kommentar }
     *     
     */
    public void setKommentar(Rezept.Kommentar value) {
        this.kommentar = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="zutaten" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titel",
        "zutaten",
        "kommentar"
    })
    public static class Allgemein {

        @XmlElement(required = true)
        protected String titel;
        @XmlElement(required = true)
        protected String zutaten;
        @XmlElement(required = true)
        protected String kommentar;

        /**
         * Ruft den Wert der titel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitel() {
            return titel;
        }

        /**
         * Legt den Wert der titel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitel(String value) {
            this.titel = value;
        }

        /**
         * Ruft den Wert der zutaten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZutaten() {
            return zutaten;
        }

        /**
         * Legt den Wert der zutaten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZutaten(String value) {
            this.zutaten = value;
        }

        /**
         * Ruft den Wert der kommentar-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKommentar() {
            return kommentar;
        }

        /**
         * Legt den Wert der kommentar-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKommentar(String value) {
            this.kommentar = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="uhrzeit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="antwort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="text_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "datum",
        "uhrzeit",
        "text",
        "antwort",
        "text2"
    })
    public static class Kommentar {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected Date datum;
        @XmlElement(required = true)
        protected BigInteger uhrzeit;
        @XmlElement(required = true)
        protected String text;
        @XmlElement(required = true)
        protected String antwort;
        @XmlElement(name = "text_2", required = true)
        protected String text2;

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der datum-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public Date getDatum() {
            return datum;
        }

        /**
         * Legt den Wert der datum-Eigenschaft fest.
         * 
         * @param d
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatum(Date d) {
            this.datum = d;
        }

        /**
         * Ruft den Wert der uhrzeit-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUhrzeit() {
            return uhrzeit;
        }

        /**
         * Legt den Wert der uhrzeit-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUhrzeit(BigInteger value) {
            this.uhrzeit = value;
        }

        /**
         * Ruft den Wert der text-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Legt den Wert der text-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Ruft den Wert der antwort-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAntwort() {
            return antwort;
        }

        /**
         * Legt den Wert der antwort-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAntwort(String value) {
            this.antwort = value;
        }

        /**
         * Ruft den Wert der text2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText2() {
            return text2;
        }

        /**
         * Legt den Wert der text2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText2(String value) {
            this.text2 = value;
        }

		public void add(String string) {
			String value = null;
			this.text = value;
			
		}

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="schwierigkeitsgrad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "arbeitszeit",
        "schwierigkeitsgrad",
        "brennwert",
        "beschreibung"
    })
    public static class Zubereitung {

        @XmlElement(required = true)
        protected BigInteger arbeitszeit;
        @XmlElement(required = true)
        protected String schwierigkeitsgrad;
        @XmlElement(required = true)
        protected BigInteger brennwert;
        @XmlElement(required = true)
        protected String beschreibung;

        /**
         * Ruft den Wert der arbeitszeit-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getArbeitszeit() {
            return arbeitszeit;
        }

        /**
         * Legt den Wert der arbeitszeit-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setArbeitszeit(BigInteger value) {
            this.arbeitszeit = value;
        }

        /**
         * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchwierigkeitsgrad() {
            return schwierigkeitsgrad;
        }

        /**
         * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchwierigkeitsgrad(String value) {
            this.schwierigkeitsgrad = value;
        }

        /**
         * Ruft den Wert der brennwert-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrennwert() {
            return brennwert;
        }

        /**
         * Legt den Wert der brennwert-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrennwert(BigInteger value) {
            this.brennwert = value;
        }

        /**
         * Ruft den Wert der beschreibung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Legt den Wert der beschreibung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="einheit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "anzahl",
        "einheit"
    })
    public static class Zutaten {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected BigInteger anzahl;
        @XmlElement(required = true)
        protected String einheit;

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der anzahl-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAnzahl() {
            return anzahl;
        }

        /**
         * Legt den Wert der anzahl-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAnzahl(BigInteger value) {
            this.anzahl = value;
        }

        /**
         * Ruft den Wert der einheit-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEinheit() {
            return einheit;
        }

        /**
         * Legt den Wert der einheit-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEinheit(String value) {
            this.einheit = value;
        }

    }

}
