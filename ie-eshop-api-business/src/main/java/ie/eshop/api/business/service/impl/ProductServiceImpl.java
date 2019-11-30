package ie.eshop.api.business.service.impl;

import ie.eshop.api.business.service.ProductService;
import ie.eshop.api.model.product.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getAllProducts() {
        Product product1 = new Product(1, "FakeName", "FakeDesc", 3.99F);
        Product product2 = new Product(2, "FakeName2", "FakeDesc2", 2.99F);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        return productList;
    }
}
