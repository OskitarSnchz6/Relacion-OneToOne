package net.codejava.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "AUTHOR")
public class Author {
    private long id;
    private String name;
    private String email;
     
    public Author() {
    }
             
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
 
    @Id
    @Column(name = "AUTHOR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }  
}