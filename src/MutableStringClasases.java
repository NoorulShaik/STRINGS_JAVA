public class MutableStringClasases {
    public static void main(String[] args) {
      //constructors
        StringBuilder sb0 = new StringBuilder();
        StringBuilder sb = new StringBuilder(50);
        StringBuilder sb1 = new StringBuilder("Noorul");


        //Methods of SB/SBuffer
        sb1.append(" hussain");
        sb1.append(" shaik");
       // System.out.println(sb1);

        //insert()
        sb1.insert(2,"S");
        System.out.println(sb1);
        //delete
        sb1.delete(1,3);//[start,end)
        sb1.deleteCharAt(3);
        System.out.println(sb1);
        sb1.replace(7,9,"HH");
        System.out.println(sb1);
        //reverse()
        sb1.reverse();
        System.out.println(sb1);
        System.out.println(sb1.charAt(0));
     sb1.setCharAt(0,'P');
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(100);
        System.out.println(sb1.capacity());
        sb1.trimToSize();
        System.out.println(sb1.capacity());
    }

}
