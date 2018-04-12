package root.maven.repositories;

import root.maven.models.Person;

public interface PersonRepo {
	Person getByName(String name);
	Person update(String name);
	void delete(String name);
}
