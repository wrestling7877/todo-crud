package uz.pdp.todo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Dao {

    private final JdbcTemplate jdbcTemplate;

    public Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }


    public void Save(ToDo toDo) {

        jdbcTemplate.update("insert into todo(startdate,enddate,description)values (?,?,?)",
                toDo.getStartdate(),
                toDo.getEnddate(),
                toDo.getDescription());
    }

    public List<ToDo> toDoList() {
        return jdbcTemplate.query("select * from todo", new BeanPropertyRowMapper<>(ToDo.class));

    }


    public ToDo getTodoById(Integer id) {

        return jdbcTemplate.query("select * from todo where id = ?",
                new Object[]{id}, new BeanPropertyRowMapper<>(ToDo.class)).stream().findAny().orElse(null);
    }


    public void update(ToDo toDo) {
        jdbcTemplate.update("update todo set startdate=?,enddate=?,description=? where id=?",
                toDo.getStartdate(),
                toDo.getEnddate(),
                toDo.getDescription(),
                toDo.getId());
    }


    public void delete(int id){
        jdbcTemplate.update(" delete from todo where id=?",id);
    }

}
