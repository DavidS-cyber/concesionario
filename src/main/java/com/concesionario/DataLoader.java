package com.concesionario;

import com.concesionario.model.Cliente;
import com.concesionario.model.Vehiculo;
import com.concesionario.repository.ClienteRepository;
import com.concesionario.repository.VehiculoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VehiculoRepository vehiculoRepository;
    private final ClienteRepository clienteRepository;

    public DataLoader(VehiculoRepository vehiculoRepository, ClienteRepository clienteRepository) {
        this.vehiculoRepository = vehiculoRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (vehiculoRepository.count() == 0) {
            vehiculoRepository.save(new Vehiculo("Toyota", "Corolla", 2022, 22000.00, "Blanco"));
            vehiculoRepository.save(new Vehiculo("BMW", "Serie 3", 2023, 45000.00, "Negro"));
            vehiculoRepository.save(new Vehiculo("Ford", "Focus", 2021, 18500.00, "Rojo"));
            vehiculoRepository.save(new Vehiculo("Volkswagen", "Golf", 2022, 27000.00, "Azul"));
            vehiculoRepository.save(new Vehiculo("Seat", "León", 2023, 24000.00, "Gris"));
            vehiculoRepository.save(new Vehiculo("Renault", "Megane", 2020, 16000.00, "Blanco"));
            vehiculoRepository.save(new Vehiculo("Audi", "A4", 2023, 52000.00, "Plata"));
            vehiculoRepository.save(new Vehiculo("Mercedes", "Clase C", 2022, 58000.00, "Negro"));
            vehiculoRepository.save(new Vehiculo("Honda", "Civic", 2021, 21000.00, "Rojo"));
            vehiculoRepository.save(new Vehiculo("Hyundai", "Tucson", 2023, 32000.00, "Verde"));
        }

        if (clienteRepository.count() == 0) {
            clienteRepository.save(new Cliente("Carlos", "García López", "carlos@email.com", "612345678", "Madrid"));
            clienteRepository.save(new Cliente("Laura", "Martínez Ruiz", "laura@email.com", "623456789", "Barcelona"));
            clienteRepository.save(new Cliente("Pedro", "Sánchez Gil", "pedro@email.com", "634567890", "Valencia"));
            clienteRepository.save(new Cliente("Ana", "López Fernández", "ana@email.com", "645678901", "Sevilla"));
            clienteRepository.save(new Cliente("Miguel", "Torres Blanco", "miguel@email.com", "656789012", "Bilbao"));
            clienteRepository.save(new Cliente("Sara", "Díaz Moreno", "sara@email.com", "667890123", "Málaga"));
            clienteRepository.save(new Cliente("Javier", "Romero Vega", "javier@email.com", "678901234", "Zaragoza"));
            clienteRepository.save(new Cliente("Elena", "Jiménez Castro", "elena@email.com", "689012345", "Murcia"));
            clienteRepository.save(new Cliente("David", "Navarro Prieto", "david@email.com", "690123456", "Alicante"));
            clienteRepository.save(new Cliente("Marta", "Molina Serrano", "marta@email.com", "601234567", "Valladolid"));
        }
    }
}
