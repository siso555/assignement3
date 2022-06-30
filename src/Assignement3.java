//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Assignement3 {


    private static void printHello() {
        System.out.println("Hello World");
    }

    private static void printWithWhile(Integer n) {
        if (n != null && n >= 1) {
            int ans;
            for(ans = 1; n > 0; n = n - 1) {
                ans *= n;
            }

            System.out.println(ans);
        }
    }

    private static void printWithFor(int n) {
        int ans = 1;

        for(int i = 1; i < n; ++i) {
            ans *= i + 1;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        printHello();
        printWithWhile(3);
        printWithWhile(4);
        printWithFor(3);
        printWithFor(4);
    }
}
