Feature: Prueba Elements

  @CP001_Elements
  Scenario: Abrir el formulario de la seccion Elements
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Elements'
    Then deberia visualizarce las opciones de Elements

  @CP002_Elements
  Scenario: Abrir la opcion Tex Box de la seccion Elements
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    Then  deberia visualizarce el formulario de Text Box

  @CP003_Elements
  Scenario: Abrir la opcion Tex Box de la seccion Elements, validar titulo
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    Then  deberia visualizarce el titulo de Text Box

  @CP004_Elements
  Scenario: Abrir la opcion Tex Box de la seccion Elements, llenar el formulario
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    And   llenar el formulario
      | NombreCompleto       | Yesica Martin           |
      | Email                | correoYesica@correo.com |
      | Direccion            | calle20 #21-12          |
      | Direccion Permanente | calle20 #21-12          |
    Then  visualisar el formulario lleno

  @CP005_Elements
  Scenario: Abrir la opcion Tex Box, validar el boton submit
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    Then validar la existencia del boton submit

  @CP006_Elements
  Scenario: Abrir la opcion Tex Box, campo Full Name
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    And llenar campo full name
      | NombreCompleto | Al3x1234 |
    Then deberia visualizarce el nombre

  @CP007_Elements
  Scenario: Abrir la opcion Tex Box, campo Email
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    And llenar campo Email
      | Email | correoYesica@gmail.com |
    Then deberia visualizarce el correo

  @CP008_Elements
  Scenario: Abrir la opcion Tex Box, campo Address
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    And llenar campo Address
      | Direccion | calle20 #21-12  |
    Then deberia visualizarce la direccion

  @CP009_Elements
  Scenario: Abrir la opcion Tex Box, campo Permanent Address
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Text Box' de la opcion 'Elements' de la pagina
    And llenar campo Permanent Address
      | Direccion Permanente | calle20 #21-12 |
    Then deberia visualizarce la direccion permanente

  @CP010_Elements
  Scenario: Abrir la opcion Check Box
    Given ingresar a la pagina demoqa
    When  ingreso a la opcion 'Check Box' de la opcion 'Elements' de la pagina
    And   ingresar a la opcion CheckBox
    Then  deberia visualizarce la opcion de Check Box
