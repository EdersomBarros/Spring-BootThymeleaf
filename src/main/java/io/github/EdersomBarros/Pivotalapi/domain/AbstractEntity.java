package io.github.EdersomBarros.Pivotalapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@MappedSuperclass
@Data
public abstract class AbstractEntity <ID extends Serializable> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity<?> that = (AbstractEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
