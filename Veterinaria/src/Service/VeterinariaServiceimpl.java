package Service;

import Interfaces.Iveterinaria;
import dto.VeterinariaDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VeterinariaServiceimpl implements Iveterinaria {
    private List<VeterinariaDTO> veterinarias;

    public VeterinariaServiceimpl() throws IOException, ClassNotFoundException {
        veterinarias = new ArrayList<>();
    }

    @Override
    public VeterinariaDTO findById(int id) {
        return veterinarias.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<VeterinariaDTO> findAll() throws IOException, ClassNotFoundException {
        veterinarias = (List<VeterinariaDTO>) ObjectSerializer.readObjectFromFile("productos.ax");
        return veterinarias;
    }

    @Override
    public void save(VeterinariaDTO veterinaria) throws IOException {
        veterinarias.add(veterinaria);
        ObjectSerializer.writeObjectToFile(veterinarias, "productos.ax");
    }

    @Override
    public void update(VeterinariaDTO veterinaria) throws IOException {
        VeterinariaDTO oldveterinaria = findById(veterinaria.getId());
        if (oldveterinaria != null) {
            veterinarias.remove(oldveterinaria);
            veterinarias.add(veterinaria);
            ObjectSerializer.writeObjectToFile(veterinarias, "productos.ax");
        }
    }

    @Override
    public void delete(VeterinariaDTO veterinaria) throws IOException {
        veterinarias.remove(veterinaria);
        ObjectSerializer.writeObjectToFile(veterinaria, "productos.ax");
    }
}

