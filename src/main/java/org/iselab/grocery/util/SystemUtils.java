->RefactoringNumber->71456<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_4;[];[getStringFromKeyboard|pressEnterKeyToContinue])
->RefactoringNumber->71467<-PullUpField(org.iselab.grocery.util.SystemUtils;Class_4;[input];[])
->RefactoringNumber->71472<-PushDownMethod(Class_4;org.iselab.grocery.util.SystemUtils;[];[pressEnterKeyToContinue])
->RefactoringNumber->71484<-PushDownMethod(Class_4;org.iselab.grocery.util.SystemUtils;[];[setProducts])
->RefactoringNumber->71488<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_4;[];[setProducts])
->RefactoringNumber->71495<-MoveMethod(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.ProductController;[];[pressEnterKeyToContinue])
->RefactoringNumber->71504<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_18;[];[getIntFromKeyboard|pressEnterKeyToContinue])
->RefactoringNumber->71511<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[productcontroller];[])
->RefactoringNumber->71521<-PushDownField(org.iselab.grocery.util.SystemUtils;Class_18;[productcontroller];[])
->RefactoringNumber->71531<-PushDownField(Class_4;org.iselab.grocery.util.SystemUtils;[input];[])
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
