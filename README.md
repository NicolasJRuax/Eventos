https://github.com/NicolasJRuax/Eventos.git

# Gestor de Eventos

## Descripción

La aplicación de gestión de eventos permite a los usuarios registrar eventos, visualizar una lista de ellos y obtener detalles básicos como nombre, descripción, dirección, fecha y precio. Además, incluye una funcionalidad para agregar nuevos eventos y mostrarlos en tiempo real en una lista.

---

## Funcionalidades Principales

1. **Registrar eventos**: Los usuarios pueden agregar eventos proporcionando detalles como nombre, descripción, dirección, fecha y precio.
2. **Visualizar eventos**: Muestra una lista de eventos registrados con nombre, descripción y precio.
3. **Detalles de eventos**: Cada evento registrado contiene información detallada que puede visualizarse.
4. **Interfaz interactiva**: Incluye un botón flotante para agregar nuevos eventos fácilmente.
5. **Soporte Multilenguaje**: Dependiendo de el idioma que tengas configurado en el movil los textos se mostrarán en dicho idioma.

---

## Estructura del Proyecto

### `MainActivity.java`

- **Descripción**: Es la actividad principal que muestra la lista de eventos utilizando un `RecyclerView`. También permite al usuario agregar nuevos eventos a través de un `FloatingActionButton`.
- **Responsabilidades**:
  - Configura el `RecyclerView` con un adaptador (`EventAdapter`).
  - Gestiona el flujo para agregar un evento utilizando `startActivityForResult`.
  - Recibe los datos de un nuevo evento desde `AddEventActivity` y actualiza la lista.
  
---

### `AddEventActivity.java`

- **Descripción**: Esta actividad permite a los usuarios registrar un nuevo evento ingresando los detalles necesarios como nombre, descripción, dirección, fecha y precio.
- **Responsabilidades**:
  - Captura los datos del usuario a través de campos de texto (`EditText`).
  - Verifica que los campos obligatorios estén completos.
  - Retorna el evento creado a `MainActivity` mediante un `Intent`.

---

### `EventAdapter.java`

- **Descripción**: Es el adaptador utilizado por el `RecyclerView` para mostrar los eventos en la lista.
- **Responsabilidades**:
  - Genera vistas para cada elemento de la lista de eventos (`Event`).
  - Maneja los clics de cada elemento, permitiendo acciones específicas, como mostrar los detalles del evento seleccionado.

---

### `Event.java`

- **Descripción**: Es el modelo que representa un evento.
- **Atributos**:
  - `name`: Nombre del evento.
  - `description`: Breve descripción del evento.
  - `address`: Dirección donde se llevará a cabo el evento.
  - `date`: Fecha del evento.
  - `price`: Precio del evento.
- **Métodos**:
  - Incluye getters y setters para acceder y modificar los atributos.

---

## Archivos XML

### `activity_main.xml`

Define la interfaz principal de la aplicación:

- Un `RecyclerView` para listar los eventos.
- Un botón flotante (`FloatingActionButton`) para agregar nuevos eventos.

### `activity_add_event.xml`

Formulario para agregar nuevos eventos:

- Campos de texto (`EditText`) para capturar el nombre, descripción, dirección, fecha y precio del evento.
- Botones para guardar o cancelar la acción.

### `item_event.xml`

Define el diseño de cada elemento en la lista de eventos:

- Muestra el nombre, descripción y precio del evento.

---

## Flujo de la Aplicación

1. Al iniciar la aplicación, se carga la `MainActivity`, que muestra la lista de eventos registrados.
2. El usuario puede presionar el botón flotante para abrir `AddEventActivity` y registrar un nuevo evento.
3. Después de guardar un evento, se retorna a `MainActivity`, donde el evento se agrega a la lista.
4. Al hacer clic en un evento, se pueden realizar acciones adicionales (por ejemplo, mostrar más detalles en una futura implementación).

---
