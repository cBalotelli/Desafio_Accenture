package Steps;

import java.awt.AWTException;
import java.util.Date;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import Runners.*;

public class AutomobileInsuranceSteps {

	@Dado("que esteja no site da Tricentis na aba Vehicle Data")

	public void que_esteja_no_site_na_aba() {

		// Iniciando o Chrome
		Chrome.DriverChrome();
		// Encontrando e clicando no botão Automobile
		WebElement btnAuto = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav_automobile")));
		btnAuto.click();

		//
	}

	@Quando("selecionar a marca do veiculo na lista Make")
	public void selecionar_a_marca_do_veiculo_na_lista_make() {
		// Gerador de index aleatório
		Random rdmMake = new Random();
		int make = rdmMake.nextInt(16) + 1;
		System.out.println("Index gerado: " + make);

		// Encontrando o combobox Make
		WebElement comboMake = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("make")));

		// Selecionando um index aleatório

		Select cmbMake = new Select(comboMake);
		cmbMake.selectByIndex(make);

	}

	@E("preencher o campo Engine Performance")
	public void preencher_o_campo_engine_performance() {
		// Gerador de Engine performance

		Random rdmEngine = new Random();
		int engine = rdmEngine.nextInt(1000) + 1000;
		System.out.println("Engine gerada: " + engine);

		// Encontrando o campo Engine Performance
		WebElement cmpEngine = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("engineperformance")));
		// Preenchendo o campo com o engine aleatório gerado convertido para String
		cmpEngine.sendKeys(Integer.toString(engine));

		//
	}

	@E("preencher o campo Date of Manufacture")
	public void preencher_o_campo_date_of_manufacture() {
		// Gerador de dia, mês e ano

		Random rdmDia = new Random();
		int dia = rdmDia.nextInt(31) + 1;
		System.out.println("Dia gerado: " + dia);

		Random rdmMes = new Random();
		int mes = rdmMes.nextInt(12);
		System.out.println("Mês gerado: " + mes);

		Random rdmAno = new Random();
		int ano = rdmAno.nextInt(21) + 2000;
		System.out.println("Mês gerado: " + ano);

		// Encontrando o campo Date of Manufacture
		WebElement cmpData = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dateofmanufacture")));

		// Preenchendo o campo com condição se o mês for fevereiro

		if (mes == 2) {

			cmpData.sendKeys(mes + "/" + (dia - 2) + "/" + ano);

		} else {

			cmpData.sendKeys(mes + "/" + dia + "/" + ano);

		}

		//
	}

	@E("preencher o campo Number of Seats")
	public void preencher_o_campo_number_of_seats() {
		// Gerando o index de numero de assentos
		Random rdmSeat = new Random();
		int seat = rdmSeat.nextInt(9) + 1;
		System.out.println("Assento gerado: " + seat);
		// Encontrando o comboxAssento
		WebElement cmpAssentoElement = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("numberofseats")));

		// Selecionando o assento como index gerado

		Select assento = new Select(cmpAssentoElement);
		assento.selectByIndex(seat);

		//

	}

	@E("preencher o campo Fuel Type")
	public void preencher_o_campo_fuel_type() {
		// Gerando index de gasolina
		Random rdmFuel = new Random();
		int fuel = rdmFuel.nextInt(5) + 1;
		System.out.println("Fuel type gerado: " + fuel);

		// Encontrando o campo Fuel Type
		WebElement cmbfuel = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fuel")));

		// Selecionando o Fuel Type com index gerado

		Select combustivel = new Select(cmbfuel);
		combustivel.selectByIndex(fuel);

		//
	}

	@E("preencher o campo List Price")
	public void preencher_o_campo_list_price() {
		// Gerador de List Price
		Random rdmPrice = new Random();
		int price = rdmPrice.nextInt(500) + 10000;
		System.out.println("List price gerado: " + price);

		// Encontrando o campo List Price
		WebElement cmpPrice = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("listprice")));

		// Preenchendo o campo List Price
		cmpPrice.sendKeys(Integer.toString(price));

		//
	}

	@E("preencher o campo License Plate Number")
	public void preencher_o_campo_license_plate_number() {
		// Gerador de License Plate
		Random rdmLicense = new Random();
		int license = rdmLicense.nextInt(999999999);
		System.out.println("License plate gerado: " + license);

		// Encontrando o campo License Plate Number
		WebElement cmpLicense = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("licenseplatenumber")));

		// Preenchendo o campo License Plate Number convertido para String
		cmpLicense.sendKeys(Integer.toString(license));

		//
	}

	@E("preencher o campo Annual Mileage")
	public void preencher_o_campo_annual_mileage() {
		// Gerador de Annual Mileage
		Random rdmMileage = new Random();
		int mileage = rdmMileage.nextInt(50000) + 50000;
		System.out.println("Annual Mileage: " + mileage);

		// Encontrando o campo Annual Mileage
		WebElement cmpMileage = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("annualmileage")));

		// Preenchendo o campo Annual Mileage convertido em String
		cmpMileage.sendKeys(Integer.toString(mileage));

		//
	}

	@E("clicar no botao Next")
	public void clicar_no_botao_next() {
		// Encontrando o botão Next e clicando
		WebElement btnNext = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("nextenterinsurantdata")));
		// Clicando no botão Next
		btnNext.click();
	}

	@Entao("a aba e trocada para a outra aba Enter Insurant Data")
	public void a_aba_e_trocada_para_a_outra_aba_enter_insurant_data() {

		// Capturando o elemento da aba Enter Insurant data em xpath
		WebElement abaInsurant = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"idealsteps-nav\"]/ul/li[2]")));

		// CaptuCapturando o elemento da aba Enter Insurant data em class name
		WebElement abaInsurantClass = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.className("idealsteps-step-active")));

		// Condição para verificar que ao clicar em Next, foi para a aba Enter Insurant

		if (abaInsurant.equals(abaInsurantClass)) {

			System.out.println("Enter Insurant Data aberta");

		} else {

			System.out.println("Aba Enter Insurant Data não está aberta");
			Chrome.driver.close();
		}

		//
	}

	@Dado("que esteja na aba Enter Insurance Data")
	public void queEstejaNoSiteDaTricentisNaAbaEnterInsuranceData() {

		// Capturando o elemento da aba Enter Insurant data em xpath
		WebElement abaInsurant = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"idealsteps-nav\"]/ul/li[2]")));

		// CaptuCapturando o elemento da aba Enter Insurant data em class name
		WebElement abaInsurantClass = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.className("idealsteps-step-active")));

		// Condição para verificar que ao clicar em Next, foi para a aba Enter Insurant

		if (abaInsurant.equals(abaInsurantClass)) {

			System.out.println("Enter Insurant Data aberta");
		} else {
			System.out.println("Aba Enter Insurant Data não está aberta");
			Chrome.driver.close();
		}

	}

	@Quando("eu preencher o campo First Name")
	public void euPreencherOCampoFirstName() {
		// Procurando o campo Firt Name
		WebElement cmpFirst = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
		cmpFirst.sendKeys("Caique");

	}

	@Quando("preencher o campo Last Name")
	public void preencherOCampoLastName() {
		// Procurando o campo Firt Name
		WebElement cmpLast = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lastname")));
		cmpLast.sendKeys("Luz");

	}

	@Quando("preencher o campo Date of Birth")
	public void preencherOCampoDateOfBirth() {
		// Gerador de dia, mês e ano

		Random rdmDia = new Random();
		int dia = rdmDia.nextInt(31) + 1;
		System.out.println("Dia gerado: " + dia);

		Random rdmMes = new Random();
		int mes = rdmMes.nextInt(12);
		System.out.println("Mês gerado: " + mes);

		Random rdmAno = new Random();
		int ano = rdmAno.nextInt(54) + 1950;
		System.out.println("Mês gerado: " + ano);

		// Encontrando o campo Date of Manufacture
		WebElement cmpData = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("birthdate")));

		// Preenchendo o campo com condição se o mês for fevereiro

		if (mes == 2) {

			cmpData.sendKeys(mes + "/" + (dia - 2) + "/" + ano);

		} else {

			cmpData.sendKeys(mes + "/" + dia + "/" + ano);

		}
	}

	@Quando("preencher campo Gender")
	public void preencherCampoGender() {
		// Encontrando e clicando no radio button Gender
		WebElement cmpGender = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")));
		cmpGender.click();

	}

	@Quando("preencher o campo Street Address")
	public void preencherOCampoStreetAddress() {
		// encontrando o campo Street Adress
		WebElement cmpAdress = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("streetaddress")));
		cmpAdress.sendKeys("Avenida Leblon, 232");

	}

	@Quando("preencher o campo Country")
	public void preencherOCampoCountry() {

		// Encontrando o campo Country
		WebElement cmpCountry = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("country")));

		// Criando um seletor para o campo contry
		Select cmbCountry = new Select(cmpCountry);

		// Selecionando a opção que contém a palavra Brasil
		cmbCountry.selectByVisibleText("Brazil");

	}

	@Quando("preencher o campo Zip Code")
	public void preencherOCampoZipCode() {
		// Encontrando o campo Zip Code
		WebElement cmpZip = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("zipcode")));

		// Preenchendo o campo
		cmpZip.sendKeys("04771050");
	}

	@Quando("preencher o campo City")
	public void preencherOCampoCity() {
		// Encontrando o campo City
		WebElement cmpCity = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("city")));
		// Preenchendo o campo
		cmpCity.sendKeys("São Paulo");
	}

	@Quando("preencher o campo Occupation")
	public void preencherOCampoOccupation() {
		// Encontrando o campo Occupation
		WebElement cmpOccup = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("occupation")));

		// Criando um seletor para o campo Occupation
		Select cmbOccupation = new Select(cmpOccup);

		// Selecionando a opção que contém a palavra Employee
		cmbOccupation.selectByVisibleText("Employee");

	}

	@Quando("preencher o campo Hobbies")
	public void preencherOCampoHobbies() {
		// Encontrando o campo Hobbies e clicando em Skydiving
		WebElement cmpHob = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")));
		cmpHob.click();

	}

	@Quando("preencher o campo Website")
	public void preencherOCampoWebsite() {

		// Encontrando o campo Website
		WebElement cmpWeb = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("website")));

		// Preenchendo o campo
		cmpWeb.sendKeys("www.facebook.com");

	}

	@Quando("preencher o campo Picture")
	public void preencherOCampoPicture() throws AWTException, InterruptedException {
		// Encontrando o botão Open
		WebElement cmpOpen = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("open")));
		cmpOpen.click();

		// Armazendando o nome da imagem no control + c
		StringSelection doc = new StringSelection("doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(doc, null);

		/*
		 * Ao abrir a janela nível SO, será colado o nome do arquivo armazenado no
		 * control C e será dado o comando da tecla enter Selenium não manipula janelas
		 * nível SO, portanto é preciso dar comandos Robot para executar este passo. É
		 * importante que o arquivo doc.png que está na pasta "imagens" do projeto seja
		 * copiado para a pasta User da onde estará sendo executado o framework para que
		 * possa ser
		 */

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
	}

	@Quando("clica no botao Next")
	public void clicaNoBotaoNext() {
		// Encontrando o botão Next e clicando
		WebElement btnNext = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("nextenterproductdata")));
		// Clicando no botão Next
		btnNext.click();

	}

	@Entao("aba Product data e aberta")
	public void abaProductDataEAberta() {

		// Capturando o elemento da aba Enter Insurant data em xpath
		WebElement abaProduct = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"idealsteps-nav\"]/ul/li[3]")));

		// CaptuCapturando o elemento da aba Enter Insurant data em class name
		WebElement abaProductClass = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.className("idealsteps-step-active")));

		// Condição para verificar que ao clicar em Next, foi para a aba Enter Insurant

		if (abaProduct.equals(abaProductClass)) {

			System.out.println("Enter Product Data aberta");
		} else {
			System.out.println("Aba Enter Product Data não está aberta");
			Chrome.driver.close();
		}
	}

	@Dado("que eu esteja na aba Enter Product Type")
	public void queEuEstejaNaAbaEnterProductType() {
		abaProductDataEAberta();
	}

	@Quando("preencher o campo Start Date")
	public void preencherOCampoStartDate() {

		// Capturando a dia do sistema
		Date dia = new Date();
		SimpleDateFormat formatarDia = new SimpleDateFormat("dd");
		String diaFormatado = formatarDia.format(dia);

		// Capturando o mes do sistema
		Date mes = new Date();
		SimpleDateFormat formatarMes = new SimpleDateFormat("MM");
		String mesFormatado = formatarMes.format(mes);

		// Capturando o ano do sistema
		Date ano = new Date();
		SimpleDateFormat formatarAno = new SimpleDateFormat("YYYY");
		String anoformatado = formatarAno.format(ano);

		// Capturando o campo Start Date
		WebElement cmpStart = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("startdate")));

		// Preenchendo o campo com a regra de 1 mês no futuro e se o mês for fevereiro

		int Dia = Integer.parseInt(diaFormatado);
		int Mes = Integer.parseInt(mesFormatado);
		int Ano = Integer.parseInt(anoformatado);

		if (Mes == 2) {

			cmpStart.sendKeys((Mes + 1) + "/" + ((Dia - 2) + 3) + "/" + Ano);

		} else {

			cmpStart.sendKeys((Mes + 1) + "/" + (Dia + 1) + "/" + Ano);

		}

	}

	@Quando("preencher o campo Insurance Sum")
	public void preencherOCampoInsuranceSum() {

		// Gerando index de Insurance
		Random rdmSum = new Random();
		int sum = rdmSum.nextInt(9) + 1;

		// encontrando o campo Insurance sum
		WebElement cmpSum = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("insurancesum")));
		Select cmbSum = new Select(cmpSum);
		cmbSum.selectByIndex(sum);

	}

	@Quando("preencher o campo Merit Rating")
	public void preencherOCampoMeritRating() {
		// Gerando index de Merit Rating
		Random rdmMerit = new Random();
		int merit = rdmMerit.nextInt(17) + 1;

		// encontrando o campo Merit Rating
		WebElement cmpMerit = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("meritrating")));
		Select cmbMerit = new Select(cmpMerit);
		cmbMerit.selectByIndex(merit);

	}

	@Quando("preencher o campo Damage Insurance")
	public void preencherOCampoDamageInsurance() {
		// Gerando index de Damage Insurance
		Random rdmDamage = new Random();
		int damage = rdmDamage.nextInt(3) + 1;

		// encontrando o campo Damage Insurance
		WebElement cmpDamage = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("damageinsurance")));
		Select cmbDamage = new Select(cmpDamage);
		cmbDamage.selectByIndex(damage);

	}

	@Quando("preencher o campo Opcional products")
	public void preencherOCampoOpcionalProducts() {

		// Encontrando o campo Optional Products e clicando em Euro Protection e Legal
		// Defense Insurance
		WebElement cmpEuro = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")));

		WebElement cmpLegal = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span")));

		cmpEuro.click();
		cmpLegal.click();
	}

	@Quando("preencher o campo Courtesy Car")
	public void preencherOCampoCourtesyCar() {

		// Gerando index de Courtesy Car
		Random rdmCourtesy = new Random();
		int courtesy = rdmCourtesy.nextInt(2) + 1;

		// encontrando e selecionando o campo Courtesy Car
		WebElement cmpCourtesy = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("courtesycar")));
		Select cmbSum = new Select(cmpCourtesy);
		cmbSum.selectByIndex(courtesy);

	}

	@Quando("botao next for clicado")
	public void botaoNextForClicado() {

		// Encontrando o botão Next e clicando
		WebElement btnNext = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("nextselectpriceoption")));
		// Clicando no botão Next
		btnNext.click();

	}

	@Entao("aba Select Price Option e aberta")
	public void abaSelectPriceOptionEAberta() {

		// Capturando o elemento da aba Enter Insurant data em xpath
		WebElement abaPrice = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"idealsteps-nav\"]/ul/li[4]")));

		// CaptuCapturando o elemento da aba Enter Insurant data em class name
		WebElement abaPriceClass = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.className("idealsteps-step-active")));

		// Condição para verificar que ao clicar em Next, foi para a aba Enter Insurant

		if (abaPrice.equals(abaPriceClass)) {

			System.out.println("Enter Select Price Option aberta");
		} else {
			System.out.println("Aba Select Price Option não está aberta");
			Chrome.driver.close();
		}

	}

	@Dado("que esteja na aba Select Price Option")
	public void queEstejaNaAbaSelectPriceOption() {
		abaSelectPriceOptionEAberta();

	}

	@Quando("clicar em uma das opcoes de plano")
	public void clicarEmUmaDasOpOesDePlano() throws InterruptedException {
		String opt = null;

		Random rdmSum = new Random();
		int opcao = rdmSum.nextInt(4);

		int btnOpcao = opcao;
		switch (btnOpcao) {
		case 0:

			opt = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span";

			break;
		case 1:

			opt = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span";

			break;

		case 2:

			opt = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span";

			break;

		case 3:

			opt = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span";
			break;

		}

		WebElement rdbOpcao = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(opt)));

		rdbOpcao.click();

		Thread.sleep(2000);

	}

	@Quando("botao next e clicado")
	public void botaoNextEClicado() {

		// Encontrando o botão Next e clicando
		WebElement btnNext = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextsendquote")));
		// Clicando no botão Next
		btnNext.click();
	}

	@Entao("a aba Send Quote e aberta")
	public void aAbaSendQuoteEAberta() {

		// Capturando o elemento da aba Send Quote data em xpath
		WebElement abaQuote = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"idealsteps-nav\"]/ul/li[5]")));

		// CaptuCapturando o elemento da aba Send Quote data em class name
		WebElement abaQuoteClass = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.className("idealsteps-step-active")));

		// Condição para verificar que ao clicar em Next, foi para a aba Send Quote

		if (abaQuote.equals(abaQuoteClass)) {

			System.out.println("Enter Send Quote aberta");
		} else {
			System.out.println("Aba Send Quote não está aberta");
			Chrome.driver.close();
		}
	}

	@Dado("que esteja na aba Send Quoe")
	public void queEstejaNaAbaSendQuoe() {
		aAbaSendQuoteEAberta();
	}

	@Quando("preencher o campo Email")
	public void preencherOCampoEmail() {

		// Encontrando e preenchendo o campo Email
		WebElement cmpEmail = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		cmpEmail.sendKeys("exemploteste123@hotmail.com");

	}

	@Quando("preencher o campo Phone")
	public void preencherOCampoPhone() {

		// Encontrando e preenchendo o campo Phone
		WebElement cmpPhone = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("phone")));
		cmpPhone.sendKeys("11987675645");

	}

	@Quando("Preencher o campo Username")
	public void preencherOCampoUsername() {

		// Encontrando e preenchendo o campo Username
		WebElement cmpUser = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		cmpUser.sendKeys("Caique_123");

	}

	@Quando("Preencher o campo Password")
	public void preencherOCampoPassword() {

		// Encontrando e preenchendo o campo Password
		WebElement cmpPass = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		cmpPass.sendKeys("SenhaPoderosa123");

	}

	@Quando("Preencher o campo Confirm Password")
	public void preencherOCampoConfirmPassword() {

		// Encontrando e preenchendo o campo Confirm Password
		WebElement cmpConfPass = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("confirmpassword")));
		cmpConfPass.sendKeys("SenhaPoderosa123");
	}

	@Quando("Preencher o campo Comments")
	public void preencherOCampoComments() {
		// Encontrando e preenchendo o campo Comments
		WebElement cmpComm = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Comments")));
		cmpComm.sendKeys("Teste 123");

	}

	@Quando("clicar no botao next")
	public void clicarNoBotaoNext() throws InterruptedException {

		// Encontrando e preenchendo o campo Comments
		WebElement btnNext = Chrome.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sendemail")));
		btnNext.click();

		Thread.sleep(5000);
	}

	@Entao("email e enviado")
	public void emailEEnviado() throws IOException {

		// Capturando o a mensagem de sucesso

		WebElement abaQuote = Chrome.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]")));

		// Condição para verificar que ao clicar em Next, foi para a aba Send Quote

		if (abaQuote.isDisplayed()) {

			System.out.println("E-Mail enviado com sucesso");

			Chrome.driver.quit();
			java.awt.Desktop.getDesktop().open(new File(
					"C:\\Users\\User\\Git\\Desafio_Accenture\\Case_Accenture\\evidencia\\relatorio\\Relatorio.html"));
			
		} else {
			System.out.println("E-Mail não enviado!");
			 Chrome.driver.close();
		}

	}

}
