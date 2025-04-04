public class student {
     public String Getvorname() {
        return Vorname;
    }
    public void Setvorname(String firstname) { this.Vorname = firstname; }
    public student(String vorname, String nachname, int matrikelnummer) {
        Setvorname(vorname);
        setnachname(nachname);
        setmatrikelnummer(matrikelnummer);
    }
    public String Getnachname() {
        return Nachname;
    }
    public void setnachname(String nachname) {
        this.Nachname = nachname;
    }
    public int getmatrikelnummer() {
        return Matrikelnummer;
    }
    public void setmatrikelnummer(int matrikelnummer) {
        this.Matrikelnummer = matrikelnummer;
    }
    public void einschreiben(String kurs) {
        //
    }

    // Instanzvariablen
    private String Vorname;
    private String Nachname;
    private int Matrikelnummer;
}
