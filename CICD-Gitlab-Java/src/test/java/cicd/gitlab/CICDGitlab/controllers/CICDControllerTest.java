package cicd.gitlab.CICDGitlab.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class CICDControllerTest {

    CICDController cicdController;

    @BeforeEach
    void setUp() {
        cicdController = new CICDController();
    }

    @Test
    void getCICD() {
        assertEquals(ResponseEntity.status(HttpStatus.OK).body("OK"), cicdController.getCICD());
    }
}