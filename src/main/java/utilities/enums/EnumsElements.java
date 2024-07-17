package utilities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumsElements {
    NOMBRECOMPLETO("NombreCompleto","userName"),
    CORREO("Email","userEmail"),
    DIRECCION("Direccion","currentAddress"),
    DIRECCIONPERMANETE("Direccion Permanente", "permanentAddress");

    private final String value;
    private final String xpath;
}
