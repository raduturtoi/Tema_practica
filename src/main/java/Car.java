public class Car extends ParentOrganization {
    private String marca;
    private String model;
    private int anFabricatie;

    public Car(){}

  @Override
    public void setNume(String nume){
         super.setNume(nume);
    }

    public Car(String marca, String model, int anFabricatie){
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.setNume(ParentOrganization.getNume());
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }


}
