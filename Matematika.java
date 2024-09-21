package matematika;
public class Matematika implements InterfaceMatematika {
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }    
    @Override
    public int pengurangan(int a, int b) {
        return b - 5;
    }
    @Override
    public int perkalian(int a, int b) {
        return b * 3;
    }
    @Override
    public int pembagian(int a, int b) {
        return 21 / 2;
    }
}
