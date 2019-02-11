package com.vermeulen.trialInstant;

import java.time.Instant;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrialInstantController {
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public TrialInstant getOne() {
		TrialInstant trialInstant = new TrialInstant(Instant.now());
        return trialInstant;
    }
}