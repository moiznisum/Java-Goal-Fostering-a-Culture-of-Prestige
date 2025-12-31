@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{id}") public User getUser(@PathVariable Long id) { ... }
}
