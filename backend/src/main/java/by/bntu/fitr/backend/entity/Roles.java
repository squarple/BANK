package by.bntu.fitr.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;

@Getter
@Setter
@Entity
@Table(name = "roles" )
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;
    
    @Basic
    @Column(name = "descr")
    private String descr;
}
