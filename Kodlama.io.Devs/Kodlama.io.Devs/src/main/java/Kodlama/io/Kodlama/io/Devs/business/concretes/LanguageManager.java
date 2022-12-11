package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getName().isEmpty())
			throw new Exception("Program adı boş bırakılamaz !  ");
		if (language.getName().isEmpty())
			throw new Exception("Program adı tekrar kullanılamaz ! ");

	}

	@Override
	public void delete(Language language) {

	}

	@Override
	public void update(Language language) {

	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getall();
	}

}
