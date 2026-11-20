public class FIle1 {
    /*
    String are immutable in java.
    We can declare the String in java in two ways

    1.as literal
    2.using new keyword

    Literal enables String pool(some part in Heap memory).
    ex : s1 = "hello";
         s2 = "hello";
         s3 = "hello";
         sout(s1==s2==s3);//all are same (string pool reuses the same string)
         basically we are sharing the references with the help of string pool using literal approach
    "Using the new Keyword"
    We never share the same references even if both the strings are same..
    Every string has its own reference.


     */
    public static void main(String[] args) {
//        String greet = new String("Hello");
//       // greet.concat("Noorul");
//        System.out.println(greet);
//        String s1 ="Hello";
//        s1 = s1.concat(" Noorul");
//        System.out.println(s1);

//        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2); //Pool sharing
//        String s3 = new String("hello");
//        String s4 = new String("hello");
//        System.out.println(s3 == s4);//No Saring of references.

        String s1 = "Ja" + "va";
        String s2 ="Java";
        //System.out.println(s1 == s2);
        String s3 = "hello";
        String s4 = s3 +" world";
        String s5 = "hello world";
        //string pool -->hello , world, hello world
        //Heap --> hello world;
        //System.out.println(s4 == s5);
        String s6 = "Hello";
        String s7 = s6;
        //System.out.println(s6 == s7);
        String s8 = "Hello";
        s8 = "World";
        //System.out.println(s8);
        String s9 = new String("hello");
        String s10 = "hello";
        System.out.println(s9 == s10);

    }
}
