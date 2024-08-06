package valueReferenceType;

public class Curs {

    private String descriere;
    private String titlu;
    private Integer nrCursant;

    public Curs(String descriere, String titlu, Integer nrCursant) {
        this.descriere = descriere;
        this.titlu = titlu;
        this.nrCursant = nrCursant;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Integer getNrCursant() {
        return nrCursant;
    }

    public void setNrCursant(Integer nrCursant) {
        this.nrCursant = nrCursant;
    }

    public void prezentareCurs(){
        System.out.println("Descrierea cursului este: " + descriere);
        System.out.println("Titlul cursului este: " + titlu);
        System.out.println("Nr de cursanti este: " + nrCursant);
    }

}
