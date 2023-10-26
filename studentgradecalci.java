import java.util.Scanner;
public class studentgradecalci {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT GRADE CALCULATOR");
        System.out.println("ENTER USER NAME: ");
        String name=in.nextLine();
        System.out.println("ENTER MARKS OF EACH SUBJECT");
        System.out.println("ENTER MATH MARKS:");
        int math=in.nextInt();
        System.out.println("ENTER DS MARKS:");
        int ds=in.nextInt();
        System.out.println("ENTER JAVA MARKS:");
        int java=in.nextInt();
        System.out.println("ENTER PYTHON MARKS:");
        int python=in.nextInt();
        System.out.println("ENTER DAA MARKS:");
        int daa=in.nextInt();
        int total= math+ds+java+python+daa;
        int avg= total/5;
        String grade;
        String result;
        if(avg>=60)
            {
                grade="A";
                result="First Class";
            }
            else if(avg<60 && avg>=50)
            {
                grade="B";
                result="Second Class";
            }
            else if(avg<50 && avg>=40)
            {
                grade="C";
                result="Third Class";
            }
            else
            {
                grade="D";
                result="Fail";
            }
            System.out.println(" STUDENT NAME IS: "+name);
            System.out.println("MARKS SCORED IN MATH IS:"+math+"/100");
            System.out.println("MARKS SCORED IN MATH IS:"+ds+"/100");
            System.out.println("MARKS SCORED IN MATH IS:"+java+"/100");
            System.out.println("MARKS SCORED IN MATH IS:"+python+"/100");
            System.out.println("MARKS SCORED IN MATH IS:"+daa+"/100");
            System.out.println("TOTAL MARKS SCORED IS:"+total+"/500");
            System.out.println("AVERAGE IS:"+avg);
            System.out.println("GRADE: "+grade);
            System.out.println("RESULT: "+result);
        in.close();
    }
}