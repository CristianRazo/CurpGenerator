# Generador de CURP

El Generador de Clave Única de Registro de Población (CURP) es un servicio REST que permite generar CURPs a partir de datos proporcionados, como el nombre, apellidos, fecha de nacimiento, estado de nacimiento y sexo.

## Uso

Para generar una CURP, realiza una solicitud JSON al servicio con los siguientes datos:

- `nombre`: El nombre del individuo.
- `primerApellido`: El primer apellido del individuo.
- `segundoApellido`: El segundo apellido del individuo (opcional).
- `fechaNacimiento`: La fecha de nacimiento en formato "dd-mm-aaaa".
- `sexo`: El sexo del individuo, solo "M" o "H".
- `estadoNacimiento`: El estado de nacimiento.

## Ejemplo de Solicitud JSON

```json
{
  "nombre": "Cristian",
  "primerApellido": "Razo",
  "segundoApellido": "Gonzalez",
  "fechaNacimiento": "24-09-1992",
  "sexo": "M",
  "estadoNacimiento": "Guanajuato"
}
```
## Ejemplo de Respuesta JSON

```json
{
    "infoMessage": "Curp Generada",
    "curp": "RAG920924HGTZNR09"
}


