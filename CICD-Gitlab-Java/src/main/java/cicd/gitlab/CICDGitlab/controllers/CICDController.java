package cicd.gitlab.CICDGitlab.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CICDController {

    @GetMapping
    public ResponseEntity<String> getCICD(){
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

}