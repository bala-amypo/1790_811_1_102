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
