package dbpetclinicweb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone")
    private String telephone;


}
