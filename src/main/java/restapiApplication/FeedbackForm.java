package restapiApplication;
import jakarta.persistence.*;
import lombok.Data;
import restapiApplication.TypeCategory;

import java.util.Date;

@Entity
@Data
@Table (name = "feedback")

public class FeedbackForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private TypeCategory typeCategory;

    private String title;

    private String description;

    private String reporter_name;

    private Date created_at;

    private String status;

}

