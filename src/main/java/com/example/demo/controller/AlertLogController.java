import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
