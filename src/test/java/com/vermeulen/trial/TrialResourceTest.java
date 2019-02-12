package com.vermeulen.trial;

import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

class TrialResourceTest extends AbstractResourceTest<TrialResource> {

    TrialResourceTest() {
        super(TrialResource.class, "/trialResource.json");
    }

    @BeforeEach
    void beforeEach(){
        resource = new TrialResource(Instant.parse("2019-02-12T07:37:45.741Z"),
                LocalDate.parse("2019-02-12"),
                LocalDateTime.parse("2019-02-12T08:37:45.749"),
                BigDecimal.valueOf(15));
    }
}
