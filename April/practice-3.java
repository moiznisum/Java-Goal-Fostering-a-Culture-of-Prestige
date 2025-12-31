@Profile("dev")
@Bean
public String devBean() {
    return "Dev environment bean";
}
