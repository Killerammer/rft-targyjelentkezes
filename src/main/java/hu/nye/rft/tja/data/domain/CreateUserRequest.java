package hu.nye.rft.tja.data.domain;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

/**
 * Represents a CREATE request and contains necessary data about the user.
 */
@Builder
@Data
public class CreateUserRequest {

    @NotBlank(message = "Name is mandatory")
    private String userName;
    @NotBlank(message = "Email is mandatory")
    private String emailAddress;
    //private ShoppingListView shoppingList;
}
