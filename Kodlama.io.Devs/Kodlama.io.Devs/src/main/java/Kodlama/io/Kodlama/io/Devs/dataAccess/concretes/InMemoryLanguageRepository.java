package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<Language> language;

	public InMemoryLanguageRepository() {
		language = new ArrayList<Language>();
		language.add(new Language(1, "Java"));
		language.add(new Language(2, "C#"));
		language.add(new Language(3, "Python"));
	}

	@Override
	public void add(Language language) {
		System.out.println("Program dili başarıyla eklendi" + language.getId() + language.getName());
	}

	@Override
	public void delete(Language language) {
		System.out.println("Program dili başarıyla silindi" + language.getId() + language.getName());
	}

	@Override
	public void update(Language language) {
		System.out.println("Program dili başarıyla güncellendi" + language.getId() + language.getName());
	}

	@Override
	public List<Language> getall() {

		return language;
	}

}
