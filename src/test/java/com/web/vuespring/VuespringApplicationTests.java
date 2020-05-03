package com.web.vuespring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = "com.web.vuespring.dao")
class VuespringApplicationTests {

    @Test
    void contextLoads() {
    }

}
