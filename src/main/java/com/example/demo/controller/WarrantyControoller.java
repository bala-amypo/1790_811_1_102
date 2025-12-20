import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
