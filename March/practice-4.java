package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport;

@SpringBootApplication
public class AutoConfigReportExample {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AutoConfigReportExample.class, args);

        // Print auto-configuration report
        ConditionEvaluationReport report = ConditionEvaluationReport.get(context.getBeanFactory());
        report.getConditionAndOutcomesBySource().forEach((source, outcome) ->
                System.out.println(source + " -> " + outcome));
    }
}
