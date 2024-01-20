package scaler.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bms_user")
public class User extends BaseModel {
    private String username;
    private String password;
}
