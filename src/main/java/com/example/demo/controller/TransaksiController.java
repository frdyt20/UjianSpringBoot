package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Transaksi;
import com.example.demo.service.TransaksiService;

@RestController
public class TransaksiController {
	
	@Autowired
	private TransaksiService transaksiService;
	
	@PostMapping("/addNewTransaksi")
	public Transaksi addNewTransaksi(
			@RequestBody Transaksi transaksi) {
		return transaksiService.saveTransaksi(transaksi);
	}
	
}
