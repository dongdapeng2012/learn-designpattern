package springbootmvc.service;

import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import springbootmvc.constant.NeuronConstant;
import springbootmvc.dao.NewDao;
import springbootmvc.domain.NeuronLink;

public abstract class BaseServiceImpl {
	@Autowired
	NewDao newDao;

	Set<NeuronLink> neuronLinks;

	public long getRandomId(long maxNeuron) {
		return (long) (NeuronConstant.maxNeuron * (new Random().nextDouble()));
	}
	
	
}
