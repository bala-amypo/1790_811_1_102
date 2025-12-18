@RestController
@RequestMapping("/alerts")
public class AlertController {

    @Autowired
    private AlertLogRepository repo;

    @GetMapping
    public List<AlertLog> getLogs() {
        return repo.findAll();
    }
}
