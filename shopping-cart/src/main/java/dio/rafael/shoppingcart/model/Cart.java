package dio.rafael.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "cart")
public class Cart {
    @Id
    private Integer id;
    private List<Item> items;

    public Cart(Integer id){
        this.id = id;
        items = new ArrayList<Item>();
    }
}
