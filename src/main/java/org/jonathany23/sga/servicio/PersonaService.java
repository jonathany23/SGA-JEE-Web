package org.jonathany23.sga.servicio;

import org.jonathany23.sga.domain.Persona;

import javax.ejb.Local;
import java.util.List;

//Comunicacion Cliente - Servidor a traves de Interfaz Local
//Se utiliza cuando la interfaz se encuentra en el mismo servidor Java
//NO INTERFACE Variante y simplificacion de EJB's locales

//declaracion de metodos de negocio que son visibles al cliente

@Local
public interface PersonaService {

    public List<Persona> listarPersonas();

    public Persona buscarPersonaPorId(Persona persona);

    public Persona buscarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
