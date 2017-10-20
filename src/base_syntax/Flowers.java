package base_syntax;

/**
 * Created by $zhanyan on 2017/10/16.
 */
public class Flowers {
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            System.out.println(i);
            //456
            int j1 = i / 100; //456/100 = 4.56   = 4
            int j2 = (i - j1 * 100) / 10;   //456-(4*100) 456-400=56     56/10=5
            int j3 = i % 10;

            if (i == j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3) {
                System.out.println(i);
            }
        }

    }
}
