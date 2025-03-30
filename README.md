# Tienda de Computadoras

Este proyecto implementa un sistema de gestión para una tienda de computadoras. Permite agregar, eliminar, buscar y listar computadoras, así como gestionar información sobre la tienda.

## Funcionalidades

-   **Agregar Computadora:** Permite agregar nuevas computadoras al inventario de la tienda, especificando marca, memoria, procesador, sistema operativo y precio.
-   **Eliminar Computadora:** Permite eliminar computadoras del inventario por su marca.
-   **Buscar Computadora:** Permite buscar computadoras en el inventario por su marca.
-   **Listar Computadoras:** Permite listar todas las computadoras en el inventario.
-   **Gestión de la Tienda:** Permite gestionar información sobre la tienda, como nombre, propietario e identificador tributario.

## Clases Principales

-   `Computadora`: Representa una computadora con sus atributos y métodos.
-   `TiendaComputadoras`: Gestiona la lista de computadoras y las operaciones de la tienda.
-   `Main`: Clase principal que interactúa con el usuario a través de la consola.
-   `ComputadoraNoEncontradaException`: Excepción personalizada para cuando no se encuentra una computadora.
-   `ComputadoraNoEliminadaException`: Excepción personalizada para cuando no se puede eliminar una computadora.

## Tests Unitarios

El proyecto incluye tests unitarios para las clases `Computadora` y `TiendaComputadoras` utilizando JUnit 5. Estos tests aseguran que el código funcione correctamente y sea fácil de mantener.

## Cómo Ejecutar

1.  Clona el repositorio.
2.  Importa el proyecto en tu IDE (IntelliJ IDEA, Eclipse, VS Code, etc.).
3.  Ejecuta la clase `Main` para iniciar la aplicación.
4.  Sigue las instrucciones en la consola para interactuar con la aplicación.
5.  Para ejecutar los tests, ejecuta los test de las clases `ComputadoraTest` y `TiendaComputadorasTest`.

## Requisitos

-   Java 8 o superior
-   JUnit 5 (para ejecutar los tests)

## Estructura del Proyecto
tienda-computadoras/
├── src/main/java/dev/anabelen/
│   ├── Computadora.java
│   ├── TiendaComputadoras.java
│   ├── Main.java
│   ├── ComputadoraNoEncontradaException.java
│   └── ComputadoraNoEliminadaException.java
├── src/test/java/dev/anabelen/
│   ├── ComputadoraTest.java
│   └── TiendaComputadorasTest.java
└── README.md

## Contribución
Las contribuciones son bienvenidas. Si encuentras algún error o tienes alguna sugerencia, por favor, abre un issue o envía un pull request.

## Autor
-   Anabelen

## Licencia
Este proyecto está bajo la Licencia MIT.
