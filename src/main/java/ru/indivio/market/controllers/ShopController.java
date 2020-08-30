package ru.indivio.market.controllers;

import ru.indivio.market.entities.Product;
import ru.indivio.market.services.ProductService;
import ru.indivio.market.services.ShoppingCartService;
import ru.indivio.market.utils.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {
    private ProductService productService;
    private ShoppingCartService shoppingCartService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    public void setShoppingCartService(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("")
    public String shopPage(Model model) {
        List<Product> allProducts = productService.getAllProducts();
        model.addAttribute("products", allProducts);
        return "shop-page";
    }
    @GetMapping("/min")
    public String shopMinPricePage(Model model) {
        List<Product> allProducts = productService.getProductsWitMinPrice();
        model.addAttribute("products", allProducts);
        return "shop-page";
    }

    @GetMapping("/max")
    public String shopMaxPricePage(Model model) {
        List<Product> allProducts = productService.getProductsWitMaxPrice();
        model.addAttribute("products", allProducts);
        return "shop-page";
    }

    @GetMapping("/minmax")
    public String shopMinMaxPricePage(Model model) {
        List<Product> allProducts = productService.getProductsWitMinMaxPrice();
        model.addAttribute("products", allProducts);
        return "shop-page";
    }


    @GetMapping("/ajax")
    public String ajaxShopPage(Model model) {
       // List<Product> allProducts = productService.getAllProducts();
       // model.addAttribute("products", allProducts);
        return "shop-page-ajax";
    }

    @GetMapping("/cart")
    public String cartPage(Model model, HttpServletRequest httpServletRequest) {
        model.addAttribute("cart", shoppingCartService.getCurrentCart(httpServletRequest.getSession()));
        return "cart-page";
    }

    @GetMapping("/cart/add/{id}")
    public String addProductToCartById(Model model, HttpServletRequest httpServletRequest, @PathVariable(name = "id") Long id) {
        shoppingCartService.addToCart(httpServletRequest.getSession(), id);
        return "redirect:/shop";
    }

    @GetMapping("/cart/remove/{id}")
    public String removeProductFromCartById(Model model, HttpServletRequest httpServletRequest, @PathVariable(name = "id") Long id) {
        shoppingCartService.removeFromCart(httpServletRequest.getSession(), id);
        return "redirect:/shop/cart";
    }
}
