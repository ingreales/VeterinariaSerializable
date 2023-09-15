package dto;

import java.io.Serializable;

public class VeterinariaDTO implements Serializable {
    public Integer id;
    private String nombreVeterinaria;

    private String Direccion;

    public VeterinariaDTO(Integer id, String nombreVeterinaria, String direccion, double ca) {

        this.id = id;
        this.nombreVeterinaria = nombreVeterinaria;
        Direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreVeterinaria() {
        return nombreVeterinaria;
    }

    public void setNombreVeterinaria(String nombreVeterinaria) {
        this.nombreVeterinaria = nombreVeterinaria;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "VeterinariaDTO{" +
                "id=" + id +
                ", nombreVeterinaria='" + nombreVeterinaria + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
