->RefactoringNumber->15982<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_2;[];[findById|save])
->RefactoringNumber->15986<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.util.SystemUtils;[class_2];[])
->RefactoringNumber->16003<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[systemutils];[])
->RefactoringNumber->16006<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_10;[systemutils];[findById|findByName])
->RefactoringNumber->16016<-PullUpField(Class_10;org.iselab.grocery.repository.ProductRepository;[systemutils];[])
->RefactoringNumber->16028<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_10;[];[findAll])
->RefactoringNumber->16033<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_10;[];[save])
->RefactoringNumber->16057<-EncapsulateField(org.iselab.grocery.repository.ProductRepository;;[systemutils];[])
->RefactoringNumber->16069<-PullUpMethod(Class_10;org.iselab.grocery.repository.ProductRepository;[];[save])
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
