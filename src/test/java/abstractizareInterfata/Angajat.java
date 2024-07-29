package abstractizareInterfata;

public class Angajat extends Persoana implements AngajatInterface{

    public Angajat(String nume, String prenume, Integer varsta, Double inatime, Character sex) {
        super(nume, prenume, varsta, inatime, sex);
    }

    @Override
    public void mergeLaServiciu() {

    }

    @Override
    public void desfasoaraActivitatea() {

    }

    @Override
    public void beaCafea() {

    }

    @Override
    public void IncheiereActivitate() {

    }

    @Override
    public void mananca() {

    }

    @Override
    public void doarme() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void iaSalariu() {

    }
}
