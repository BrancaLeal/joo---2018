package model;

import interfaces.Quebravel;
import interfaces.Retornavel;

public class GarrafaVidro extends Garrafa implements Quebravel, Retornavel{
	
	public void jogarFora () {

}

	public Garrafa retornar () {
		return this;
	}

	@Override
	public Cacos quebrar() {
		// TODO Auto-generated method stub
		return null;
	}

}