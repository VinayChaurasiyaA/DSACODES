package LeeetCode;

public class Mincost {
//    public static void main(String[] args) {
//        //  System.out.println(prime(6,10));
//
//    }
//    static int
public static void main(String[] args) {
    int[] pos = {2,2,2,3,3};
    System.out.println(mincost(pos));

}
static  int mincost(int[] pos){
    int even_cont = 0;
    int odd_count = 0;
    for (int i : pos){
        if (i%2==0){
            even_cont++;
        }else {
            odd_count++;
        }
    }


    return Math.min(odd_count , even_cont);
}


}
