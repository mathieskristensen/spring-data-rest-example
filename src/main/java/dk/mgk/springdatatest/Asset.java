package dk.mgk.springdatatest;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Asset {
    @Id
    @Type(type = "uuid-char")
    private UUID id;
    private String name;
    private String type;
    private String subType;
    private String description;
}
