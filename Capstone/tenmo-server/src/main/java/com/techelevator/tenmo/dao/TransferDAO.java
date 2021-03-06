package com.techelevator.tenmo.dao;

import java.util.List;

import com.techelevator.tenmo.model.Transfer;

public interface TransferDAO {

	public Transfer createTransfer(Transfer transfer);
	public List<Transfer> getListOfTransfersByAccountId(int accountId);
}
