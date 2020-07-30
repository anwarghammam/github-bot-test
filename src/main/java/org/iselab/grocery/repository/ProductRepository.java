->RefactoringNumber->71448<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.MainClass;[];[save])
->RefactoringNumber->71473<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_10;[mainclass];[removeById|save])
->RefactoringNumber->71474<-PushDownMethod(Class_10;org.iselab.grocery.repository.ProductRepository;[];[save])
->RefactoringNumber->71481<-MoveField(org.iselab.grocery.repository.ProductRepository;Class_4;[products];[])
->RefactoringNumber->71482<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_10;[class_4];[])
->RefactoringNumber->71497<-PushDownField(Class_10;org.iselab.grocery.repository.ProductRepository;[mainclass];[])
->RefactoringNumber->71506<-IncreaseMethodSecurity(org.iselab.grocery.repository.ProductRepository;;[];[findAll])
->RefactoringNumber->71508<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_21;[];[findAll])
->RefactoringNumber->71514<-PushDownMethod(Class_10;org.iselab.grocery.repository.ProductRepository;[];[findById])
->RefactoringNumber->71516<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_10;[class_21];[])
->RefactoringNumber->71517<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_10;[];[removeById])
->RefactoringNumber->71524<-PushDownField(Class_10;org.iselab.grocery.repository.ProductRepository;[class_4];[])
<-endRefactoring marker->
package org.iselab.grocery.repository;

import java.util.ArrayList;
import java.util.List;

import org.iselab.grocery.domain.Product;

public class ProductRepository {

    private static List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }
    
    public Product findById(int id) {

        for (Product product : products) {

            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public List<Product> findByName(String name) {

        List<Product> found = new ArrayList<>();

        for (Product products : products) {

            if (products.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(products);
            }
        }

        return found;
    }
    
    public Product removeById(int id) {

        Product found = findById(id);

        if (found == null) {
            return null;
        }

        products.remove(found);

        return found;
    }
}
