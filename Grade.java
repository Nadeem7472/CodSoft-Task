import java.util.ArrayList;
import java.util.Scanner;

public class Grade {
    public static void enterMarks(int n, ArrayList<Float> marks, ArrayList<Integer> number, int i){
        Scanner sc = new Scanner(System.in);
        if(i > n){
            return;
        }

        System.out.print("Subject "+i+" Marks - ");
        //String name = sc.next();        //nextLine();
        marks.add(sc.nextFloat());              //<<<<<----------------------Input
        System.out.print("Out of? - ");
        number.add(sc.nextInt());               //<<<<<----------------------Input

        if(marks.get(i-1) > number.get(i-1)){
            System.out.println("Note:- Obtain marks is not Greater than Subject marks\nRe-enter your marks of this Subject...\n");
            marks.remove(i-1);
            number.remove(i-1);
            enterMarks(n, marks, number, i);
        }
        System.out.println();
        enterMarks(n, marks, number, i+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Subject = ");
        int n = sc.nextInt();
        System.out.println();
        ArrayList<Float> marks = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

        enterMarks(n, marks, number, 1);          //Call Recursive Function();

        float totalMarks = 0;
        for(float num : marks){
            totalMarks += num;
        }

        int totalNum = 0;
        for(int num : number){
            totalNum += num;
        }


        System.out.println("Total = " +totalMarks+"/"+totalNum+"\n");
        float percentage = 100*(totalMarks/totalNum);
        System.out.println("Percentage = "+percentage+"%");

        if(percentage<=100 && percentage>80){
            System.out.println("Grade - A");
        }
        else if(percentage<=80 && percentage>60){
            System.out.println("Grade - B");
        }
        else if(percentage<=60 && percentage>45){
            System.out.println("Grade - C");
        }
        else if(percentage<=45 && percentage>33){
            System.out.println("Grade - D");
        }
        else{
            System.out.println("Grade - E");
        }
    }
}