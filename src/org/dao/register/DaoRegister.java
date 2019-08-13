package org.dao.register;

import java.util.List;

import org.modelo.register.Register;

//Cual es la diferencia entre una interfaz y una clase:
//Interfaz: solo se agregan los métodos que se van a implementar, es decir la estructura del método
//Clase se agregan  los metodos y la programación.
public interface DaoRegister 
{
	public void addRegister(Register register);
	public List<Register>listRegisters();
	public Register getRegisterById(int id);
	public void deleteRegister(int id);
	
	
}
