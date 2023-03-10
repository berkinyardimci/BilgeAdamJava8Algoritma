package lesson023.service;

import lesson023.entity.data.User;
import lesson023.entity.database.DataBase;

public class UserManager {

	DataBase dataBase;
	
	public UserManager() {
		dataBase = new DataBase();
	}

	public User userMailKontrol(String mail) {
		for (int i = 0; i < DataBase.getUserList().size(); i++) {
			if (DataBase.getUserList().get(i).getEmail().equals(mail)) {
				return DataBase.getUserList().get(i);
			}
		}
		System.out.println("User Bulunamadı");
		return null;
	}
	//void bir değer döndürmeyen metotlar
	public boolean userSifreKontrol(String password) {
		for (int i = 0; i < DataBase.getUserList().size(); i++) {
			if (DataBase.getUserList().get(i).getPassword().equals(password)) {
				return true;
			}
		}
		System.out.println("Şifre Yanlış");
		return false;
	}
}
