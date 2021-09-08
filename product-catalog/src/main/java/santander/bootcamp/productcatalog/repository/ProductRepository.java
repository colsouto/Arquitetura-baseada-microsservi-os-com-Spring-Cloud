package santander.bootcamp.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;
import santander.bootcamp.productcatalog.model.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer> {
}
