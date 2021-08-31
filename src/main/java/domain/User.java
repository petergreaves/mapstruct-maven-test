package domain;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;
    private String email;
}
