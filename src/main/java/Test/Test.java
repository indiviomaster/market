package Test;

public class Test {
}

// 1
//class TestFive {
//    public static void main(String[] args) {
//        boolean toBe = true;
//        PrinceOfJava prince = new PrinceOfJava();
//        prince.torturePrince((toBe || !toBe));
//    }
//}
//
//class PrinceOfJava {
//    void torturePrince(boolean mind) {
//        if (mind) {
//            System.out.println("i will hate everybody");
//        } else {
//            System.out.println("i like citizen");
//        }
//    }
//}









/////////////////////
// 2
//class B {
//    public static void main(String[] args) {
//        big_loop:
//        for (int i = 0; i < 3 ; i++) {
//            try {
//                for (int j = 0; j < 3 ; j++) {
//                    if (i == j) continue;
//                    else if (i > j) continue big_loop;
//                    System.out.print("A");
//                }
//            } finally {
//                System.out.print("B");
//            }
//            System.out.print("C");
//        }
//    }
//}


//        1. AABCAABCBC
//        2. AAABCAAABCAAABC
//        3. AABCBB
//        4. ABCABCABC
//        5. AABBCACA


/////////////////////







//3 Какой будет результат выполнения кода:
//
class Main123 {
    public static void main(String[] args) {
        double d = Math.sqrt(-1);
        System.out.println(Double.NaN == d);
        d = d / 0;
        System.out.println(Double.isNaN(d));
    }
}
//
//
///////////////////////









//class T {
//    public static void main(String[] args) {
//        Integer i1 = 10;
//        Integer i2 = 10;
//
//        Double d1 = 10d;
//        Double d2 = 10d;
//
//        System.out.println(i1 == i2);
//        System.out.println(d1 == d2);
//    }
//}


//4 Какой результат выполнения данного кода:
//        Integer i1 = 10; 
//        Integer i2 = 10; 
//                    
//        Double d1 = 10d; 
//        Double d2 = 10d; 
//         
//        System.out.println(i1 == i2); 
//        System.out.println(d1 == d2); 



//////////////






// 5
//class C {
//    public void process() {
//        System.out.println("C ");
//    }
//}
//
//class D extends C {
//    public void process() throws RuntimeException {
//        super.process();
//        if(true) throw new RuntimeException();
//        System.out.println("D ");
//    }
//
//    public static void main(String[] args) {
//        try {
//            ((C)new D()).process();
//        } catch (Exception e) {
//            System.out.println("Exception print");
//        }
//    }
//}

////////////////















// 6

//class E {
//    public static void main(String[] args) {
//        System.out.println((-(byte)128)>>> 1 == 128 >>> 1);
//        System.out.println(128 >>> 1);
//    }
//}


/////////////










// 7 ---------------------
//class Test2 {
//    static void method(int... a) {
//        System.out.println("inside int...");
//    }
//
//    static void method(long a, long b) {
//        System.out.println("inside long");
//    }
//
//    static void method(Integer a, Integer b) {
//        System.out.println("inside INTEGER");
//    }
//
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        method(a,b);
//    }
//}
// ------------------------------



/////////





