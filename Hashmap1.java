import java.util.*;
class Hashmap1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr the number of key value pairs");
        int n = sc.nextInt();
        TreeMap<Integer,String> tm = new TreeMap<>();
        System.out.println("Enter the key value pairs");
        for(int i=0;i<n;i++){
            int key = sc.nextInt();
            String value = sc.next();
            tm.put(key,value);
        }

        System.out.println("Sorted orfer of kry value pair "+tm);  
      }
}