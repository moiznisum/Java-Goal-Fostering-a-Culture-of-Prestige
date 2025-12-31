# Spring Boot & Java Learning Examples

This repository contains practical Java and Spring Boot code examples covering core topics for learning and mentoring purposes.  
The goal is to demonstrate hands-on understanding of Java fundamentals, concurrency, Spring Boot features, JPA, REST APIs, security, testing, and performance optimization.

---

## Topics Covered

### 1. Java Memory Model & Garbage Collection
- Heap vs Stack allocation and object lifecycle
- Visibility guarantees using `volatile` and `synchronized`
- Memory leak examples and fixes using `WeakReference`
- Object reuse to reduce GC overhead

### 2. Java Concurrency & Multithreading
- Thread creation (`Thread`, `Runnable`)
- Race conditions and synchronization
- Locks (`ReentrantLock`) and thread-safe collections
- Executor framework for thread pooling

### 3. Spring Boot Auto-Configuration
- How `@SpringBootApplication` drives auto-configuration
- Conditional configuration with `@ConditionalOnClass`
- Excluding auto-configuration when necessary
- Auto-configuration reports

### 4. Spring Profiles & Configuration Management
- Environment-specific profiles (`dev`, `test`, `prod`)
- `application-{profile}.properties` usage
- Activating profiles programmatically
- `@Profile` annotation for beans

### 5. Spring Data JPA & Performance Tuning
- JPA repositories for CRUD operations
- Lazy vs eager loading
- Pagination and indexing
- Query performance optimization

### 6. Transaction Management
- `@Transactional` for atomic operations
- Propagation behaviors and rollback handling
- Best practices for data consistency

### 7. REST API Design Best Practices
- Resource modeling and HTTP methods
- Validation and error handling
- Versioning and clean API design

### 8. Spring Security Fundamentals
- Basic authentication and role-based access
- Password encoding with `BCryptPasswordEncoder`
- Securing REST endpoints

### 9. Exception Handling & Observability
- Global exception handling with `@ControllerAdvice`
- Logging with SLF4J / Logback
- Custom error responses

### 10. Asynchronous Processing & Messaging
- `@Async` for async execution
- Spring AMQP producer and consumer examples
- Messaging using queues and exchanges

### 11. Testing Strategies (Unit & Integration)
- JUnit unit tests
- Mockito for mocking dependencies
- Spring Boot integration tests with `MockMvc`

### 12. Application Performance & Scalability
- Caching with `@Cacheable`
- Thread pools for scalable processing
- Application metrics using `MeterRegistry`
