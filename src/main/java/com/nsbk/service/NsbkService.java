package com.nsbk.service;

import java.util.List;

import com.nsbk.entity.Former;

public interface NsbkService {
	
	Former saveFormer(Former former);
	
	Former getFormer(int formerId);
	
	List<Former> getAllFormer();

}
