package by.ita.hw.service;

import by.ita.hw.dto.PersonDto;
import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements SimpleService {
    @Override
    public PersonDto read() {
        PersonDto personDto = new PersonDto();
        personDto.setName("Alehandro");
        personDto.setStatus("Partying");
        return personDto;
    }

    @Override
    public PersonDto responce(PersonDto personDto) {
        return personDto;
    }
}
