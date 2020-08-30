package ru.indivio.market.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import ru.indivio.market.entities.Product;
import ru.indivio.market.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductsWitMinPrice(){
        List <Product> pr = productRepository.findProductByMINPrice();
        System.out.println(pr);

        return pr.stream().collect(Collectors.toList());
    }
    public List<Product> getProductsWitMaxPrice(){
        List <Product> pr = productRepository.findProductByMAXPrice();
        System.out.println(pr);

        return pr.stream().collect(Collectors.toList());
    }

    public List<Product> getProductsWitMinMaxPrice(){
        List <Product> pr = productRepository.findProductByMinMaxPrice();
        System.out.println(pr);

        return pr.stream().collect(Collectors.toList());
    }


    public List<Product> getAllProducts() {

        //с минимальной ценой
        //List <Product> pr = productRepository.findProductByMINPrice();

        //с максимальной ценой
        //List <Product> pr = productRepository.findProductByMAXPrice();

        // страница 5 элементов вывод
        Page<Product> pr = productRepository.findAll(PageRequest.of(1,4));

        System.out.println(pr);

        return pr.stream().collect(Collectors.toList());
    }

    public List<Product> getProductsByVendorCode(String code) {
        return productRepository.findAllByVendorCode(code);
    }

    public Product getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        return null;
    }
}
