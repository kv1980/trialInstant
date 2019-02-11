package com.vermeulen.trialInstant;

import java.time.Instant;

public class TrialInstant {
	private final Instant instant;

	public TrialInstant(Instant instant) {
		this.instant = instant;
	}

	public Instant getInstant() {
		return instant;
	}
}
