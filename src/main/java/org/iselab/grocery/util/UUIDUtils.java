->RefactoringNumber->71457<-IncreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->71490<-MoveMethod(org.iselab.grocery.util.UUIDUtils;Class_2;[];[getId])
->RefactoringNumber->71498<-DecreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->71535<-IncreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[class_2];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
