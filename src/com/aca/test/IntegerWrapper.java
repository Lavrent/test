package com.aca.test;

public class IntegerWrapper {
        private int number;
        public IntegerWrapper(int number){
            this.number = number;
        }
        public int getNumber(){
            return number;
        }
        public  static void swap(IntegerWrapper num1, IntegerWrapper num2){
            int a = num1.number;
            num1.number = num2.number;
            num2.number = a;
        }
}
