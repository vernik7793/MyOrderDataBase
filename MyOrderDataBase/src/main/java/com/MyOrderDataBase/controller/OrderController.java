package com.MyOrderDataBase.controller;

import com.MyOrderDataBase.entity.Order;
import com.MyOrderDataBase.service.OrderService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;

    @Autowired(required = true)
    //@Qualifier(value = "orderService")
    public void setNoteService(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String listOrders(Model model) {
        /*model.addAttribute("order", new Order());
        model.addAttribute("listOrders", this.orderService.listOrders());
*/
        String str = "qqq";
        model.addAttribute(str);
        return "orders/list";
    }
/*
    @RequestMapping(value = "/notes/add", method = RequestMethod.POST)
    public String addNote(@ModelAttribute("note") Note note){
        if (note.getId()==0){
            this.orderService.addNote(note);
        }
        else {
            this.orderService.updateNote(note);
        }

        return "redirect:/notes";
    }

    @RequestMapping("/remove/{id}")
    public String removeNote(@PathVariable("id") int id){
        this.orderService.removeNote(id);

        return "redirect:/notes";
    }

    @RequestMapping("edit/{id}")
    public String editNote(@PathVariable("id") int id, Model model){
        model.addAttribute("note", this.orderService.getNoteById(id));
        model.addAttribute("listNotes", this.orderService.listNotes());

        return "notes";
    }

    @RequestMapping("notedata/{id}")
    public String noteData(@PathVariable("id") int id, Model model){
        model.addAttribute("note", this.orderService.getNoteById(id));

        return "notedata";
    }*/
}