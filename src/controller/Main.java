package controller;

import dao.ProductDao;
import dao.dto.ProductDto;
import dao.impl.ProductDaoImplH2;
import entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDaoImplH2();
        //Product product = new Product(2, "Xiaomi 450", 600);

        //productDao.insert(productDto);

        //productDao.update(product);

        productDao.delete(4);

        List<Product> products = productDao.getAll();
        for(Product p : products){
            System.out.println("ID: " + p.getId());
            System.out.println("Nombre: " + p.getName());
            System.out.println("Precio: " + p.getPrice());
            System.out.println("---------------------------------");
        }
    }
}