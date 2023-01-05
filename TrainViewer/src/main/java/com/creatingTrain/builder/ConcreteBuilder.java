package com.creatingTrain.builder;

import java.util.ArrayList;
import java.util.List;

import com.creatingTrain.factory.FRFactory;
import com.creatingTrain.factory.TNFactory;
import com.creatingTrain.factory.VagoneFactory;
import com.creatingTrain.treno.Cargo;
import com.creatingTrain.treno.Carrozza;
import com.creatingTrain.treno.Locomotiva;
import com.creatingTrain.treno.Passeggeri;
import com.creatingTrain.treno.Ristorante;
import com.creatingTrain.treno.Treno;

public class ConcreteBuilder extends TrenoBuilder{
	private VagoneFactory factory;
	
	public ConcreteBuilder(VagoneFactory vagoneFactory) {
		this.factory = vagoneFactory;
	}

	@Override
	public Locomotiva getLocomotiva() {
		// TODO Auto-generated method stub
		return factory.getLocomotiva();

	}

	@Override
	protected Passeggeri getPasseggeri() {
		// TODO Auto-generated method stub
		return factory.getPasseggeri();
	}

	@Override
	protected Cargo getCargo() {
		// TODO Auto-generated method stub
		return factory.getCargo();
	}

	@Override
	protected Ristorante getRistorante() {
		// TODO Auto-generated method stub
		return factory.getRistorante();
	}

	@Override
	protected int getMassimoPosti() {
		// TODO Auto-generated method stub
		return factory.getMassimoPosti();
	}

		
	
	 
}
