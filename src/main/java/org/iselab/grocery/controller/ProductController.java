->RefactoringNumber->71439<-MoveField(org.iselab.grocery.controller.ProductController;org.iselab.grocery.domain.Customer;[a8];[])
->RefactoringNumber->71447<-DecreaseFieldSecurity(org.iselab.grocery.controller.ProductController;;[a7];[])
->RefactoringNumber->71449<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_3;[a1|a2|a3|a6|productRepository];[justANewFunction|justANewFunction4|start])
->RefactoringNumber->71452<-PushDownField(Class_3;org.iselab.grocery.controller.ProductController;[a2];[])
->RefactoringNumber->71454<-IncreaseMethodSecurity(org.iselab.grocery.controller.ProductController;;[];[newmethod])
->RefactoringNumber->71458<-PullUpField(org.iselab.grocery.controller.ProductController;Class_3;[a5];[])
->RefactoringNumber->71460<-ExtractSubClass(org.iselab.grocery.controller.ProductController;Class_5;[];[justANewFunction2])
->RefactoringNumber->71461<-PullUpField(org.iselab.grocery.controller.ProductController;Class_3;[a12];[])
->RefactoringNumber->71464<-ExtractClass(org.iselab.grocery.controller.ProductController;Class_7;[];[])
->RefactoringNumber->71466<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_8;[a10];[justANewFunction1])
->RefactoringNumber->71471<-ExtractSubClass(org.iselab.grocery.controller.ProductController;Class_9;[];[])
->RefactoringNumber->71476<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_11;[a9];[newmethod])
->RefactoringNumber->71480<-IncreaseFieldSecurity(org.iselab.grocery.controller.ProductController;;[a7];[])
->RefactoringNumber->71495<-MoveMethod(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.ProductController;[];[pressEnterKeyToContinue])
->RefactoringNumber->71499<-ExtractClass(org.iselab.grocery.controller.ProductController;Class_13;[];[])
->RefactoringNumber->71500<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_14;[a7];[])
->RefactoringNumber->71501<-ExtractClass(org.iselab.grocery.controller.ProductController;Class_15;[];[])
->RefactoringNumber->71502<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_16;[];[])
->RefactoringNumber->71503<-ExtractClass(org.iselab.grocery.controller.ProductController;Class_17;[a2];[])
->RefactoringNumber->71505<-ExtractSuperClass(org.iselab.grocery.controller.ProductController;Class_19;[];[])
->RefactoringNumber->71507<-ExtractSubClass(org.iselab.grocery.controller.ProductController;Class_20;[];[])
->RefactoringNumber->71509<-ExtractClass(org.iselab.grocery.controller.ProductController;Class_22;[];[])
->RefactoringNumber->71519<-ExtractSubClass(org.iselab.grocery.controller.ProductController;Class_25;[a4];[])
->RefactoringNumber->71522<-ExtractSubClass(org.iselab.grocery.controller.ProductController;Class_26;[];[justANewFunction3])
->RefactoringNumber->71527<-PushDownMethod(org.iselab.grocery.controller.ProductController;Class_26;[];[pressEnterKeyToContinue])
->RefactoringNumber->71528<-MoveField(org.iselab.grocery.controller.ProductController;Class_6;[a11];[])
->RefactoringNumber->71536<-MoveMethod(org.iselab.grocery.MainClass;org.iselab.grocery.controller.ProductController;[];[save])
<-endRefactoring marker->
package org.iselab.grocery.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.iselab.grocery.domain.Product;
import org.iselab.grocery.repository.ProductRepository;
import org.iselab.grocery.util.SystemUtils;

public class ProductController {

    private ProductRepository productRepository;

    private int a1;

    private int a2;
    private int a3;
    private int a4;
    private int a5;
    private int a6;
    private int a7;
    private int a8;
    private int a9;
    private int a10;
    private int a11;
    private int a12;

    public ProductController() {
        this.productRepository = new ProductRepository();
    }

    public void justANewFunction() {
        int a = 10;
    }


    public void justANewFunction1() {
        int a = 10;
    }

    public void justANewFunction2() {
        int a = 10;
    }

    public void justANewFunction3() {
        int a = 10;
    }

    public void justANewFunction4() {
        int a = 10;
    }


    public void newmethod() {
        int a = 10;
    }


    public void print(List<Product> products) {

        String template = "%-2s %4s %-7s %4s %-5s";

        System.out.println("-------------------------------");
        System.out.println(String.format(template, "Id", "|", "Name", "|", "Amount"));
        System.out.println("-------------------------------");

        for (Product p : products) {
            System.out.println(String.format(template, p.getId(), "|", p.getName(), "|", p.getAmount()));
        }
    }

    public int showMenu() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products");

        System.out.println("  [1] Add");
        System.out.println("  [2] Search by Name");
        System.out.println("  [3] Search by Id");
        System.out.println("  [4] Remove");
        System.out.println("  [5] List All");
        System.out.println("  [9] Back");

        System.out.print("Option: ");

        return SystemUtils.getIntFromKeyboard();
    }

    public void listAll() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "List All");

        print(productRepository.findAll());

        SystemUtils.pressEnterKeyToContinue();
    }

    public void remove() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Remove by Id");

        System.out.print("Id: ");

        int id = SystemUtils.getIntFromKeyboard();

        System.out.println("----------------");

        Product removed = productRepository.removeById(id);

        if (removed == null) {
            System.out.println("Product not found");
        } else {
            System.out.println("Product " + removed.getName() + " was successfully removed");
        }

        SystemUtils.pressEnterKeyToContinue();
    }

    public void searchByName() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Search by Name");

        System.out.print("Name: ");

        String name = SystemUtils.getStringFromKeyboard();

        print(productRepository.findByName(name));

        SystemUtils.pressEnterKeyToContinue();
    }

    public void searchById() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Search by Id");

        System.out.print("Id: ");

        int id = SystemUtils.getIntFromKeyboard();

        Product p = productRepository.findById(id);

        if (p == null) {
            System.out.println("Product not found");
        } else {
            print(Arrays.asList(p));
        }

        SystemUtils.pressEnterKeyToContinue();
    }

    public void addProduct() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader("Products", "Add");

        Product product = new Product();

        System.out.print("Name: ");
        product.setName(SystemUtils.getStringFromKeyboard());

        System.out.print("Amount: ");
        product.setAmount(SystemUtils.getIntFromKeyboard());

        productRepository.save(product);
    }

    public void start() {

        int option = showMenu();

        while (option != 9) {

            switch (option) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchById();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    listAll();
                    break;
            }

            option = showMenu();
        }
    }

}
