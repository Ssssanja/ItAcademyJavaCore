package by.ita.hw.service;

import by.ita.hw.dto.PersonDto;

public interface SimpleService {
    <T> T read();
    PersonDto responce(PersonDto personDto);
}
