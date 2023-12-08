package mingeso.backendplanesservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "plan_estudios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private String cod_carr;
    private String cod_plan;
    private Integer nivel;
    private Integer cod_asig;
    private String nom_asig;
}

