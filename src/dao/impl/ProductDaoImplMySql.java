package dao.impl;

import dao.ProductDao;
import dao.dto.ProductDto;
import entities.Product;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImplMySql implements ProductDao {
    @Override
    public void insert(ProductDto productDto) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int productId) {

    }
}
