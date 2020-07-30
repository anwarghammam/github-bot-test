->RefactoringNumber->71448<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.MainClass;[];[save])
->RefactoringNumber->71463<-ExtractSuperClass(org.iselab.grocery.MainClass;Class_6;[];[showMenu])
->RefactoringNumber->71478<-ExtractSubClass(org.iselab.grocery.MainClass;Class_12;[];[save])
->RefactoringNumber->71483<-PushDownField(Class_6;org.iselab.grocery.MainClass;[a4];[])
->RefactoringNumber->71485<-PullUpMethod(org.iselab.grocery.MainClass;Class_6;[];[main])
->RefactoringNumber->71487<-PushDownMethod(org.iselab.grocery.MainClass;Class_12;[];[getA4])
->RefactoringNumber->71491<-PullUpMethod(Class_12;org.iselab.grocery.MainClass;[];[getA4])
->RefactoringNumber->71492<-PushDownMethod(org.iselab.grocery.MainClass;Class_12;[];[getA4])
->RefactoringNumber->71494<-PushDownField(org.iselab.grocery.MainClass;Class_12;[a4];[])
->RefactoringNumber->71526<-PullUpMethod(Class_12;org.iselab.grocery.MainClass;[];[setA4])
->RefactoringNumber->71532<-PullUpMethod(Class_12;org.iselab.grocery.MainClass;[];[save])
->RefactoringNumber->71536<-MoveMethod(org.iselab.grocery.MainClass;org.iselab.grocery.controller.ProductController;[];[save])
->RefactoringNumber->71537<-ExtractClass(org.iselab.grocery.MainClass;Class_28;[];[save])
<-endRefactoring marker->
package org.iselab.grocery;

import org.iselab.grocery.controller.ProductController;
import org.iselab.grocery.util.SystemUtils;

public class MainClass {

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();

        mainClass.run();

        SystemUtils.closeScanner();
    }

    public int showMenu() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader();
        
        System.out.println("  [1] Products");
        System.out.println("  [9] Exit");

        System.out.print("Option: ");

        return SystemUtils.getIntFromKeyboard();
    }

    public void run() {

        int option = showMenu();

        while (option != 9) {

            switch (option) {
                case 1:
                    new ProductController().start();
                    break;
                default:
                    break;
            }

            option = showMenu();
        }

        System.out.println("Good bye!");
    }
}
