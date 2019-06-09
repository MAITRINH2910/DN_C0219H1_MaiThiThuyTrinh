package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductController extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();

    private void createCustomer(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        String note = request.getParameter("note");
        String producer = request.getParameter("producer");
        int id = (int)(Math.random()*10000);

        Product product = new Product(id, name, price, note, producer);
        this.productService.save(product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/create.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/create.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if (product == null){
            RequestDispatcher dispatcher= request.getRequestDispatcher("error-404.jsp");
        } else {
            this.productService.remove(id);
            try {
                response.sendRedirect("/products");
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product",product);
            dispatcher =request.getRequestDispatcher("/WEB-INF/views/delete.jsp");
        } try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void listProducts(HttpServletRequest req, HttpServletResponse res){
        List<Product> products = this.productService.findAll();
        req.setAttribute("products", products);

        RequestDispatcher dispatcher= req.getRequestDispatcher("/WEB-INF/views/list.jsp");
        try {
            dispatcher.forward(req, res);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
               createCustomer(req,resp);
                break;
            case "update":
               // updateCustomer(req,resp);
                break;
            case "delete":
              deleteProduct(req,resp);
                break;
            default:
                break;
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
               showCreateCustomer(req,resp);
                break;
            case "update":
               // showEditForm(req,resp);
                break;
            case "delete":
              showDeleteForm(req,resp);
                break;
            case "view":
               // viewCustomer(req,resp);
                break;
            default:
                listProducts(req, resp);
                break;
        }
    }
}
