//package br.com.EduardoPina.screenMatch;
//
//import br.com.EduardoPina.screenMatch.principal.Principal;
//import br.com.EduardoPina.screenMatch.repository.SerieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class ScreenMatchApplicationSemWeb implements CommandLineRunner {
//
//	@Autowired
//	private SerieRepository repository;
//
//	public static void main(String[] args) {
//		SpringApplication.run(ScreenMatchApplicationSemWeb.class, args);
//	}
//
//	@Override
//	public void run(String... args){
//
//		Principal principal = new Principal(repository);
//		principal.exibirMenu();
//
//	}
//}
