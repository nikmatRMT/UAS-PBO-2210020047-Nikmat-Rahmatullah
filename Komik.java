
public class Komik extends Buku {

    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void naikkanHarga() {
        double kenaikan = 5;
        setHarga(getHarga() + kenaikan);
        System.out.println("Harga komik telah dinaikkan sebesar " + kenaikan + ". Harga baru: " + getHarga());
    }
}
