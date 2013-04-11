//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// €nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.10 um 04:53:11 PM CEST 
//


package org.example.aufgabe_2_d;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.aufgabe_2_d package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.aufgabe_2_d
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rezept }
     * 
     */
    public Rezept createRezept() {
        return new Rezept();
    }

    /**
     * Create an instance of {@link Rezept.Allgemein }
     * 
     */
    public Rezept.Allgemein createRezeptAllgemein() {
        return new Rezept.Allgemein();
    }

    /**
     * Create an instance of {@link Rezept.Zutaten }
     * 
     */
    public Rezept.Zutaten createRezeptZutaten() {
        return new Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Rezept.Zubereitung }
     * 
     */
    public Rezept.Zubereitung createRezeptZubereitung() {
        return new Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Rezept.Kommentar }
     * 
     */
    public Rezept.Kommentar createRezeptKommentar() {
        return new Rezept.Kommentar();
    }

}
