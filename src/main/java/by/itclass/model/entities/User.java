package by.itclass.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fio")
    @NonNull
    private String name;
    @NonNull
    private int age;
}
