package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transaksi;
import com.example.demo.repository.TransaksiRepository;

@Service
public class TransaksiService {
	
	@Autowired
	private TransaksiRepository transaksiRepository;
	
	public Transaksi saveTransaksi(Transaksi transaksi) {
		return transaksiRepository.save(transaksi);
	}
	
	public List<Transaksi> getTransaksi() {
		return transaksiRepository.findAll();
	}
	
	public Transaksi getById(int id) {
		return transaksiRepository.findById(id).orElse(null);
	}
	
	public String deleteTransaksi(int id) {
		transaksiRepository.deleteById(id);
		return "Transaksi Deleted";
	}
	
	public Transaksi updateTransaksi(Transaksi transaksi) {
		Transaksi existingTransaksi = transaksiRepository.findById(transaksi.getTrx_id()).orElse(null);
		existingTransaksi.setUser_id(transaksi.getUser_id());
		existingTransaksi.setCompany_id(transaksi.getCompany_id());
		existingTransaksi.setAmount(transaksi.getAmount());
		return transaksiRepository.save(existingTransaksi);
	}
}
