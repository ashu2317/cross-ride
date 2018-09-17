package com.crossover.techtrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author crossover
 *
 */
@SpringBootApplication(scanBasePackages = "com.crossover.techtrial")
public class CrossRideApplication {
  public static void main(String[] args) {
    SpringApplication.run(CrossRideApplication.class, args);
  }
}
