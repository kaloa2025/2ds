package org.gfg._ds;

import org.gfg._ds.Author.Author;
import org.gfg._ds.Author.AuthorRepo;
import org.gfg._ds.Person.Person;
import org.gfg._ds.Person.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private AuthorRepo authorRepo;
    public Person addPerson(Person person)
    {
        return personRepo.save(person);
    }
    public Author addAuthor(Author author)
    {
        return authorRepo.save(author);
    }
}
