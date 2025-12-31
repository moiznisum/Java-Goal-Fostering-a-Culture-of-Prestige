@Autowired
private MeterRegistry meterRegistry;
meterRegistry.counter("requests.total").increment();
