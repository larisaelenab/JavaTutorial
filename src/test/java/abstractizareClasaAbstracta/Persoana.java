package abstractizareClasaAbstracta;

public abstract class Persoana {

    //recunoastem o clasa abstracta dupa cuvantul abstract
    //clasa abstracta poate sau nu sa contina metode abstracte
    //intr-o clasa abstracta putem avea un constructor -> nu putem face un obiect dintr-o clasa abstracta
    //o clasa poate mosteni doar o singura clasa/ clasa abstracta
    //o clasa abstracta poate implementa una sau mai multe interfete
    //intr-o clasa abstracta putem avea metode void sau return
    //metodele abstracte dintr-o clasa abstracta trebuie sa aiba access control

    //loadable component


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

    public abstract void mananca();

    public abstract void doarme();

    public abstract void iaPauza();

    public abstract void iaSalariu();

    public abstract void mergeLaServiciu();

    public abstract void desfasoaraActivitatea();

    public abstract void beaCafea();

    public abstract void IncheiereActivitate();

    public abstract void isiCautaDeLucru();

    public abstract void depuneCV();

    public abstract void staAcasa();

    public abstract void mergeLaFacultate();

    public abstract void invata();

    public abstract void daExamen();

    public abstract void primesteNote();

    public abstract void mergeLaRestante();

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
