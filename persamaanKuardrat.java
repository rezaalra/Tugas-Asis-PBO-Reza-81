package oop_responsi1;

import java.util.Scanner;

class OOP_Responsi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input b: ");
        int b = input.nextInt();
        System.out.print("Input c: ");
        int c = input.nextInt();
        
        persamaanKuardrat equ1 = new persamaanKuardrat(a, b, c);
        equ1.getMethod();
        equ1.getOutput();
    }
}

class persamaanKuardrat {
    private int a;
    private int b;
    private int c;
    
    persamaanKuardrat (int new_a, int new_b, int new_c) {
        this.a = new_a;
        this.b = new_b;
        this.c = new_c;
    }
    
    public double getDiskriminan() {
        return (b * b) - 4 * (a * c);
    }
    
    public double getAkar1() {
        return (-b + Math.sqrt(getDiskriminan()))/(2 * a);
    }
    
    public double getAkar2() {
        return (-b - Math.sqrt(getDiskriminan()))/(2 * a);
    }
    public void setA (int a) {
        this.a = a;
    }
    public void setB (int b) {
        this.b = b;
    }
    public void setC (int c) {
        this.c = c;
    }
    public void getOutput () {
        if (a == 0)
            System.out.println("Ini bukan persamaan kuardrat karena a = 0");
        else if (getDiskriminan() > 0)
            System.out.println("Persamaan Kuardrat ini mempunyai akar1 = " 
                    + getAkar1() + " dan akar2 =  " + getAkar2());
        else if (getDiskriminan() == 0)
            System.out.println("Persamaan Kuardrat ini mempunyai akar kembar "
                    + "yaitu " + getAkar1());
        else
            System.out.println("Persamaan Kuardrat ini tidak mempunyai akar"
                    + " - akar penyelesaian");
    }
    public void getMethod () {
        System.out.println("Persamaan kuadrat " + a + "x2 + " + b 
                + "x + " + c);
    }
}