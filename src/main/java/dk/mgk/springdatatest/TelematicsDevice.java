package dk.mgk.springdatatest;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class TelematicsDevice {
    @Id
    @Type(type = "uuid-char")
    private UUID id;
    private String type;
    private String identifier;
    private Integer companyIdentifier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AssetId")
    private Asset asset;
}
