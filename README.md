# PeakMotion

## Índice
1. [Introducción](#descripción)
2. [Tecnologías y herramientas utilizadas](#tecnologías-y-herramientas-utilizadas)
3. [Requisitos previos](#requisitos-previos)
4. [Instalación y ejecución](#instrucciones-de-instalación-y-ejecución)
5. [Estructura del proyecto](#estructura-del-proyecto)
6. [Ejemplo de uso](#ejemplo-de-uso)
   * [Inicio Sesión](#inicio-sesión)
   * [Datos personales](#datos-personales)
   * [Actividades](#actividades)
       * [Inscribir en una actividad](#inscribir-en-una-actividad)
       * [Dejar una ctividad](#dejar-una-actividad)
       * [Crear actividad](#crear-actividad)
       * [Editar actividad](#editar-actividad)
       * [Borrar actividad](#borrar-actividad)
 
## Descripción

El proyecto integrador “Jamón asiático” ha sido realizado por los alumnos de 1º de DAW con el objetivo de desarrollar una aplicación para gestionar actividades deportivas. La aplicación dirigida a alumnos y monitores del ciclo TAFD que permite consultar, inscribirse y administrar actividades según sala y horario. El proyecto combina programación en java con java swing, uso de bases de datos MySQL y aplicación del patrón Modelo-Vista-Controlador, logrando así una estructura clara. Se ha seguido una metodología ágil Scrum, organizando el trabajo en sprints y utilizando herramientas como GitHub, Trello, Discord y Google Meet para facilitar la colaboración. Se han creado diagramas UML y entidad-relación para estructurar el diseño y comprender mejor la lógica del sistema. A pesar de algunos retos organizativos durante el proceso, el equipo ha logrado entregar una aplicación funcional. Como mejora futura, se plantea modernizar la interfaz gráfica e incorporar nuevas funcionalidades. Este proyecto ha sido clave para aplicar conocimientos teóricos y consolidar competencias esenciales para el desarrollo profesional.

## Tecnologías y herramientas utilizadas

Aplicaciones utilizadas:
- Java: Lenguaje de programación utilizado para el desarrollo de la lógica de la aplicación y su interfaz mediante Java Swing.

- GitHub: Plataforma empleada para el control de versiones, colaboración en equipo y almacenamiento del código fuente.

- MySQL: Sistema de gestión de bases de datos donde se almacena toda la información relativa a usuarios, actividades y horarios de la aplicación.

Herramientas utilizadas:

- Wireframe: Utilizada en la fase inicial para diseñar la estructura visual de la aplicación antes del desarrollo de las interfaces.

- Draw.io: Herramienta para la creación de diagramas, como el modelo entidad-relación y diagramas de flujo de trabajo.

- Trello: Plataforma de gestión de tareas que permitió organizar y distribuir el trabajo, así como hacer seguimiento del avance del proyecto.

- WhatsApp: Medio de comunicación rápida entre los miembros del equipo para resolver dudas del día a día.

- Discord: Utilizada para reuniones por voz, compartir pantalla y coordinar el trabajo en equipo en tiempo real.

- Microsoft Word: Herramienta utilizada para la redacción de la documentación técnica y los informes del proyecto.

## Requisitos previos
**Análisis y diseño de los requisitos hardware y software.**

Eclipse es un entorno de desarrollo integrado (IDE) de código abierto utilizado para programar en diversos lenguajes

Requisitos de hardware y software requerido:
* Sistema operativo: windows 7 o superior
* Procesador: intel desde 1.2 GHz o equivalente familia AMD
* Memoria de 4 GB de RAM como mínimo, se recomienda 8 GB 
* Almacenamiento al menos 2 GB de espacio libre.

Sistema operativo compatible
* Windows 10/11 de 64 bits
* macOS de 64 bits
* Linux 

Recomendable utilizar una versión de Eclipse del 2024.Versiones más antiguas no procesan caracteres como la ‘Ñ’.Para ello se recomienda también:
* Versión de Java del Sistema 5.0 o superior.

SQL se requiere un mínimo de 6GB de espacio disponible en disco, y se recomienda la instalación en equipos con los formatos de NTFS o ReFS. Se admite el sistema de archivos FAT32, pero no se recomienda porque es menos seguro.
* 512 MB de RAM como mínimo mínimo.Se recomienda más.
* Instalador de MySQL.
* Procesador recomendado 2.0 GHz

Sistema operativo compatible:
* Windows 10/11 de 64 bits
* macOS 
* Linux 

Acciones de GitHub:
* Para correr una acción de GitHub en Windows: Un microprocesador de 4 núcleos y 16 GB de RAM.
* Para hasta 740 procesos: 8 núcleos de procesamiento y 64 GB de RAM.

Sistema operativo compatible:
* Windows 8.1 o posterior
* macOS 
* Linux

## Instrucciones de instalación y ejecución
Vamos al repositorio donde se encuentra el programa y copiamos el link que nos proporciona.

Abrimos el GitBash y escribimos **git clone** y pegamos el link.

Para poder utilizar el programa, abrimos el archivo en un entorno de desarrollo como Eclipse, IntelliJ, VisualStudioCode...

## Estructura del proyecto
Para realizar este proyecto, hemos seguido el diseño de MVC (Modelo-Vista-Controlador), así mantenemos el código de forma organizada.

Nuestra estructura es la siguiente:

```
Proyecto_Integrador_1DAW
│
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java
│   │   │   └── 📦 com.jamonasiatico
│   │   │       ├── 📁 control    → Conectar el modelo con la vista.
│   │   │       ├── 📁 imagenes   → Imágenes utilizadas por la aplicación.
│   │   │       ├── 📁 lib        → Librerías adicionales utilizadas por el proyecto.
│   │   │       ├── 📁 main       → Punto de entrada principal de la aplicación.
│   │   │       ├── 📁 modelo     → La parte del programa que guarda y gestiona los datos.
│   │   │       ├── 📁 vistas     → Interfaz gráfica de usuario desarrollada con Java Swing (Vista).
│   │   │       └── 📁 wireframe  → Prototipos de diseño visual y estructuras previas a la implementación.
│   │   └── 📂 resources          → Recursos como archivos de configuración, textos, etc.
│
├── 📂 test
│   └── 📂 java                   → Pruebas unitarias del proyecto.
│
├── 📂 target                     → Archivos generados tras compilar el proyecto.
│
├── 📄 pom.xml                    → Archivo de configuración de Maven (gestión del proyecto y dependencias).
``` 

## Ejemplo de uso
### Inicio Sesión:
Primero el usuario inicia sesión con su matrícula.
![inicioSesion](https://i.postimg.cc/xCvRNp5z/inicio-Sesion.png)
Si el usuario es un monitor, este tendrá la opción de iniciar sesión como monitor o como alumno.
![Monitor](https://i.postimg.cc/kG7yQNYh/monitor-Si-No.png)

### Datos personales
Después de iniciar sesión nos enseñará los datos personales.
### Actividades:
En el menú de la izquierda se encuentra Actividades. El usuario que realiza las actividades solo puede inscribirse y dejar la actividad.
##### Inscribir en una actividad
![inscribirActividad](https://i.postimg.cc/dt5LtR2t/incribir-Actividad.png)
##### Dejar una actividad
![dejarActividad](https://i.postimg.cc/CMHR9pd8/dejar-Actividad.png)

El monitor, en cambio, puede:
##### Crear actividad
![crearActividad](https://i.postimg.cc/GtQ9DG6K/crear-Actividad.png)
##### Editar actividad
![editarActividad](https://i.postimg.cc/9FmDhgqn/editar-Actividad.png)
##### Borrar actividad
![borrarActividad](https://i.postimg.cc/4dpYJr5r/borrar-Actividad.png)


Por: María Qingxuan Garrido, Rosa Xiu Qiong Hu, Alejandro Raboso
Tutoras: Irene del Rincon y Sara Villanueva
Universidad Europea de Madrid
1ºDAW
