package com.space.anthony.stellar;

import android.os.Build;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Created by Anthony on 12/01/2018.
 */

public class User {
	public String username;
	public String email;
	private String passwordHash;

	public User() {
		// Default constructor required for calls to DataSnapshot.getValue(User.class)
	}

	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public void checkPassword(String attempt) {
		byte[] salt = new byte[16];
		//random.nextBytes(salt);
		KeySpec spec = new PBEKeySpec("password".toCharArray(), salt, 65536, 128);
		SecretKeyFactory f = null;
		try {
			f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			byte[] hash = f.generateSecret(spec).getEncoded();
			Base64.Encoder enc = null;
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
				enc = Base64.getEncoder();
				System.out.printf("salt: %s%n", enc.encodeToString(salt));
				System.out.printf("hash: %s%n", enc.encodeToString(hash));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
	}

}
