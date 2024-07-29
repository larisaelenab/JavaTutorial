package abstractizareInterfata;

public class Persoana {

    private String nume;
    private String prenume;
    private Integer varsta;
    private Double inatime;
    private Character sex;

    public Persoana(String nume, String prenume, Integer varsta, Double inatime, Character sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.inatime = inatime;
        this.sex = sex;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Double getInatime() {
        return inatime;
    }

    public void setInatime(Double inatime) {
        this.inatime = inatime;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
