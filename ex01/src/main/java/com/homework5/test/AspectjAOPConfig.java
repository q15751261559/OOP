package com.homework5.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.homework5")
@EnableAspectJAutoProxy
public class AspectjAOPConfig {
}
