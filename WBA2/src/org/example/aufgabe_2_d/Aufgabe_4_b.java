package org.example.aufgabe_2_d;

import org.example.aufgabe_2_d.Rezept.*;
import org.example.aufgabe_2_d.ObjectFactory.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    Zutaten zutat2 = new Zutaten();
    zutat2.getName();
    zutat2.getAnzahl();
    zutat2.getEinheit();
    
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

    /*// Write to File
    m.marshal(rezept1, new FileOutputStream("src/ausgabe.xml"));
    
    Writer w = null; 
    try { 
      w = new FileWriter( "src/ziel.xml" ); 
      m.marshal( rezept1, w );
    } 
    finally { 
      try { w.close(); } 
      catch ( Exception e ) { } 
    } */

    // get variables from our xml file, created before
    System.out.println();
    System.out.println("Output from our XML File: ");
    Unmarshaller um = context.createUnmarshaller();
    Rezept r = (Rezept) um.unmarshal(new FileInputStream("src/Aufgabe_3_d.xml"));
    //ArrayList<Rezept> list = r.get();
    //for (Rezept r : list) {
   
		System.out.println("Rezept: " + r.getAllgemein() .getTitel()
        		+ 		   " \nZutaten: "+ r.getZutaten() .getName() + r.getZutaten() .getAnzahl() + r.getZutaten() .getEinheit()
        		+ 		   "\nZubereitungszeit:"+ r.getZubereitung() .getArbeitszeit() 
        		+ 		   "\nSchwierigkeitsgrad:" + r.getZubereitung() .getSchwierigkeitsgrad() 
        		+ 		   "\nBrennwert pro Person:" + r.getZubereitung() .getBrennwert() 
        		+ 		   "\nZubereitung:" + r.getZubereitung() .getBeschreibung()
        		+ 		   "\n\nKommentare" 
        		+ 		   "\nName:" + r.getKommentar() .getName()
        		+ 		   "\nDatum:" + r.getKommentar() .getDatum()
        		+ 		   "\nUhrzeit:" + r.getKommentar() .getUhrzeit()
        		+ 		   "\nNachricht:" + r.getKommentar() .getText()
				);
		
		
		/* // neuen Kommentar einfügen
	    r.getKommentar().add("Neuer Kommentar");
	    
	    ArrayList<Rezept> kommentarListe = new ArrayList<Rezept>();
	    
	    // jeweilige Merkmale des Kommentars
	    Kommentar k = new Kommentar();
	    k.setName("Sheree"); 
		/*k.setDatum(02.05.1991);
	    p.setFoto("http://nichts.com/foto.png");
	    p.setEmail("wer@wo.hier"); 
	    //kommentarListe.add(k);
        
	    System.out.println("   " + k.getName());
	    
	 // XML Datei aus Java Objekten
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    //m.marshal(b, System.out);
		m.marshal(k, new FileOutputStream("src/ziel.xml"));
	    
	     // Suche Abstimmer mit ID=person1 und √§ndere den Namen auf "Manuel Kempf"
	    List<Persontype> personen = b.getAbstimmer().getPerson();
	    for(int i = 0; i < personen.size(); i++) {
	    	if ( personen.get(i).getId().equals("person1") ) {
	    		personen.get(i).setValue("Manuel Kempf");
	    	}
	    }			*/	
  }
}
