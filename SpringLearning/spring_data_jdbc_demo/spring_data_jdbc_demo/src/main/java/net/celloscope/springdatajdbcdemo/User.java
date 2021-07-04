package net.celloscope.springdatajdbcdemo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.Date;

@Data
public class User {
    @Id
    private Long id;
    private String userName;
    private String password;
    private String email;
    private Date createdTime;
    @Column("DOB")
    private Date dateOfBirth;
}
