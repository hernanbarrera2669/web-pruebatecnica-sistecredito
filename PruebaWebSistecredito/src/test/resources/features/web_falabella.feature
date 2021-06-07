#language:es

Característica: Realizar el proceso de compras en el portal web de Falabella
  Como cliente de falabella
  Deseo realizar el proceso de compras de un producto
  Para verificar su correcto funcionamiento

  Escenario:Verificar que se realice el proceso de compra de un producto seleccionado
    Dado que el usuario ingresa al portal web de Falabella
    Cuando busque el producto y añada este producto a la bolsa
      | producto                |
      | iPhone 12 Pro Max 128GB |
    Y busque el producto agregado a la bolsa
    Y realice la compra ingresando los datos de despacho
      | departamento | ciudad   | barrio   | direccion      | detalleDireccion |
      | ANTIOQUIA    | MEDELLIN | MEDELLIN | cra29 nro50-25 | 301              |
    Entonces realizará la compra, verificando que exista el valor CMR Falabella