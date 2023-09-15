package Interfaces;

import dto.VeterinariaDTO;

import java.io.IOException;
import java.util.List;

public interface Iveterinaria {
    VeterinariaDTO findById(int id);
    List<VeterinariaDTO> findAll() throws IOException, ClassNotFoundException;
    void save(VeterinariaDTO veterinaria) throws IOException, ClassNotFoundException;
    void update(VeterinariaDTO veterinaria) throws IOException, ClassNotFoundException;
    void delete(VeterinariaDTO vete) throws IOException, ClassNotFoundException;
}
