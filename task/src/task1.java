import java.util.Scanner;

public class task1 {
    Scanner IN = new  Scanner(System.in);
    public static void main(String[] args) {
        String ar[]={"s","e","z","x"};
        System.out.println("السؤال الاول");
        int ars[]={11,2,5,44,22,-7,5};
        System.out.println( smallest1(ars));
        System.out.println();
        System.out.println("السؤال الثاني");
        System.out.println(Opposite2(-54));
        System.out.println();
        System.out.println("السؤال الثالث");
        System.out.println(contain3("s",ar));
        System.out.println();
        System.out.println("السؤال الرابع");
        split3("this is my loooo");
        System.out.println();
        System.out.println("السؤال الخامس");
        replace4("5128965");
        System.out.println();
        System.out.println("السؤال السادس");
        char ae[]={1,5,'5'};
        System.out.println(theSum5(ae));
        System.out.println();
        System.out.println("السؤال السابع");
        int aew []={1,2,5};
        doubled6(aew);
        System.out.println();
        System.out.println("السؤال الثامن");
        System.out.println(stayHydrated7(14));
        System.out.println();
        System.out.println("السؤال التاسع");
        System.out.println( stringIntoANumber8("1456"));
        System.out.println();
        System.out.println("السؤال العاشر");
        System.out.println(bodyMass9(70,1.8));
        System.out.println();
        System.out.println("السؤال الحادي عشر");
        String zx []={"3:1","4:2","1:2","2:2","0:2","5:3","4:3","1:2","1:2","1:2"};
        System.out.println(point10(zx));
        System.out.println("السؤال الثاني عشر");
        System.out.println(summation11(4));
        System.out.println();
        System.out.println("السؤال الثالث عشر");
        System.out.println(trafficking12("yellow","red"));
        System.out.println();
        System.out.println("السؤال الرابع عشر");
        int as[]={1,2,3,4,6};
        System.out.println(nonConsecutive13(as));
        System.out.println();
        System.out.println("السؤال الخامس عشر");
        multiples14(5,10);
        System.out.println();
        System.out.println("السؤال السادس عشر");
        System.out.println(theFactorIsAFactor15(3,6));
        System.out.println();
        System.out.println("السؤال السابع عشر");
        System.out.println(CenturyFromYear16(1901));
        System.out.println();
    }
    String arr3[]= {};
    public static int smallest1(int []arr){
        int small=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<small)small=arr[i];
        }
        return small;
    }
    public  static  float Opposite2(float x){
        return -1*x;
    }
    public static boolean contain3(String x,String arr3[]){
        boolean found =false;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]==x) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void split3(String s){
        String[] words = s.split("\\s+");
        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]).append(",");
        }
        if(sb.length()>1) {
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+",");
        }
    }
    public static void  replace4(String x) {
        int a[]=new int[10];
        int size=0;
        int i=0;
        int num=Integer.parseInt(x);
        int temp = 0;
        while (num > 0) {
            int digit = num % 10;
            //if digit is 0, make it 5
            if (digit >5) {
                digit = 1;
            }

            else if (digit<5){
                digit=0;
            }
            a[i]=digit;
            num = num / 10;
            i++;
            size++;
        }
        for (int j = 0; j <= size; j++) {
            System.out.print(a[j]);
        }

    }
    public static int theSum5(char a[]){
        int sum=0;
        int x =0;
        for (int i = 0; i <a.length ; i++) {
            x=Character.getNumericValue(a[i]);
            if (x<0)
                sum+=a[i];
            else sum+=x;
        }
        return sum;
    }

    public static void doubled6(int aw[]){
        int a[]=new int[aw.length];
        for (int i = 0; i < aw.length ; i++) {
            a[i]=2*aw[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
    public static int stayHydrated7(double a){
        int ax=(int)a/2;
        return ax;
    }
    public static int stringIntoANumber8(String a){
        int num=Integer.parseInt(a);
        return num;
    }
    public static String bodyMass9(double w,double t){
        double tim=w/(t*2);
        if (tim<18.5)return "Underweight";
        else if (tim<25)return "Normal";
        else if (tim<30)return "Overweight";
        else return "Obese";
    }
    public static int point10(String b[]){
        int x,y;
        int sum=0;
        for (int i = 0; i <b.length ; i++) {
            String in =b[i];
            char a []=new  char[3];
            in.getChars(0,3,a,0);
            x=Character.getNumericValue(a[0]);
            y=Character.getNumericValue(a[2]);
            if (x>y)sum+=3;
            else if ((x<y))sum+=0;
            else sum++;
        }
        return sum;
    }
    public static int summation11(int z){
        int x=z*(z+1)/2;
        return x;
    }
    public static String trafficking12(String z, String y){
        if (z=="red")return "yellow";
        else if (z=="green")return "yellow";
        else if(z=="yellow"&&y=="green")return "red";
        else return "green";
    }
    public static int nonConsecutive13(int a[]){
        int x=a[0];
        for (int i = 1; i < a.length; i++) {
            if (x+1!=a[i])return a[i];
            else x++;
        }
        return -1;
    }
    public static void multiples14(int z,int x){
        int a[]=new int[x];
        for (int i = 0; i <a.length ; i++) {
            a[i]=z*(i+1);
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+",");
        }
    }
    public static boolean theFactorIsAFactor15(int x,int y){

        return y%x==0;
    }
    public static int CenturyFromYear16(int x){
        if (x%100==0)return x/100;
        return (x/100)+1;
    }
}

