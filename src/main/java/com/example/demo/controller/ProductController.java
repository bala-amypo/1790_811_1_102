import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product add(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping("/user/{id}")
    public List<Product> getByUser(@PathVariable Long id) {
        return service.getByUser(id);
    }
}
