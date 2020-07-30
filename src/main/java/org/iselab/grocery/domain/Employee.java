->RefactoringNumber->71443<-PushDownMethod(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Employee;[];[setA8])
->RefactoringNumber->71462<-PullUpMethod(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Person;[];[setA8])
->RefactoringNumber->71493<-PushDownMethod(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Employee;[];[setA8])
->RefactoringNumber->71496<-MoveField(org.iselab.grocery.controller.NewController;org.iselab.grocery.domain.Employee;[productRepository];[])
->RefactoringNumber->71513<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Employee;[a8];[])
->RefactoringNumber->71518<-PushDownField(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Manager;[productRepository];[])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Employee extends Person{

}
