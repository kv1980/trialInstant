package com.vermeulen.trial;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrialController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpStatus createOne(@RequestBody TrialResource trialResource) {
        TrialResource resource = trialResource;
        System.out.println(resource.toString());
        return HttpStatus.CREATED;
    }

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public TrialResource getOne() {
		TrialResource trialResource = new TrialResource(Instant.now(), LocalDate.now(), LocalDateTime.now(), BigDecimal.TEN);
        return trialResource;
    }
}