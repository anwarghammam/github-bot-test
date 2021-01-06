->RefactoringNumber->15985<-MoveField(org.iselab.grocery.controller.NewController;org.iselab.grocery.MainClass;[a3];[])
->RefactoringNumber->15999<-ExtractSubClass(org.iselab.grocery.MainClass;Class_7;[];[run])
->RefactoringNumber->16004<-PushDownMethod(org.iselab.grocery.MainClass;Class_7;[];[showMenu])
->RefactoringNumber->16005<-ExtractSuperClass(org.iselab.grocery.MainClass;Class_9;[];[setA3])
->RefactoringNumber->16026<-PullUpMethod(Class_7;org.iselab.grocery.MainClass;[];[run])
->RefactoringNumber->16035<-IncreaseMethodSecurity(org.iselab.grocery.MainClass;;[];[getA3])
->RefactoringNumber->16041<-PullUpMethod(org.iselab.grocery.MainClass;Class_9;[];[getA3])
->RefactoringNumber->16042<-PullUpMethod(org.iselab.grocery.MainClass;Class_9;[];[run])
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
