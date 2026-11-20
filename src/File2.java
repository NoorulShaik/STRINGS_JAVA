public class File2 {
    public static void main(String[] args) {
        //constructor
        String s1 = new String();
        String s2= new String("Hello");

        String s3 = "noorul";
        String s4 = new String(s3);
        //char array
        char[] arr = {'w','e','r','y'};
        String s5 = new String(arr);
        //[0,2)
        String s6 = new String(arr,0,2);
        System.out.println(s6);
        System.out.println(s5); //wery
        byte[] arr2 ={97,98,99,100};
        String s7 = new String(arr2);
        System.out.println(s7);


        //we can pass StringBuilder and Sting Buffer as well
        StringBuilder sb = new StringBuilder("hello");
        String s8 = new String(sb);
        StringBuffer db = new StringBuffer(sb);
        String s9 = new String(db);
        System.out.println(s8 + " " + s9);
    }

}
