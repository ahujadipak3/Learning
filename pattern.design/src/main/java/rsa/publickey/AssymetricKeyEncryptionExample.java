package rsa.publickey;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class AssymetricKeyEncryptionExample {

	public static void main(String[] args) {

		InputStream is = AssymetricKeyEncryptionExample.class.getResourceAsStream("/sprinreddit.jks");

		try {
			KeyStore keystorre = KeyStore.getInstance("JKS");
			keystorre.load(is, "changeit".toCharArray());
			PrivateKey privateKey = (PrivateKey)keystorre.getKey("springreddit", "changeit".toCharArray());
			
			PublicKey publicKey = (PublicKey)keystorre.getCertificate("springreddit").getPublicKey();
			System.out.println(publicKey.toString());
			
			
			
		} catch (UnrecoverableKeyException | NoSuchAlgorithmException | CertificateException | KeyStoreException
				| IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
