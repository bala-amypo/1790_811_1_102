@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product save(Product product) {
        return repo.save(product);
    }

    public List<Product> getByUser(Long userId) {
        return repo.findByUserId(userId);
    }
}
