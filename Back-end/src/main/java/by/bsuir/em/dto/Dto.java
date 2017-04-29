package by.bsuir.em.dto;

import java.io.Serializable;

public abstract class Dto<K extends Serializable> implements Serializable {
    private static final long serialVersionUID = 2134722856194625476L;

    protected K id;

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }
}
