package Domain.Perfil.Respuestas;

import io.micrometer.common.lang.NonNull;

public record DatosActualizar(@NonNull
                              Long id,
                              String mensaje,
                              Boolean solucion) {
}
