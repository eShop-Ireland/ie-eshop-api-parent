package ie.eshop.api.web.controller;

import ie.eshop.api.business.service.ProductService;
import ie.eshop.api.model.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        log.info("New 'getAllProducts' request received");
        return productService.getAllProducts();
    }

}
