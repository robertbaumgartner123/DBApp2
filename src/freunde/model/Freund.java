/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freunde.model;

/**
 *
 * @author Robert
 */
public class Freund {
    private int ID;
    private String vorname;
    private String nachname;
    private String Geburtsdatum;
    private float Größe;
    private String Bild;

    /**
     * @return the Vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @param Vorname the Vorname to set
     */
    public void setVorname(String Vorname) {
        this.vorname = Vorname;
    }

    /**
     * @return the Nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * @param Nachname the Nachname to set
     */
    public void setNachname(String Nachname) {
        this.nachname = Nachname;
    }

    /**
     * @return the Geburtsdatum
     */
    public String getGeburtsdatum() {
        return Geburtsdatum;
    }

    /**
     * @param Geburtsdatum the Geburtsdatum to set
     */
    public void setGeburtsdatum(String Geburtsdatum) {
        this.Geburtsdatum = Geburtsdatum;
    }

    /**
     * @return the Größe
     */
    public float getGröße() {
        return Größe;
    }

    /**
     * @param Größe the Größe to set
     */
    public void setGröße(float Größe) {
        this.Größe = Größe;
    }

    /**
     * @return the Bild
     */
    public String getBild() {
        return Bild;
    }

    /**
     * @param Bild the Bild to set
     */
    public void setBild(String Bild) {
        this.Bild = Bild;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}
