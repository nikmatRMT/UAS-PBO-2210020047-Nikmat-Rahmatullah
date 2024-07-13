
public class Main {

    public static void main(String[] args) {
        String variabelString;
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();
        Komik komik = new Komik();
        Tamu tamu = new Tamu();
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku ke perpustakaan
        buku.setJudul("Judul Buku");
        komik.setJudul("Judul Komik");
        perpustakaan.tambahBuku(buku);
        perpustakaan.tambahBuku(komik);

        // Mencari buku di perpustakaan
        Buku ditemukan = perpustakaan.cariBuku("Judul Buku");
        if (ditemukan != null) {
            System.out.println("Buku ditemukan: " + ditemukan.getJudul());
        } else {
            System.out.println("Buku tidak ditemukan");
        }
    }
}
