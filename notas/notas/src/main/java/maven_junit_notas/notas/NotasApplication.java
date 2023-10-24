package maven_junit_notas.notas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotasApplication {

	char retornaConceitoNota(float nota) {
		if (nota < 20){
			return 'F';
		} else if(nota < 30){
			return 'E';
		} else if (nota < 50) {
			return 'D';
		} else if (nota < 70) {
			return 'C';
		} else if (nota < 90) {
			return 'B';
		} else {
			return 'A';
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(NotasApplication.class, args);
	}

}
