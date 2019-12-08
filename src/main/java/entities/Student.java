package entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private static final String ID_GENERATOR = "id_generator";
    private static final String ID_SEQUENCE = "id_sequence";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ID_GENERATOR)
    @SequenceGenerator(name= ID_GENERATOR, sequenceName = ID_SEQUENCE)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "class")
    private String group;
}
