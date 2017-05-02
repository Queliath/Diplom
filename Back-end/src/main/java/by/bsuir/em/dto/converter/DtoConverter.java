package by.bsuir.em.dto.converter;

import java.util.List;

public interface DtoConverter<E, D> {
    D getDto(E entity);
    E getEntity(D dto);
    List<D> getDtoList(List<E> entityList);
}
