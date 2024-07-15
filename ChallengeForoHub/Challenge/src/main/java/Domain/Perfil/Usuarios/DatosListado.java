package Domain.Perfil.Usuarios;

import Controller.Usuario;

public record DatosListado(Long id,
                           String nombre) {
}
public DatosListado(Usuario usuario) {
    this(usuario.getId(), usuario.getNombre());
}
}
