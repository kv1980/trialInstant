package com.vermeulen.trial;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TrialResource {
	private Instant instant;
	private LocalDate date;
	private LocalDateTime dateTime;
	private BigDecimal getal;

	public TrialResource() {
	}

	public TrialResource(Instant instant, LocalDate date, LocalDateTime dateTime, BigDecimal getal) {
		this.instant = instant;
		this.date = date;
		this.dateTime = dateTime;
		this.getal = getal;
	}

	public Instant getInstant() {
		return instant;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public BigDecimal getGetal() {
		return getal;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TrialResource that = (TrialResource) o;

		if (instant != null ? !instant.equals(that.instant) : that.instant != null) return false;
		if (date != null ? !date.equals(that.date) : that.date != null) return false;
		if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null) return false;
		return getal != null ? getal.equals(that.getal) : that.getal == null;
	}

	@Override
	public int hashCode() {
		int result = instant != null ? instant.hashCode() : 0;
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
		result = 31 * result + (getal != null ? getal.hashCode() : 0);
		return result;
	}
}
