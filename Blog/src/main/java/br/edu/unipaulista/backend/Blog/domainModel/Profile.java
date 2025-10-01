package br.edu.unipaulista.backend.Blog.domainModel;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Profile {
    private @Getter @Setter long id;
    private @Getter @Setter String bio;
    private @Getter @Setter String pictureUrl;
    private @Getter @Setter String user;
}
