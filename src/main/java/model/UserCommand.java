package model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserCommand {
    private String firstName;
    private String lastName;
    private String email;

}
