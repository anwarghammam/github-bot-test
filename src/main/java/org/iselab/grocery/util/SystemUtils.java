->RefactoringNumber->15986<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.util.SystemUtils;[class_2];[])
->RefactoringNumber->15992<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[class_2];[])
->RefactoringNumber->15994<-MoveField(Class_4;org.iselab.grocery.util.SystemUtils;[a4];[])
->RefactoringNumber->15997<-MoveMethod(org.iselab.grocery.controller.NewController;org.iselab.grocery.util.SystemUtils;[];[func3])
->RefactoringNumber->15998<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_6;[class_2];[func3|getIntFromKeyboard|printHeader])
->RefactoringNumber->16025<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_17;[class_6];[clearScreen])
->RefactoringNumber->16059<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_35;[input];[clearScreen|closeScanner|printHeader])
<-endRefactoring marker->
package org.iselab.grocery.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class SystemUtils {

    public static Scanner input = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getIntFromKeyboard() {
        return input.nextInt();
    }

    public static String getStringFromKeyboard() {
        return input.next();
    }

    public static void pressEnterKeyToContinue() {

        System.out.println();
        System.out.println("Press Enter key to continue...");

        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void closeScanner() {
        input.close();
    }

    public static void printHeader(String... paths) {

        paths = Stream.concat(Arrays.asList("Grocery").stream(), Arrays.stream(paths)).toArray(String[]::new);
        
        int size = 0;

        for (String path : paths) {
            size += path.length();
        }

        size += (paths.length - 1) * 4;

        System.out.println(String.join("", Collections.nCopies(size, "-")));
        
        System.out.println(String.join(" >> ", paths));
        
        System.out.println(String.join("", Collections.nCopies(size, "-")));
    }
}
