package com.shoping.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class ProductDTO {
	//Adding Validations

	@NotBlank(message = "Invalid name: Empty name")
	@NotNull(message = "Invalid name: Name is NULL")
	@Size(min = 3, max = 30, message = "Invalid Name: Must be of 3-25 characters")
	private String name;


	/*@NotNull(message = "Invalid Phone Number: number is NULL")
	@NotBlank(message = "Invalid Phone Number: Empty Number")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid phone Number !")
	private String phone;

	@NotNull
	@Email(message = "Invalid email")
	private String email;

	@NotBlank(message = "Invalid name: Empty name")
	@NotNull(message = "Invalid name: Name is NULL")
	private String grdYear;

	@NotBlank(message = "Invalid address: Empty address")
	@NotNull(message = "Invalid address: Address is NULL")
	@Size(min = 10, max = 50, message = "Invalid address: Must be of 10-50 characters")
	private String address;
	*/
	@NotBlank(message = "Invalid Model: Model name")
	@NotNull(message = "Invalid Model: Model is NULL")
	@Size(min = 3, max = 30, message = "Invalid Model: Must be of 3-25 characters")
	private String Model;
	@NotBlank(message = "Invalid serialName: serialName")
	@NotNull(message = "Invalid serialName: serialName is NULL")
	@Size(min = 3, max = 30, message = "Invalid serialName: Must be of 3-25 characters")

	private String serialName;

	@NotBlank(message = "Invalid description: description name")
	@NotNull(message = "Invalid description: description is NULL")
	@Size(min = 3, max = 30, message = "Invalid description: Must be of 3-25 characters")
	private String description;

	@NotBlank(message = "Invalid productname: product name")
	@NotNull(message = "Invalid productname: productname is NULL")
	@Size(min = 3, max = 30, message = "Invalid productname: Must be of 3-25 characters")
	private String publisher;

	@NotBlank(message = "Invalid category: category name")
	@NotNull(message = "Invalid category: category is NULL")
	@Size(min = 3, max = 30, message = "Invalid category: Must be of 3-25 characters")
	private String category;


	}

}
