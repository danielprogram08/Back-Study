public class Exer44 {
    public static void main(String[] args) {
        
        double A = 200000000;
        double B = 90000000;
        int anos = 0;
        while(A <= B){
            A = A * 1.03;
            B = B * 1.015;
            anos++;
        }
        System.out.println("País A ultrapassa país B em " + anos + " anos;");
    }
}
