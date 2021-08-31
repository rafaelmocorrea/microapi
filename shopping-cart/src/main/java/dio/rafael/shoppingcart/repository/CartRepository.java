package dio.rafael.shoppingcart.repository;

import dio.rafael.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Integer> {
}
