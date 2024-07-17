package utilities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumsFormulario {

    NAME("Nombre", "firstName"),
    LASTNAME("Apellido", "lastName"),
    CORREO("Correo", "userEmail"),
    TELEFONO("Telefono", "userNumber"),
    ASIGNATURAS("Asignaturas", "subjectsInput"),
    DIRECCION("Direccion", "currentAddress"),
    ESTADO("Estado","react-select-3-input"),
    CIUDAD("Ciudad", "react-select-4-input"),
    GENERO("Genero","Gender"),
    HOBBIES("Hibbies","Hobbies");

    private final String value;
    private final String xpath;

}
