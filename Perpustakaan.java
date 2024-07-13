
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {

    private List<Buku> koleksiBuku;

    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        this.koleksiBuku.add(buku);
        System.out.println("Buku telah ditambahkan ke perpustakaan: " + buku.getJudul());
    }

    public Buku cariBuku(String judul) {
        for (Buku buku : this.koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}
