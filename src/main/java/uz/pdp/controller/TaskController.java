package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uz.pdp.todo.Dao;
import uz.pdp.todo.ToDo;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TaskController {


    private final Dao dao;

    @Autowired
    public TaskController(Dao dao) {
        this.dao = dao;
    }


    @GetMapping
    public String getAllTasks(Model model) {
        List<String> strings = Arrays.asList("A", "B", "C");
        model.addAttribute("names", strings);
        return "view";
    }


    @GetMapping("/get-form")
    public String forward() {
        return "add-todo";
    }


    @PostMapping("/save")
    public String saveNewTask(ToDo toDo) {
      dao.Save(toDo);
        System.out.println(toDo);
        LocalDateTime startTime = toDo.getStartTime();
        LocalDateTime endTime = toDo.getEndTime();


        System.out.println(startTime);
        System.out.println(endTime);


        return "view";
    }
}
