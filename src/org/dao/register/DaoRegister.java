package org.dao.register;

import java.util.List;

import org.modelo.register.Register;

//Cual es la diferencia entre una interfaz y una clase:
//Interfaz: solo se agregan los m�todos que se van a implementar, es decir la estructura del m�todo
//Clase se agregan  los metodos y la programaci�n.
public interface DaoRegister 
{
	public void addRegister(Register register);
	public List<Register>listRegisters();
	public Register getRegisterById(int id);
	public void deleteRegister(int id);
	
	
}
