Feature: Prueba de formulario

  @CP001
  Scenario: Abrir el formulario de la seccion  Practice Form
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Practice Forms' de la opcion Form
    Then deberia visualizarce el formulario

  @CP016
  Scenario: Seleccionar una City sin seleccionar un State
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Practice Forms' de la opcion Form
    Then  no deberia poder seleccionar la opcion city

  @CP023
  Scenario: Validar que el titulo del formulario exista
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Practice Forms' de la opcion Form
    Then  deberia visualizarce el titulo del formulario

  @CP035
  Scenario: validar que el boton Submit exista y funcione  principio a fin
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Practice Forms' de la opcion Form
    And   llena el formulario
      | Nombre      | Yesica            |
      | Apellido    | Martin            |
      | Correo      | yesica@correo.com |
      | Genero      | Male              |
      | Telefono    | 3452342345        |
      | Asignaturas | Maths             |
      | Hibbies     | Sports            |
      | Direccion   | Calle 12 # 20-31  |
      | Estado      | NCR               |
      | Ciudad      | Delhi             |
    Then deberia visualizarce la ventana modal

  @CP36
  Scenario Outline: Validar del check box de genero femenino
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Practice Forms' de la opcion Form
    And   llena el formulario
      | Nombre      | Yesica            |
      | Apellido    | Martin            |
      | Correo      | yesica@correo.com |
      | Genero      | <genero>          |
      | Telefono    | 3452342345        |
      | Asignaturas | <asignatura>      |
      | Hibbies     | Music             |
      | Direccion   | Calle 12 # 20-31  |
      | Estado      | NCR               |
      | Ciudad      | Delhi             |
    Then deberia visualizarce la ventana modal con el check box de genero especificado
Examples:
  | genero | asignatura |
  | Male   | Maths      |
  | Female | Commerce   |
  | Other  | Chemistry  |

  @CP37
  Scenario Outline: Validar del check box de Hobbies
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Practice Forms' de la opcion Form
    And   llena el formulario
      | Nombre      | Yesica            |
      | Apellido    | Martin            |
      | Correo      | yesica@correo.com |
      | Genero      | <genero>          |
      | Telefono    | 3452342345        |
      | Asignaturas | <asignatura>      |
      | Hibbies     | <hobbies>         |
      | Direccion   | Calle 12 # 20-31  |
      | Estado      | NCR               |
      | Ciudad      | Delhi             |
    Then deberia visualizarce la ventana modal con el check box de hobbie especificado
    Examples:
      | genero | asignatura | hobbies |
      | Male   | Maths      | Sports  |
      | Female | Commerce   | Reading |
      | Other  | Chemistry  | Music   |

  @CP038
  Scenario: validar que el boton Close exista y cierre el formulario
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Practice Forms' de la opcion Form
    And   llena el formulario y cierra la ventana modal
      | Nombre      | Yesica            |
      | Apellido    | Martin            |
      | Correo      | yesica@correo.com |
      | Genero      | Male              |
      | Telefono    | 3452342345        |
      | Asignaturas | Maths             |
      | Hibbies     | Sports            |
      | Direccion   | Calle 12 # 20-31  |
      | Estado      | NCR               |
      | Ciudad      | Delhi             |
    Then deberia visualizarce la ventana modal