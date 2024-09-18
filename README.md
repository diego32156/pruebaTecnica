
Aquí tienes el contenido del archivo README.md para tu proyecto:

Aplicación de Consulta de Información de Clientes
Descripción
Esta es una aplicación desarrollada en Angular que permite consultar la información básica de un cliente, ingresando su tipo y número de documento. La información es mostrada en una pantalla de resumen. La aplicación cuenta con dos pantallas principales: una para la entrada de datos y otra para mostrar la información del cliente.

Requisitos
Angular 16
Node.js 14 o superior
Bootstrap 5 (para los estilos)
Estructura del Proyecto
src/app/components/ingreso: Componente para la pantalla de ingreso de tipo y número de documento.
src/app/components/resumen: Componente para la pantalla de resumen de información del cliente.
assets/clientes.json: Archivo JSON que contiene la información mockeada del cliente.
Instalación
Clona este repositorio:

bash
Copiar código
git clone https://github.com/usuario/proyecto-consulta-clientes.git
Navega al directorio del proyecto:

bash
Copiar código
cd proyecto-consulta-clientes
Instala las dependencias del proyecto:

bash
Copiar código
npm install
Ejecución
Inicia el servidor de desarrollo:

bash
Copiar código
ng serve
Abre tu navegador y accede a la aplicación en:

arduino
Copiar código
http://localhost:4200
Uso de la Aplicación
Pantalla de Ingreso
Selecciona el tipo de documento (Cédula de ciudadanía o Pasaporte) de la lista desplegable.
Ingresa el número de documento (mínimo 8 y máximo 11 caracteres). El campo aceptará solo números y los mostrará con separadores de miles.
El botón de búsqueda se activará cuando ambos campos sean válidos.
Haz clic en Buscar para realizar la consulta.
Pantalla de Resumen
Una vez realizada la búsqueda, se mostrará la información del cliente en la pantalla de resumen.
Para regresar a la pantalla anterior, haz clic en el botón Volver.
Información Mockeada
La información del cliente se encuentra "quemada" en el archivo JSON dentro de la carpeta assets:

Cédula de ciudadanía: 23445322
Datos del cliente:
Primer Nombre: Juan
Segundo Nombre: Pablo
Primer Apellido: Pérez
Segundo Apellido: Gómez
Teléfono: 123456789
Dirección: Calle Falsa 123
Ciudad de Residencia: Bogotá
Tecnologías Utilizadas
Angular 16
Bootstrap 5
JSON Mock Data
Mejora Propuesta
Consumo del servicio REST: Aunque esta versión utiliza datos mockeados, se puede implementar el consumo del servicio REST creado en la prueba backend.
Pruebas Unitarias: Se recomienda agregar pruebas unitarias para asegurar el correcto funcionamiento de los componentes.
Contribución
Si deseas contribuir, sigue estos pasos:

Haz un fork del repositorio.

Crea una rama con tu nueva característica:

bash
Copiar código
git checkout -b nueva-caracteristica
Realiza tus cambios y haz commit:

bash
Copiar código
git commit -m "Añadida nueva característica"
Sube los cambios:

bash
Copiar código
git push origin nueva-caracteristica
Crea un Pull Request.
