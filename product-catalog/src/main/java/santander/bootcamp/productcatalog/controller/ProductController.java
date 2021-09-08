package santander.bootcamp.productcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import santander.bootcamp.productcatalog.model.Product;
import santander.bootcamp.productcatalog.repository.ProductRepository;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
    return productRepository.save(product);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional <Product> findById(@PathVariable Integer id)
    {
        return productRepository.findById(id);
    }
}
