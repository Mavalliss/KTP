package com.company;

public class Main { // 1 of 6

    public static int remainder(int a, int b) { // 1. remainder of division
        return a % b;
    }

    public static double triArea(int a, int h) { // 2. square
        return (a * h) / 2.0;
    }

    public static int animals(int a, int b, int c) { // 3. all legs on farm
        int chickens = 2; // legs
        int cows = 4;
        int pigs = 4;
        return a * chickens + b * cows + c * pigs;
    }

    public static boolean profitableGamble(double prob, double prize, double pay) { // 4. check args
        return prob * prize > pay;
    }

    public static String operation(int N, int a, int b) { // 5. what should do
        if (a + b == N) return "added";
        if (a - b == N) return "subtracted";
        if (a * b == N) return "multiplied";
        if (a / b == N) return "divided";
        return "none";
    }

    public static int ctoa(char a) { // 6. char to ascii
        return (int) a;
    }

    public static int addUpTo(int a) { // 7. sum
        int res = 0;
        for (int i = 1; i <= a; i++)
            res += i;
        return res;
    }

    public static int nextEdge(int a, int b) { // 8. c site of triangle
        return a + b - 1;
    }

    public static int sumOfCubes(int[] a) { // 9. cubed sum
        int res = 0;
        for (int i = 0; i < a.length; i++)
            res += a[i] * a[i] * a[i];
        return res;
    }

    public static boolean abcmath(int a, int b, int c) { // 10. a + a b times equal c
        for (int i = 0; i < b; i++)
            a += a;
        return a % c == 0;
    }

    public static void main(String[] args) {
        System.out.println(remainder(5, 5));
        System.out.println(triArea(10, 10));
        System.out.println(animals(5, 2, 8));
        System.out.println(profitableGamble(0.9, 3.0, 2.0));
        System.out.println(operation(15, 11, 11));
        System.out.println(ctoa('\\'));
        System.out.println(addUpTo(7));
        int[] arr = new int[] {1, 5, 9};
        System.out.println(sumOfCubes(arr));
        System.out.println(abcmath(1, 2, 3));
    }
}
