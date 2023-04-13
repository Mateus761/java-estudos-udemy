package com.application;

import entities.Employee;
import entities.Product;
import entities.Rectangle;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        /*Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagonal());

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();
        System.out.printf("Employee: " + employee.name + ", $ " + "%.2f", employee.netSalary());
        System.out.println();
        System.out.print("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Update data: " + employee.name + employee.toString());

        Student student = new Student();

        System.out.print("Digite seu nome: ");
        student.name = sc.nextLine();
        System.out.print("Digite sua primeira nota: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        student.nota3 = sc.nextDouble();
        System.out.println();
        System.out.println("FINAL GRADE = " + student.finalGrade());
        System.out.println();
        System.out.println(student.aproveOrNot());*/


        sc.close();
    }
}
