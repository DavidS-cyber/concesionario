package com.concesionario.controller;

import com.concesionario.model.Cliente;
import com.concesionario.model.Vehiculo;
import com.concesionario.repository.ClienteRepository;
import com.concesionario.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConcesionarioController {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

   
    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }


    @GetMapping("/")
    public String root() {
        return "redirect:/inicio";
    }


    @GetMapping("/listadoVehiculos")
    public String listadoVehiculos(Model model) {
        model.addAttribute("vehiculos", vehiculoRepository.findAll());
        return "listadoVehiculos";
    }


    @GetMapping("/listadoClientes")
    public String listadoClientes(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll());
        return "listadoClientes";
    }


    @GetMapping("/altaVehiculo")
    public String altaVehiculoForm(Model model) {
        model.addAttribute("vehiculo", new Vehiculo());
        return "altaVehiculo";
    }


    @PostMapping("/altaVehiculo")
    public String altaVehiculoSubmit(@ModelAttribute Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
        return "redirect:/listadoVehiculos";
    }


    @GetMapping("/altaCliente")
    public String altaClienteForm(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "altaCliente";
    }

    @PostMapping("/altaCliente")
    public String altaClienteSubmit(@ModelAttribute Cliente cliente) {
        clienteRepository.save(cliente);
        return "redirect:/listadoClientes";
    }
}