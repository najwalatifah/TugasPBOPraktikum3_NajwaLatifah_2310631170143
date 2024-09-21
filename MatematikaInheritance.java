package matematika;

public class MatematikaInheritance {
    public static void main(String[]args) {
        Matematika matematika = new Matematika();
        int a = 20;
        int b = 10;
        
      
      int HasilPertambahan = matematika.pertambahan(a, b);
        int HasilPengurangan = matematika.pengurangan(a, b);
        int HasilPerkalian = matematika.perkalian(a, b);
        int HasilPembagian = matematika.pembagian(21, 2);

        System.out.println("Pertambahan : " + a + " + " + b + " = " + HasilPertambahan);
        System.out.println("Pengurangan : " + b + " - " + 5 + " = " + HasilPengurangan);
        System.out.println("Perkalian : " + b + " * " + 3 + " = " + HasilPerkalian);
        System.out.println("Pembagian : " + 21 + " / " + 2 + " = " + HasilPembagian);

      Matematika2 matematika2 = new Matematika2();
      int HasilModulus = matematika2.modulus(a, b);
      
      System.out.println("Modulus : " + a + " % " + b + " = " + HasilModulus);
    }
}
