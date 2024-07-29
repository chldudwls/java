package test;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("----------------------------------");
            System.out.print("선택> ");
            String banking = scanner.nextLine();

            if (banking.equals("1")){
                System.out.print("예금액> ");
                String bankingDep = scanner.nextLine();

                // 예금액 int 타입으로 변경
                int depAmount = Integer.parseInt(bankingDep);
                balance += depAmount;


            } else if(banking.equals("2")) {
                System.out.print("출금액> ");
                String bankingWD = scanner.nextLine();

                // 출금액 int 타입으로 변경
                int wdAmout = Integer.parseInt(bankingWD);
                balance -= wdAmout;

            } else if (banking.equals("3")){
                System.out.println("잔고> " + balance);
            } else if (banking.equals("4")){
                break;
            }
        }
        System.out.println();
        System.out.println("프로그램 종료");
    }
}