@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setAdditionalProfiles("dev"); // activate dev profile
        app.run(args);
    }
}
