package hellooooo;

import java.util.Scanner;

public class heeheheh {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count =0;
    sc.nextLine();
    String s1=sc.nextLine();
    for(int i =0;i<=s1.length()-2;i++){
        if(s1.charAt(i)==s1.charAt(i+1)){
            count = count +1;
        }
    }
    System.out.println(count);


}
}



