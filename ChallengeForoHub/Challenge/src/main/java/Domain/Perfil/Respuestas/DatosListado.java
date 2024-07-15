package Domain.Perfil.Respuestas;


public record DatosListado(Long id,
                           String mensaje,
                           String nombreTopico,
                           LocalDateTime fecha,
                           String nombreUsuario,
                           Boolean solucion) {
    public DatosListado(Respuesta respuesta) {
        this(respuesta.getId() ,respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getFecha(), respuesta.getUsuario().getNombre(), respuesta.getSolucion());
    }
}
