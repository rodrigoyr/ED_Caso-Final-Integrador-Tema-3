# ED_Caso-Final-Integrador-Tema-3

### Introducción

El objetivo principal era proporcionar una herramienta para simular y analizar el comportamiento de un ecosistema simulado de animales plantas y terrenos. Aqui explicare que estructura he seguido, que herramientas he usado y los problemas principales con los que me he enconyrado.

### Estructura del Proyecto

El proyecto está estructurado siguiendo la programación orientada a objetos y está dividido en varios módulos principales:

Entidades: Contiene las clases que representan las los ecosistema, como animales, plantas y terrenos.

Simulación: Incluye las clases relacionadas con la simulación del ecosistema, como la gestión de la población y la simulación.

Gestión de Usuario: Proporciona una interfaz de usuario interactiva para interactuar con la simulación y resolver problemas ecológicos.

Análisis: Ofrece herramientas para analizar datos del ecosistema y resolver problemas ecológicos detectados.

Utilidades: Contiene clases de utilidad, como registradores de mensajes, validadores y visualizadores de datos.

### Descripción de los Módulos

Entidades:
Clases: Animal, Planta, Terreno, MedioAmbiente.
Descripción: Estas clases representan las entidades del ecosistema y contienen atributos y métodos para su gestión y manipulación.

Simulación:
Clases: PopulationSimulation, EnvironmentManager.
Descripción: PopulationSimulation gestiona la simulación de la población en el ecosistema, mientras que EnvironmentManager controla el estado general del entorno.

Gestión de Usuario:
Clases: SimulationManager, UserInterface.
Descripción: SimulationManager coordina las interacciones del usuario con la simulación, mientras que UserInterface proporciona la interfaz de usuario para facilitar estas interacciones.

Análisis:
Clases: ProblemSolver, DataVisualizer.
Descripción: ProblemSolver contiene métodos para resolver problemas ecológicos detectados, mientras que DataVisualizer proporciona herramientas para visualizar y analizar datos del ecosistema.

Utilidades:
Clases: Logger, Validator.
Descripción: Logger registra mensajes del sistema, mientras que Validator proporciona métodos para validar datos del ecosistema.

### Interacción entre Módulos

EL módulo de Simulación utiliza las clases del módulo de Entidades para simular el comportamiento de las entidades del ecosistema.
El módulo de Gestión de Usuario interactúa con el módulo de Simulación para iniciar y controlar la simulación, así como para resolver problemas ecológicos.
El módulo de Análisis utiliza los datos generados por el módulo de Simulación para analizar el estado del ecosistema y resolver problemas detectados.
Las Utilidades son utilizadas por varios módulos para tareas como registro de mensajes y validación de datos.
Conclusión

### Principales problemas
Este proyecto lo he estrcuturado de una manera diferente a los demás, he onseguido una buena estructura e ir importando implemantando unas clases haciendo que cada modulo estuviese completo con mis objetivos. Al llegar al main, para rellenar e importar todas las clases me encontre con el problema de que nos habia creado todo lo que queria dentro de cada clase, esto lo soucione añadiendo y mejorando el codigo del main, implementamdo aqui las mejores que queria para crear una interfa de usuario más completa. El principal problema fue que cree un codigo completo y sencillo, pero no me fije en la interfaz de usuario, una cosa esencial, por lo que decidi mejorarla ala final en el main. Otro problema fue a la hora de crear los test, ya que tuve problemas al añadir el JUnit ene l proyecto, pero al cabo de un rato investigano consegui crear un test simple del main. Al final del todo, a la hora de redactar esto, me di cuenta de ue todo el proyecto lo habia creado en una carpeta difernte a la que estaba en el local path, por lo que tosos los commits fuero inutiles al ser guardados en otro repositorio de Github, finalmente opto por subir manualmente la carpeta del proyecto, al no dispone de más tiempi y no encontrar una solucion mejor a este problema.
