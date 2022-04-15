public class ParentOrganization {
    private static String nume;
    private static int nrAngajati;
    private static Factory factory;

    public ParentOrganization(){
    }

    public ParentOrganization(String nume, int nrAngajati, Factory factory){
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.factory = factory;
    }


    public static String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    @Override
    public String toString(){
        return "Parent Organization{" +
                " nume=" + nume +
                ", nrAngajati=" + nrAngajati +
                ", Factory= " + factory + '\'' +
                '}';
    }
}
