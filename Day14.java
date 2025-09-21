package day14coding;
public class Day14coding {
    public static void main(String[] args) {
        //Day 14 Mengubah tipe data String jadi primitif:
        String nama = "Muhammad Taufik";
        String tLahir = "Palipi";
        String U = "18";
        byte umur = Byte.parseByte(U);
        String TGL = "04";
        short tanggal = Short.parseShort(TGL);
        String BLN = "02";
        int bulan = Integer.parseInt(BLN);
        String THN = "2007";
        long tahun = Long.parseLong(THN);
        String TB = "175.0";
        float tinggi = Float.parseFloat(TB);
        String BB = "60.0";
        double berat = Double.parseDouble(BB);
        String JK = "L";
        char jenisKelamin = JK.charAt(0);
        String STATUS = "true";
        boolean status = Boolean.parseBoolean(STATUS);
        
        System.out.println("BIODATA MAHASISWA :");
        System.out.println("NAMA             : " + nama);
        System.out.println("TTL              : " + tLahir +","+ tanggal +"-"+ bulan +"-"+ tahun );
        System.out.println("TINGGI BADAN     : " + tinggi);
        System.out.println("BERAT BADAN      : " + berat);
        System.out.println("JENIS KELAMIN    : " + JK);
        System.out.println("STATUS MAHASISWA : " + status);
        
        
        
    }
    
}
