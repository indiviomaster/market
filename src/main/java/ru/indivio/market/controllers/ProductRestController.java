package ru.indivio.market.controllers;

import ru.indivio.market.entities.Product;
import ru.indivio.market.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path="/employees", method=RequestMethod.GET)
    public Product getAllProducts(){
        return null;
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public List<Product> getProductsByVendor(@RequestParam("id") String id){
        return productService.getProductsByVendorCode(id);
    }
}
