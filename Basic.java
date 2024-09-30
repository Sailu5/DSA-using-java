
// import java.util.*;

// public class Basic{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter an age:");
//         int age=sc.nextInt();
//         if(age >=18){
//             System.out.println("You are an adult");
//         }
//         else{
//             System.out.println("you are not an adult");
//         }
//         sc.close();
//     }
// }

// grades of a Student


// public class Basic {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter marks:")
//         int marks=sc.nextInt();


//         if (marks < 25) {
//             System.out.println("Grade: F");
//         } else if (marks >= 25 && marks <= 44) {
//             System.out.println("Grade: E");
//         } else if (marks >= 45 && marks <= 49) {
//             System.out.println("Grade: D");
//         } else if (marks >= 50 && marks <= 59) {
//             System.out.println("Grade: C");
//         } else if (marks >= 60 && marks <= 69) {
//             System.out.println("Grade: B");
//         } else if (marks >= 70) {
//             System.out.println("Grade: A");
//         } else {
//             System.out.println("Invalid marks entered.");
//         }
//         sc.close();
//     }
// }


//Switch case


//     public static void main(String[] args) {
//         int day;
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a number (1-7): ");
//         day = scanner.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid");
//         }

//         scanner.close();
//     }
// }

// FOR LOOPS


// public class Basic {
//     public static void main(String[] args) {
//         // for (int i = 0; i < 3; i++) {
//         //     for (int j = 0; j < 3; j++) {
//         //         System.out.println("i = " + i + ", j = " + j);
//         //         // Nested loop code
//         //     }
//         // }

//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n= sc.nextInt();
//         for (int i=1;i <=n; i++){
//             if(i%2 ==0){
//                 System.out.println(i +"Even");
//             }
//             else{
//                 System.out.println(i +"odd");
//             }
//         }
//         sc.close();
//     }
// }


//WHILE LOOP


public class Basic{
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        while (n > 0) {
            factorial *= n;
            n--;
        }

        System.out.println("Factorial of 5 is: " + factorial);
    }


}