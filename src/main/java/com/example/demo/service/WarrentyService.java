@Service
public class WarrantyService {

    @Autowired
    private WarrantyRepository repo;

    public Warranty save(Warranty warranty) {
        return repo.save(warranty);
    }

    public List<Warranty> getAll() {
        return repo.findAll();
    }
}
