package Domain.Perfil.Usuarios;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatossRegistro( @NotBlank
                              String nombre,
                              @NotBlank
                              @Email
                              String email,
                              @NotBlank
                              String contrasena) {
}
