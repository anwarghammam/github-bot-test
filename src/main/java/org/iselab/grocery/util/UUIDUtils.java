->RefactoringNumber->15984<-MoveMethod(org.iselab.grocery.controller.NewController;org.iselab.grocery.util.UUIDUtils;[];[func4])
->RefactoringNumber->15995<-ExtractSuperClass(org.iselab.grocery.util.UUIDUtils;Class_5;[];[getId])
->RefactoringNumber->16008<-PullUpField(org.iselab.grocery.util.UUIDUtils;Class_5;[sequential];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
