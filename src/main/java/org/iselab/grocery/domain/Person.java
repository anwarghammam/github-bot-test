->RefactoringNumber->71440<-PullUpMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[];[setA8])
->RefactoringNumber->71443<-PushDownMethod(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Employee;[];[setA8])
->RefactoringNumber->71450<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Customer;[a8];[])
->RefactoringNumber->71462<-PullUpMethod(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Person;[];[setA8])
->RefactoringNumber->71475<-PullUpField(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[a8];[])
->RefactoringNumber->71493<-PushDownMethod(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Employee;[];[setA8])
->RefactoringNumber->71513<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Employee;[a8];[])
->RefactoringNumber->71520<-MoveField(org.iselab.grocery.controller.NewController;org.iselab.grocery.domain.Person;[a5];[])
->RefactoringNumber->71529<-IncreaseFieldSecurity(org.iselab.grocery.domain.Person;;[a5];[])
->RefactoringNumber->71530<-PushDownMethod(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Customer;[];[getA5])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public abstract class Person {

}
