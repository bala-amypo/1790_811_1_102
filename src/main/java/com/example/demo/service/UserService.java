@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
