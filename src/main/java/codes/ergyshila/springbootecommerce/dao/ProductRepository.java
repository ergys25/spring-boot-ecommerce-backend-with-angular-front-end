package codes.ergyshila.springbootecommerce.dao;

import codes.ergyshila.springbootecommerce.entiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
