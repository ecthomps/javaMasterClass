package com.chrisThomps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int custChoice;
        double custAmount;

        VenMachine machTrans = new VenMachine();
        cashRegister cashIn = new cashRegister(0.00);
        dispenserType productType = new dispenserType();

        do{
            machTrans.showSelection();
            custChoice = scanner.nextInt();
            machTrans.custSelection(custChoice);

            if(custChoice != 9){
                if(productType.isProductAvailable(custChoice)) {
                    custAmount = scanner.nextDouble();
                    if(cashIn.isSufficientFund(custChoice, custAmount)){
                        cashIn.print();
                    }
                    else
                        System.out.println("Insufficient funds");
                }
                else
                    System.out.println("We out of Product");
            }
        }while (custChoice != 9);
    }
}
