# PruebaJava

El repositorio se divide en 2 carpetas. Una para el backend (employee) y otra para el fronted (employee-app). 

Para el backend y seguir con los requerimientos del reto se uso Spring Boot. El backend sigue la arquitectura MVC y
se puede evidenciar en la organizacion de las carpetas y en las responsabilidades que cumplen.

1. Carpetas Backend

   * DataAccess
   
   En la clase dentro de esta carpeta se maneja las peticiones HTTP a los links de empleados para recuperar la informacion de los Jsons.
   * Model
   
   Las clases dentro de esta carpeta representan la informacion de los empleados que se recupera de los json de la capa de acceso a datos. 
   Se manejan 3 clases una para la estructura del json de un solo empleado, otra para la estructura cuando se recuperan todos los empleados y la clase que modela los atributos
   de cada empleado.
   * Service
   
   Esta capa esta encargada de manejar la logica del negocio y es la responsable de comunicarse con la capa de acceso a datos y de calcular el salario anual.
   
   * Controller 
   
   Esta capa es la encargada de exponer los endpoints para que sean consumidos por el front. 
   
2. Ejecución Backend

    Para ejecutar la aplicacion se debe clonar el repositorio, abrir en algun IDE la carpeta employees y ejecutar la aplicacion. Para ejecutarla se debe tener Java 
    instalado. Se debe ejecutar el archivo EmployeeAplication. El proyecto usa maven y al abrir la carpeta en el IDE se cargaran las dependencias. La aplicacion se ejecutara
    en localhost:8080.
    
    Por otro lado, en la carpeta target se genero el archivo .WAR para ser desplegado.
    
3. Front

   El frontend del reto se hizo en React con Bootstrap. Para ejecutar la aplicacion se debe tener node instalado para instalar las dependecias con el comando
   "npm i". Una vez instaladas se ejecuta la aplicacion con el comando "npm start". La aplicacion esta configurada para hacer una peticion al backend que corre 
   en localhost:8080. Si se desea correr el back en otro puerto es necesario modificar el archivo Employee.js y cambiar el valor de la constante url.
   El front tiene 2 paginas: la de inicio y la de empleados. La de inicio es un simple saludo y la empleados tiene el formulario para consultar los empleados.
   

    
 
