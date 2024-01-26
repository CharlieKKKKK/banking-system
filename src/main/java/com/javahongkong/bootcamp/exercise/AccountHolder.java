package com.javahongkong.bootcamp.exercise;

import java.util.Objects;

public abstract class AccountHolder {
	private int idNumber;

	/**
	 * @param idNumber The government-issued ID used during account setup.
	 */
	public AccountHolder(int idNumber) {
		// complete the function
		this.idNumber = idNumber;

	}

	/**
	 * @return private int {@link AccountHolder#idNumber}
	 */
	public int getIdNumber() {
		// complete the function
		return this.idNumber;
	}

	// public abstract int getSomething();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AccountHolder))
			return false;
		AccountHolder accountHolder = (AccountHolder) obj;
		return Objects.equals(this.idNumber, accountHolder.getIdNumber());
	}

	@Override
	public int hashCode(){
		return Objects.hash(this.idNumber);
	}
}
