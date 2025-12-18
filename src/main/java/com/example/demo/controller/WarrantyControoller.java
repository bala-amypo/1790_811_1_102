@RestController
@RequestMapping("/warranties")
public class WarrantyController {

    @Autowired
    private WarrantyService service;

    @PostMapping
    public Warranty add(@RequestBody Warranty warranty) {
        return service.save(warranty);
    }

    @GetMapping
    public List<Warranty> getAll() {
        return service.getAll();
    }
}
