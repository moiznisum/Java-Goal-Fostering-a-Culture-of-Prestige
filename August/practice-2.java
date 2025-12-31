@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin")
public String adminEndpoint() { return "Admin only"; }
