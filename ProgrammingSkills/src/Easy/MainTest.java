package Easy;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        //1491
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入测试题目：");
        int select=sc.nextInt();
        switch (select){
            case 29  ->Test_0029(sc);
            case 191 ->Test_0191(sc);
            case 367 ->Test_0367(sc);
            case 976 ->Test_0976(sc);
            case 1281->Test_1281(sc);
            case 1491->Test_1491(sc);
            case 1502->Test_1502(sc);
            case 1523->Test_1523(sc);
            case 1779->Test_1779(sc);
            case 1822->Test_1822(sc);
            default  ->Test_0000();
        }

    }

    public static void Test_1491(Scanner sc) {
        //int[] salary=new int[6]; //example 4:8000,9000,2000,3000,6000,1000
        //int[] salary=new int[4];//example 1:4000,3000,1000,2000
        int[] salary=new int[3];//example 2:1000,2000,3000
        //int[] salary=new int[6];//example 3:6000,5000,4000,3000,2000,1000

        for (int i=0;i<salary.length;i++){
            salary[i]=sc.nextInt();
        }

        AverageSalary_1491 test1491=new AverageSalary_1491();
        double averageSalary= test1491.average(salary);
        System.out.println(averageSalary);
    }

    public static void Test_1523(Scanner sc){
        //给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目
        int low=sc.nextInt();
        int high=sc.nextInt();
        CountOddInRange_1523 test1523=new CountOddInRange_1523();
        int oddCounter= test1523.countOdds(low, high);
        System.out.println(oddCounter);
        //example1:low=3,high=7
        //example2:low=8,high=10
    }

    public static void Test_0029(Scanner sc){
        int number1,number2;
        System.out.println("请输入被除数和除数");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        int quotient;
        DivideTwoIntegers_0029 test0029=new DivideTwoIntegers_0029();
        quotient = test0029.divide(number1,number2);
        System.out.println("商是："+quotient);
    }

    public static void Test_0191(Scanner sc){
        int number= sc.nextInt();
        NumberOneBits_0191 test0191=new NumberOneBits_0191();
        int count = test0191.hammingWeight(number);
        System.out.println(count);
    }

    public static void Test_1281(Scanner sc){
        int number=sc.nextInt();
        SubtractProductSum_1281 test1281=new SubtractProductSum_1281();
        int result= test1281.subtractProductAndSum(number);
        System.out.println(result);
    }

    public static void Test_0367(Scanner sc){
        /*example 1：input:16 output：true
          example 2：input:14 output：false*/
        int number = sc.nextInt();
        boolean isPerfectSquare;
        ValidPerfectSquare_0367 test0367=new ValidPerfectSquare_0367();
        isPerfectSquare=test0367.IsPerfectSquare_1(number);
        System.out.println(isPerfectSquare);

        isPerfectSquare=test0367.IsPerfectSquare_2(number);
        System.out.println(isPerfectSquare);
    }

    public static void Test_0000(){
        System.out.println("输入题号错误或未查找到此题目");
    }

    public static void Test_0976(Scanner sc){
        int[] nums=new int[3];//example1:2,1,2; example2:1,2,1

        for (int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        LargestPerimeterTriangle_0976 test0976=new LargestPerimeterTriangle_0976();
        int largestPerimeter=test0976.largestPerimeter(nums);
        System.out.println(largestPerimeter);
    }

    public static void Test_1779(Scanner sc){
        int[][] points=new int[1][2];
        System.out.println("输入坐标数组");
        for (int i=0;i<1;i++){
            points[i][0]= sc.nextInt();
            points[i][1]= sc.nextInt();
        }
        System.out.println("输入x、y");
        int x= sc.nextInt();
        int y= sc.nextInt();
        FindNearestPoint_1779 test1779=new FindNearestPoint_1779();
        int minDistance=test1779.nearestValidPoint(x,y,points);
        System.out.println(minDistance);
    }

    public static void Test_1502(Scanner sc){
        int[] arr=new int[3];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        CanMakeArithmeticProgression_1502 test1502=new CanMakeArithmeticProgression_1502();
        boolean isArithmeticProgression=test1502.canMakeArithmeticProgression(arr);
        System.out.println(isArithmeticProgression);
    }

    public static void Test_1822(Scanner sc){
        int[] nums=new int[5];//example1:7,example2,3:5
        //example 1:-1,-2,-3,-4,3,2,1
        //example 2:1,5,0,2,-3
        //example 3:-1,1,-1,1,-1
        for (int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        ArraySign_1822 test1822=new ArraySign_1822();
        int arraySign=test1822.arraySign(nums);
        System.out.println(arraySign);
    }
}