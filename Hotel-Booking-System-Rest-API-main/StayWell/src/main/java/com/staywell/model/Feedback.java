package com.staywell.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feedback {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @JsonProperty(access = Access.READ_ONLY)
	private Integer feedbackId;

	@ManyToOne(fetch = FetchType.EAGER)
	private Hotel hotel;

	@ManyToOne(fetch = FetchType.EAGER)
	private Customer customer;

	@NotNull @NotEmpty @NotBlank
	private String feedbackContent;
	@NotNull
	private Integer rating;

}
