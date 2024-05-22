package by.itclass.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.net.Proxy;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private int id;
    @Column(name = "fio")
    @NonNull
    private String name;
    @NonNull
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public User(@NonNull String name, @NonNull int age) {
        this.name = name;
        this.age = age;
    }
}
