package Domain.Perfil;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistro(@NotBlank
                            String nombre
) {
}
