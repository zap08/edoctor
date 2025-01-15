package com.infosys.eDoctor.config;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ContextConfiguration(classes = {WebConfig.class})
@ExtendWith(SpringExtension.class)
class WebConfigDiffblueTest {
    @Autowired
    private WebConfig webConfig;

    /**
     * Test {@link WebConfig#corsConfigurer()}.
     * <p>
     * Method under test: {@link WebConfig#corsConfigurer()}
     */
    @Test
    @DisplayName("Test corsConfigurer()")
    void testCorsConfigurer() {
        // Arrange and Act
        WebMvcConfigurer actualCorsConfigurerResult = webConfig.corsConfigurer();

        // Assert
        assertNull(actualCorsConfigurerResult.getMessageCodesResolver());
        assertNull(actualCorsConfigurerResult.getValidator());
    }
}
