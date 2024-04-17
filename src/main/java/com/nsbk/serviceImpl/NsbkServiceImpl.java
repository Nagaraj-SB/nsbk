package com.nsbk.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsbk.entity.Former;
import com.nsbk.repository.NsbkRepository;
import com.nsbk.service.NsbkService;

@Service
public class NsbkServiceImpl implements NsbkService {
	
	@Autowired
	NsbkRepository nsbkRepository;

	@Override
	public Former saveFormer(Former former) {
		return nsbkRepository.save(former);
	}

	@Override
	public Former getFormer(int formerId) {

		return nsbkRepository.getById(formerId);
	}

	@Override
	public List<Former> getAllFormer() {
		return nsbkRepository.findAll();
	}

}
