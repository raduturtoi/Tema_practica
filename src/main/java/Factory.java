public class Factory {
    private String tara;
    private String oras;

    public Factory(String tara, String oras){
        this.tara=tara;
        this.oras=oras;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    @Override
    public String toString(){
        return  "Fabrica {" +
                "tara=" + tara +
                ", oras=" + oras +
                '}';
    }
}
