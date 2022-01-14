#autor: Santiago Zapata Álvarez
Feature: Compra de producto en Falabella
  Yo como estudiante
  Quiero ingresar a falabella
  Para comprar un celular

  Scenario: Compra de celular iPhone 12 Mini 64GB en Falabella
    Given 'Santiago' desea navegar a la pagina "https://www.falabella.com.co/falabella-co"
    When Ingresa el producto a comprar "iPhone 12 Mini 64GB"
    And Ingresa la información de despacho
      | departamento | ANTIOQUIA   |
      | ciudad       | BELLO       |
      | barrio       | BELLO       |
      | direccion    | Crr 63-57   |
      | detalle      | primer piso |
    Then Valida que la pagina contenga "Resumen de tu orden"
