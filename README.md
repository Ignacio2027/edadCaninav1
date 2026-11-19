# 🐶 EdadCanina · v3


# EdadCanina v3 - Arquitectura MVC

## Descripción

EdadCanina es una aplicación Android desarrollada en Java que permite calcular la edad equivalente de un perro en años caninos.

La aplicación utiliza un factor de conversión de 7 años caninos por cada año humano.

## Características

- Introducir la edad del perro.
- Calcular su edad equivalente.
- Validar los datos introducidos.
- Mostrar mensajes de error.
- Limpiar los datos.
- Conservar la información al girar el dispositivo.

## Tecnologías utilizadas

- Java.
- Android.
- XML.
- Android DataBinding.
- Arquitectura MVC.
- JUnit como dependencia de pruebas.

## Arquitectura MVC

El proyecto está organizado siguiendo el patrón Modelo-Vista-Controlador.

### Modelo: EdadCaninaModelo

Se encarga de realizar los cálculos y trabajar con las validaciones.

### Vista: activity_main.xml

Contiene los elementos visuales de la aplicación, como el campo de edad, el botón de calcular y el resultado.

### Controlador: EdadCaninaControlador

Conecta la vista con el modelo y gestiona las acciones del usuario.

### Validacion

Contiene las comprobaciones de los datos introducidos.

### BindingAdapters

Permite conectar los resultados del modelo con los elementos visuales mediante DataBinding.

## Validaciones

La aplicación comprueba que:

- El campo no esté vacío.
- El dato introducido sea numérico.
- La edad sea como mínimo 1 año.
- La edad no supere los 30 años.

## Ejemplo de funcionamiento

Si introducimos una edad de 6 años:

6 x 7 = 42 años caninos.

## Estructura del proyecto

    edadcanina/
    ├── MainActivity.java
    ├── EdadCaninaControlador.java
    ├── EdadCaninaModelo.java
    ├── Validacion.java
    └── BindingAdapters.java

## Autor

Ignacio Sedano

## Versión

3.0 - Arquitectura MVC
