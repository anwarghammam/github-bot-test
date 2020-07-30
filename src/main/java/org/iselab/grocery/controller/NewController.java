->RefactoringNumber->71442<-ExtractSubClass(org.iselab.grocery.controller.NewController;Class_1;[a1|productRepository];[func2])
->RefactoringNumber->71445<-ExtractClass(org.iselab.grocery.controller.NewController;Class_2;[];[func4])
->RefactoringNumber->71446<-IncreaseMethodSecurity(org.iselab.grocery.controller.NewController;;[];[func3])
->RefactoringNumber->71453<-PushDownMethod(org.iselab.grocery.controller.NewController;Class_1;[];[func3])
->RefactoringNumber->71459<-PushDownMethod(org.iselab.grocery.controller.NewController;Class_1;[];[func4])
->RefactoringNumber->71465<-DecreaseFieldSecurity(org.iselab.grocery.controller.NewController;;[a5];[])
->RefactoringNumber->71468<-PushDownField(org.iselab.grocery.controller.NewController;Class_1;[a2];[])
->RefactoringNumber->71477<-DecreaseFieldSecurity(org.iselab.grocery.controller.NewController;;[a4];[])
->RefactoringNumber->71479<-MoveField(org.iselab.grocery.controller.NewController;Class_6;[a4];[])
->RefactoringNumber->71489<-PullUpField(Class_1;org.iselab.grocery.controller.NewController;[productRepository];[])
->RefactoringNumber->71496<-MoveField(org.iselab.grocery.controller.NewController;org.iselab.grocery.domain.Employee;[productRepository];[])
->RefactoringNumber->71520<-MoveField(org.iselab.grocery.controller.NewController;org.iselab.grocery.domain.Person;[a5];[])
->RefactoringNumber->71533<-MoveField(Class_6;org.iselab.grocery.controller.NewController;[a11];[])
->RefactoringNumber->71534<-ExtractSubClass(org.iselab.grocery.controller.NewController;Class_27;[];[])
<-endRefactoring marker->
package org.iselab.grocery.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.iselab.grocery.domain.Product;
import org.iselab.grocery.repository.ProductRepository;
import org.iselab.grocery.util.SystemUtils;

public class NewController {

    private ProductRepository productRepository;

    private int a1;
    
    private int a2;
    
    private int a3;
    
    private int a4;
    
    private int a5;
    
    public static void func2(){
      int a = 10;
    }
    
    public void func3(){
      int b = 10;
    }
    
    public void func4(){
      int c = 10;
    }
    

}
