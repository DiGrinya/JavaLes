public class StaticTest {
   static int i = 47;
}

class Incrementable {
    static void increment(){
        StaticTest.i++;
    }
}

