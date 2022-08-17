package uz.pdp.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToDo {

    private Integer id;
    private String description;
    private LocalDateTime startdate;
    private LocalDateTime enddate;


}
