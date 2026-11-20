import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("NOORULH");
        String blank ="     ";
        //length/emptiness
       // System.out.println(s1.length());
      //  System.out.println(blank.isBlank());
       // System.out.println(s1.isEmpty());


        //Character aceess
       // System.out.println(s1.charAt(2));
       char arr[] = s1.toCharArray();
      // System.out.println(s1.indexOf('o'));


       //comprison
        String s2 = new String("  NOOR  ULA  ");
        //System.out.println(s1.equals(s2));
       // System.out.println(s1.equalsIgnoreCase(s2));
       // System.out.println(s1.compareTo(s2));
        //compareTo returns an integer -ve , 0 , +ve accordingly
    //searching


        System.out.println(s1.contains("NOO"));
        System.out.println(s1.indexOf("RUL"));
        System.out.println(s1.lastIndexOf('O'));
        System.out.println(s1.startsWith("NO"));
        System.out.println(s1.endsWith("NO"));
        //Extraction / transformation

        System.out.println(s1.substring(1,4));
        System.out.println(s1.substring(1));
        System.out.println(s1.toLowerCase());

//        System.out.println(s2.trim());
//        System.out.println(s2.strip()); //does same thing but unicode friendly
//        System.out.println(s1.repeat(3));
//        System.out.println(s1.replace("NO" ,"MO"));
//        System.out.println(s1.replaceAll("NO" ,"MO"));
//        System.out.println(s1);

        String n = "noorul,hussian,shaik";
        String splt[] = n.split(",");
        for(String s : splt){
            System.out.println(s);
        }
       // System.out.println(Arrays.toString(splt));

    //conversion
        String s11 = String.valueOf(100);
        System.out.println(s11);

        //Advance methods
        String s12 = new String("Hello");
        String s13 = s12.intern(); //used to bring an object from heap to pool if it is not present

        //format
        String name = "Noorul";
        int age = 20;
        System.out.println(String.format("Hi this is %s and I am %s",name,age));
    }
}
