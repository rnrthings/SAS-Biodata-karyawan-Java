public class Main {
    public static void main(String[] args) {
        PegawaiTetap tetap = new PegawaiTetap("Djiebran Sugianto", 30, "Software Engineer");
        PegawaiKontrak kontrak = new PegawaiKontrak("Maliq Abrahim", 25, "IT Support");

        System.out.println("=== Data Pegawai Tetap ===");
        System.out.println("Nama    : " + tetap.getNama());
        System.out.println("Usia    : " + tetap.getUsia());
        System.out.println("Jabatan : " + tetap.getJabatan());
        tetap.deskripsiKerja();

        System.out.println();

        System.out.println("=== Data Pegawai Kontrak ===");
        System.out.println("Nama    : " + kontrak.getNama());
        System.out.println("Usia    : " + kontrak.getUsia());
        System.out.println("Jabatan : " + kontrak.getJabatan());
        kontrak.deskripsiKerja();
    }
}