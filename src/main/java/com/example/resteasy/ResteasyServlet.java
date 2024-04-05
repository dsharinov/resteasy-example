package com.example.resteasy;

import org.springframework.stereotype.Component;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@Component
@ApplicationPath("/rest")
public class ResteasyServlet extends Application {
}
