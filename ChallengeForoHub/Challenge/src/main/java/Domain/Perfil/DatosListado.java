package Domain.Perfil;

import Controller.Perfil;

public record DatosListado(Long id,
                           String nombre
) {
    public DatosListado(Perfil perfil) {
        this(perfil.getId(), perfil.getNombre());
    }
}
