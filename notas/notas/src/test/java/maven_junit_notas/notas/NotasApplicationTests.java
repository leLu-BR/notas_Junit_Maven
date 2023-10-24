package maven_junit_notas.notas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NotasApplicationsApplicationTests {

	@Test
	void dezeNoveRetornaF(){
		NotasApplication n = new NotasApplication();
		assertEquals('F', n.retornaConceitoNota(Float.parseFloat("19.0")));
	}

	@Test
	void vinteNoveRetornaE(){
		NotasApplication n = new NotasApplication();
		assertEquals('E', n.retornaConceitoNota(Float.parseFloat("29.0")));
	}

	@Test
	void quarentaRetornaD() {
		NotasApplication n = new NotasApplication();
		assertEquals('D', n.retornaConceitoNota(Float.parseFloat("40.0")));
	}

	@Test
	void cinquentaRetornaC() {
		NotasApplication n = new NotasApplication();
		assertEquals('C', n.retornaConceitoNota(Float.parseFloat("50.0")));
	}

	@Test
	void sessentaNoveRetornaC() {
		NotasApplication n = new NotasApplication();
		assertEquals('C', n.retornaConceitoNota(Float.parseFloat("69.0")));
	}

	@Test
	void setentaUmRetornaB() {
		NotasApplication n = new NotasApplication();
		assertEquals('B', n.retornaConceitoNota(Float.parseFloat("71.0")));
	}

	@Test
	void oitentaNoveRetornaB() {
		NotasApplication n = new NotasApplication();
		assertEquals('B', n.retornaConceitoNota(Float.parseFloat("89.0")));
	}

	@Test
	void noventaUmRetornaA() {
		NotasApplication n = new NotasApplication();
		assertEquals('A', n.retornaConceitoNota(Float.parseFloat("91.0")));
	}

	/*Testes adicionais de ponto de corte */

	@Test
	void vinteRetornaE(){
		NotasApplication n = new NotasApplication();
		assertEquals('E', n.retornaConceitoNota(Float.parseFloat("20.0")));
	}

	@Test
	void trintaRetornaD(){
		NotasApplication n = new NotasApplication();
		assertEquals('D', n.retornaConceitoNota(Float.parseFloat("30.0")));
	}

	
	@Test
	void setentaRetornaB() {
		NotasApplication n = new NotasApplication();
		assertEquals('B', n.retornaConceitoNota(Float.parseFloat("70.0")));
	}

	@Test
	void noventaRetornaA() {
		NotasApplication n = new NotasApplication();
		assertEquals('A', n.retornaConceitoNota(Float.parseFloat("90.0")));
	}
	@Test
	void contextLoads() {
	}

}
