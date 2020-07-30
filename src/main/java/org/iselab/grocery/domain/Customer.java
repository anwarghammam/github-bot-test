->RefactoringNumber->71439<-MoveField(org.iselab.grocery.controller.ProductController;org.iselab.grocery.domain.Customer;[a8];[])
->RefactoringNumber->71440<-PullUpMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[];[setA8])
->RefactoringNumber->71450<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Customer;[a8];[])
->RefactoringNumber->71470<-DecreaseFieldSecurity(org.iselab.grocery.domain.Customer;;[a8];[])
->RefactoringNumber->71475<-PullUpField(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[a8];[])
->RefactoringNumber->71530<-PushDownMethod(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Customer;[];[getA5])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Customer extends Person{

}
