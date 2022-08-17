package uz.pdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uz.pdp.todo.Dao;
import uz.pdp.todo.ToDo;


import java.time.LocalDateTime;

@Controller
@RequestMapping("/todo")
public class TaskController {


    private final Dao dao;

    @Autowired
    public TaskController(Dao dao) {
        this.dao = dao;
    }


    @GetMapping("/view")
    public String getAllTodo(Model model) {

        model.addAttribute("todoList", dao.toDoList());
        return "view";
    }


    @GetMapping("/get-form")
    public String forward() {
        return "add-todo";
    }



    @PostMapping("/save")
    public String save(ToDo toDo) {
        dao.Save(toDo);
        LocalDateTime localDateTime1=toDo.getStartdate();
        LocalDateTime localDateTime2=toDo.getEnddate();
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
       // model.addAttribute("todoList", dao.toDoList());

        return "view";
    }


    @GetMapping("/update-form")
    public String forwardApdate(Integer id, Model model) {

        model.addAttribute("todo", dao.getTodoById(id));

        return "update";
    }



    @PostMapping("/update")
    public String update(ToDo toDo,Model model){
        dao.update(toDo);
        model.addAttribute("todoList",dao.toDoList());
        return "view";
    }


    @GetMapping("/delete")
    public String delete(Integer id,Model model){
        dao.delete(id);
        model.addAttribute("todoList",dao.toDoList());

        return "view";
    }

}
