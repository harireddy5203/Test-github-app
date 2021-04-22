/*
 * Copyright (c) 2021 REPLACE_CUSTOMER_NAME. All rights reserved.
 *
 * This file is part of test-github-app-service.
 *
 * test-github-app-service project and associated code cannot be copied
 * and/or distributed without a written permission of REPLACE_CUSTOMER_NAME,
 * and/or its subsidiaries.
 */
package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class that is responsible to start the service and exposes the functionality over the specified
 * port.
 *
 * @author Mahalingam Iyer
 */
@SpringBootApplication
public class TestGithubAppServiceApplication {
    /**
     * Entry point method.
     *
     * @param args
     *         Arguments to the main program.
     */
    public static void main(String[] args) {
        SpringApplication.run(TestGithubAppServiceApplication.class);
    }
}
