package in.mrkhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mrkhan.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
