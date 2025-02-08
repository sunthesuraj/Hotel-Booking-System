package com.staywell.dto.request;

import java.math.BigDecimal;

import com.staywell.enums.RoomType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomRequest {

	@NotNull
	private char[] password;

	@Min(1)
	private Integer roomNumber;

	@NotNull
	@Enumerated(EnumType.STRING)
	private RoomType roomType;

	@Min(1)
	private Integer noOfPerson;

	@Min(100)
	private BigDecimal price;

	@NotNull
	private Boolean available;

}
