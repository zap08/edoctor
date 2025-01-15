package com.infosys.eDoctor.config;

import java.util.HashMap;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SecurityConfig.class})
@ExtendWith(SpringExtension.class)
class SecurityConfigDiffblueTest {
    @Autowired
    private SecurityConfig securityConfig;

    /**
     * Test {@link SecurityConfig#passwordEncoder()}.
     * <p>
     * Method under test: {@link SecurityConfig#passwordEncoder()}
     */
    @Test
    @DisplayName("Test passwordEncoder()")
    void testPasswordEncoder() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        securityConfig.passwordEncoder();
    }

    /**
     * Test {@link SecurityConfig#securityFilterChain(HttpSecurity)}.
     * <p>
     * Method under test: {@link SecurityConfig#securityFilterChain(HttpSecurity)}
     */
    @Test
    @DisplayName("Test securityFilterChain(HttpSecurity)")
    @Disabled("TODO: Complete this test")
    void testSecurityFilterChain() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: objectPostProcessor cannot be null
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AuthenticationManagerBuilder authenticationBuilder = new AuthenticationManagerBuilder(null);

        // Act
        securityConfig.securityFilterChain(new HttpSecurity(null, authenticationBuilder, new HashMap<>()));
    }
}
