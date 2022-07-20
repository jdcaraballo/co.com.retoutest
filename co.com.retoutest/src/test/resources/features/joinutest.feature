
Feature: Registrar usuario en Utest
  Yo como usuario
  quiero registrarme en la página Utest
  para validar creación de nuevo usuario

  Scenario Outline: Registrar usuario en Utest
    Given que David abre la pagina
    When el registra los datos personales y crea nuevo usuario con los siguiente datos
      | firstName   | lastName   | email   | city   | codPostal   | pass   |
      | <firstName> | <lastName> | <email> | <city> | <codPostal> | <pass> |

    Then se vera mensaje de login Exitoso


    Examples:
      | firstName | lastName  | email           | city     | codPostal | pass            |
      | David     | Caraballo | jd.04@gmail.com | Medellín | 057050    | David-123456789 |