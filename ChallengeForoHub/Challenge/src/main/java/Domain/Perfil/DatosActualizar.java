package Domain.Perfil;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizar(@NotNull
                              Long id,
                              @NotBlank
                              String nombre) {
}
