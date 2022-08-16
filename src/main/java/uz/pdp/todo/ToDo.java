package uz.pdp.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToDo {

    private Integer id;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


}
