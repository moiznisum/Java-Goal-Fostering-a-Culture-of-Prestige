public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmail(String email);
}
