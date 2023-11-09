import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {

/* FONKSİYONLAR
    public static void say_hi(){
        System.out.println("Hi");
    }
    public static void faktöriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number:");
        int num = scanner.nextInt();
        int result = 1;
        while ( num > 0 ){
            result *= num;
            num --;
        }
        System.out.println("RESULT:"+ result);

    }
    public static void write_name(String isim){
        System.out.println("Your name:"+isim);
    }
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }
    public static int multiply_N(int a, int b, int c){
        return (a*b*c);
    }
    public static int multiply_N(int a, int b){
        return (a*b); // Overloading
    }
    public static void find_prime_num(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = scanner.nextInt();
        boolean asal = true;
        for( int i =2 ; i<num ; i++){
            if( num % i == 0 ){
                asal = false;
            }
        }
        if(asal){
            System.out.println("Asal");
        }else{
            System.out.println("Asal değil");
        }
    }

 */
    public static void main(String[] args) {
/*
        //FONKSİYONLAR
        //say_hi();
        //faktöriyel();

        //Scanner scanner = new Scanner(System.in);
        //System.out.printf("Write your name:");
        //String name = scanner.nextLine();
        //write_name(name);

        //System.out.println(toplama(1,5,9));
        //multiply_N(2,2);
        //multiply_N(2,2,2);
        //find_prime_num();
*/

/*
        System.out.printf("Hello and welcome!\n");
        // byte --> short --> int --> long
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128

        System.out.println(Short.MAX_VALUE); //32767

        double dValue = 5.25;
        double dValue2 = 5d;

        float fValue = (float)5.27;
        float fValue2 = 6.28f;

        int a = 22/7; //3
        float b= 22f/7f; //3.142857
        double c= 22d/7d; //3.142857142857143

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        char cEx = 'A';
        char cEx2 = '\u30AC'; // unicode gösterimi
        System.out.println(cEx2);//ガ

        boolean bEx=true;

        String sEx= "Merhaba" + " java'ya";
        System.out.println(sEx+" Hoşgeldiniz");

        int deneme =7;

        System.out.println(deneme++); //7
        //8 oldu
        System.out.println(--deneme); //7
        //7 oldu
        System.out.println(deneme--); //7
        //6 oldu
        System.out.println(deneme); //6
*/

/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Yaşınız "+ age);

        scanner.nextLine(); // Enter girdisini temizler
        System.out.print("Adınızı giriniz:");
        String name= scanner.nextLine();
        System.out.println("Adınız "+ name);



        System.out.print("Enter a num: ");
        if(scanner.hasNextInt()){   // sayı olup olmadığını kontrol etmek için
            int number =scanner.nextInt();
            System.out.println("Your num: " + number);
        }
        else{
            System.out.println("Lütfen bir sayı giriniz");
        }
*/

/*

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your age:");
        int age = scanner.nextInt();

        if(age >=18 && age <=65 ){
            System.out.println("You can drink alcohol");
        } else if (age>65) {
            System.out.println("You can't drink alcohol. It can be harmful for your liver.");
        }else {
            System.out.println("You cant drink alcohol. You are so young.");
        }
*/

/*
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a num(1-4):");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            case 4:
                System.out.println("You entered 4");
                break;
            default:
                System.out.println("Geçersiz işlem");
        }
*/

/*
        for(int i =0; i<5 ; i++){
            System.out.println(i);
        }


        int i = 0;
        int j = 9;
        for(; i<10 && j>0; i++,j-- ){
            System.out.println("i:"+ i + " j:"+j);
        }


        int i = 3;
        while(i < 100){
            System.out.println(i);
            i*=3;
        }

        int i = 0;
        do {
            if (i == 4) {
                continue;
            }
            System.out.println("value:" + i);
            i++;
        } while (i < 5);
*/

    }
}