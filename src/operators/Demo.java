package operators;

public class Demo {
    public static void main(String[] args) {

//        int a = 7;
//        int b = 2;
//
//        System.out.println(a + b);
//        System.out.println(a * b);
//        System.out.println(a / (double)b);
//        System.out.println(7 / 2.);
//        System.out.println(5 % 2); //5 - (2 * 2) = 1

//        int a = 5;
//        int b = -a;
//
//        System.out.println(a);
//        System.out.println(b);

//        int a = 0;
//        int b;
//
//        b = a++ + a++; // 0 + 1
//
//        System.out.println(b);
//        System.out.println(a);
//
//        int c = 20;
//        int d;
//
//        d = c-- + c++;
//
//        System.out.println(d);

//        int x, y, z;
//        x = y = z = 7;
//
//        System.out.println(y);
//
//        y += 2; // y = y + 2;
//
//        System.out.println(y);

//        int a = 5;
//        int b = 10;
//        System.out.println(a > b); //boolean equal a > b;

        // negacja !
        // iloczyn logiczny &&
        // suma logiczna ||
        // równoważność ==
        // XOR !=

//        int x = 0;
//        int y = 5;
//
//        System.out.println(x > 4 && y < 10);
//        System.out.println(x > 4 || y < 10);

//        int age = 33;
//        boolean test = !(age < 21);
//
//        System.out.println(test);


        //SYSTEM DZIESIĘTNY 0,1,2,3,4,5,6,7,8,9
        // 154 -> 1 * 10^2 + 5 * 10^1 + 4 * 10^0 = 154

        //SYSTEM DWÓJKOWY 0,1
        //101 -> 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = 4 + 1 = 5

        //SYSTEM ÓSEMKOWY 0,1,2,3,4,5,6,7
        //47 -> 4 * 8^1 + 7 * 8^0 = 32 + 7 = 39

        //SYSTEM SZESNASTKOWY 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
        //3af -> 3 * 16^3 + 10 * 16^1 + 15 * 16^0 = 943

//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toOctalString(39));
//        System.out.println(Integer.toHexString(943));
//
//        int a = 11; //00000000 00000000 00000000 00001011
//
//        System.out.println(Integer.toBinaryString(a));
//
//        int x = 0b1011;
//        System.out.println(x);
//
//        int y = 017;
//        System.out.println(y);
//
//        int z = 0xabcdef;
//        System.out.println(z);

        // & - iloczyn bitowy
        // | - suma bitowa
        // ^ - XOR
        // ~ - negacja bitowa
        // << - przesunięcie w lewo
        // >> - przesunięcie w prawo

        int a = 1;
        int b = 5;

        System.out.println(a & b);

        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));





    }
}
