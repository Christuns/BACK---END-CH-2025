package br.edu.unipaulista.backend.Blog.domainModel;

import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role {
    private @Getter @Setter long id;
    private @Getter @Setter String name;
    private @Getter @Setter Set<User> user;
}
