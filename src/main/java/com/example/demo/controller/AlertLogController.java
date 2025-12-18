@RestController
@RequestMapping("/alert-logs")
public class AlertLogController {

    @Autowired
    private AlertLogService service;

    @PostMapping
    public AlertLog add(@RequestBody AlertLog alertLog) {
        return service.save(alertLog);
    }

    @GetMapping
    public List<AlertLog> getAll() {
        return service.getAll();
    }
}
