package APIREST_FOROHUB.APIREST.dto;

public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        String curso) {
}
