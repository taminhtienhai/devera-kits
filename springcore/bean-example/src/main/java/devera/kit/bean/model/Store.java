package devera.kit.bean.model;

import devera.kit.bean.dependencies.CustomerService;
import devera.kit.bean.dependencies.ProductService;

public class Store {

    public CustomerService cusService;
    public ProductService prodService;
    
    public Store(CustomerService cusService, ProductService prodService) {
        this.cusService = cusService;
        this.prodService = prodService;
    }
    
}
