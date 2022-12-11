package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	void add(Language language);

	void delete(Language language);

	void update(Language language);

	java.util.List<Language> getall();
}
