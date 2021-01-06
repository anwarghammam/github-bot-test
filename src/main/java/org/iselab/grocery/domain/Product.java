->RefactoringNumber->16002<-ExtractSubClass(org.iselab.grocery.domain.Product;Class_8;[amount];[getId])
->RefactoringNumber->16007<-ExtractClass(org.iselab.grocery.domain.Product;Class_11;[name];[setId|toString])
->RefactoringNumber->16013<-PullUpField(Class_8;org.iselab.grocery.domain.Product;[amount];[])
->RefactoringNumber->16015<-PullUpMethod(Class_8;org.iselab.grocery.domain.Product;[];[getId])
->RefactoringNumber->16031<-PushDownField(org.iselab.grocery.domain.Product;Class_8;[id];[])
->RefactoringNumber->16046<-DecreaseFieldSecurity(org.iselab.grocery.domain.Product;;[amount];[])
<-endRefactoring marker->
package org.iselab.grocery.domain;

import org.iselab.grocery.util.UUIDUtils;

public class Product {

    private int id;

    private String name;

    private int amount;

    public Product() {
        this.id = UUIDUtils.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("{");
        builder.append("id: ").append(id).append(", ");
        builder.append("name: \"").append(name).append("\", ");
        builder.append("amount: ").append(amount);
        builder.append("}");
        
        return builder.toString();
    }
}
