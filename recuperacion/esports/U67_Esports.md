# Ejercicio: Gestión de Equipos de E-Sports

Una empresa especializada en la organización de torneos de **e-sports** nos ha encargado que desarrollemos el core de una aplicación para gestionar los equipos y sus estadísticas en los torneos.

Para ello, necesitamos conocer todos los equipos que participan en los torneos y las `estadísticas` de los jugadores que los conforman. Un `Equipo` es un concepto abstracto que representa un conjunto de jugadores que participan juntos en los torneos. Los jugadores pueden ser profesionales o amateurs.

Cada `Equipo` debe tener un nombre, un identificador único que le asignamos al crearlo, y una lista de jugadores. Los `Jugadores` tienen un nombre, un alias (nick), una edad, un identificador único y el rol que desempeñan en el equipo (por ejemplo, "Carry", "Support", "Tank"). Los jugadores profesionales también tienen un ranking en el circuito de **e-sports**.

Además, en nuestro sistema, se registran las `estadísticas` de cada equipo en diferentes torneos. Estas `estadísticas` se calculan a partir del número de partidas jugadas, el número de partidas ganadas, el número de partidas perdidas y el ranking del equipo en ese torneo.

La empresa quiere que el sistema funcione rápidamente, porque uno de los requisitos es que dado un equipo, se pueda obtener rápidamente un conjunto con todas las `estadísticas` de los torneos en los que ha participado. Deberemos, por tanto, implementar una estructura de datos que permita almacenar esta información.

Todos los `Equipos` creados tienen como mínimo una `Estadística` asociada.

Igualmente, en el sistema deberemos implementar los siguientes métodos:

- `mostrarEquiposOrdenados()`: que muestra todos los equipos ordenados por nombre.
- `obtenerEstadisticas(String nombreEquipo)`: recibe como parámetro el nombre de un equipo, y devuelve un conjunto de todas las `estadísticas` de los torneos asociados con él.
- `mostrarEquiposConMasVictorias()`: que muestra todos los equipos que tienen más victorias que derrotas.
- `addEstadistica(Estadistica estadistica)`: que añade una estadística de torneo con la que puede operar nuestro sistema.

Cada noche, es necesario que se guarde toda la información que tenemos en memoria, por lo que tendremos que almacenar en un fichero el resultado del día y recuperarlo al día siguiente para realizar una serie de informes de interés para la Junta Administrativa. Por ello, nuestra aplicación tendrá los métodos:

- `guardarEstadisticas()`: que guarda todas las estadísticas en un fichero estadisticas.dat.
- `recuperarEstadisticas()`: que recupera todas las estadísticas del fichero estadisticas.dat.

La clase que gestiona todo, deberá llamarse `ESports`.

Desde el programa principal deberemos probar todos los métodos:

- Crear equipos y jugadores.
- Añadir estadísticas a los equipos.
- Mostrar los equipos ordenados.
- Mostrar los equipos con más victorias.
- Guarda y recupera las estadísticas en/de un archivo.
