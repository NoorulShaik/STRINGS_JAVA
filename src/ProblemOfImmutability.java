public class ProblemOfImmutability {
    public static void main(String[] args) {
        String s = "";
        for(int i = 0 ;i < 5;i++){
            s+=i; //Everytime creates a new object
            //Thats why strings are immutable
            System.out.println(s);
        }
    }
}
