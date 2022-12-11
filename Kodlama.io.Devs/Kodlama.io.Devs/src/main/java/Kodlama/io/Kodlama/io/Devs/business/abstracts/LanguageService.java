package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	void add(Language language) throws Exception;

	void delete(Language language);

	void update(Language language);

	List<Language> getAll();
}
