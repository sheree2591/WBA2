package org.example.aufgabe_2_d;

import org.example.aufgabe_2_d.Rezept.Allgemein;
import org.example.aufgabe_2_d.Rezept.*;
import org.example.aufgabe_2_d.ObjectFactory.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class Aufgabe_4_b {

  private static final String REZEPT_XML = "./Aufgabe_3_d.xml";

  public static void main(String[] args) throws JAXBException, IOException {

    ArrayList<Rezept> rezeptListe = new ArrayList<Rezept>();

    //Rezepte erstellen
    Rezept rezept1 = new Rezept();
    rezept1.getAllgemein();
    rezept1.getZutaten();
    rezept1.getZubereitung();
    rezept1.getKommentar();
    rezeptListe.add(rezept1);
    
    //Allgemeines festlegen
    Allgemein allgemein1 = new Allgemein();
    allgemein1.getTitel();
    
    //Zutaten festlegen
    Zutaten zutat1 = new Zutaten();
    zutat1.getName();
    zutat1.getAnzahl();
    zutat1.getEinheit();
    
    //Zubereitung festlegen 
    Zubereitung zubereitung1 = new Zubereitung();
    zubereitung1.getArbeitszeit();
    zubereitung1.getSchwierigkeitsgrad();
    zubereitung1.getBrennwert();
    
    //Kommentare eingeben
    Kommentar kommentar1 = new Kommentar();
    kommentar1.getName();
    kommentar1.getDatum();
    kommentar1.getUhrzeit();
    
    

   // create JAXB context and instantiate marshaller
    JAXBContext context = JAXBContext.newInstance(Rezept.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    // Write to System.out
    m.marshal(rezept1, System.out);

    // Write to File
    //m.marshal(rezept1, new FileOutputStream("src/ausgabe.xml"));
    
    Writer w = null; 
    try { 
      w = new FileWriter( "src/ausgabe.xml" ); 
      m.marshal( rezept1, w ); 
    } 
    finally { 
      try { w.close(); } catch ( Exception e ) { } 
    }

    // get variables from our xml file, created before
    System.out.println();
    System.out.println("Output from our XML File: ");
    Unmarshaller um = context.createUnmarshaller();
    Rezept r = (Rezept) um.unmarshal(new FileInputStream("src/Aufgabe_3_d.xml"));
    //ArrayList<Rezept> list = r.get();
    //for (Rezept rezepttest : list) {
        System.out.println("Rezept: ");
		System.out.println("Titel: " + r.getAllgemein() .getTitel()
        		+ 		   " \nZutaten: "+ r.getZutaten() .getName() + r.getZutaten() .getAnzahl() + r.getZutaten() .getEinheit());
				
  }
}