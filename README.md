## Readme explicativo :
### Ejercicios del tutorial :

-  Ejercicio1:
   [Añadimos un botón](https://github.com/patriciamv97/DiceRoller1/commit/2eb6ab1e194ef76130b853138a9ed7215397ad72)
   [Cambiamos la distribución del layout](https://github.com/patriciamv97/DiceRoller1/commit/1e2fa433a2fa3cd194f2f416bfc2da965584dd58)
- Ejercicio 2 :
  [Cambiamos el id del botón , se le asigna a una variable a través de findViewById y  añadimos una Toast  ](https://github.com/patriciamv97/DiceRoller1/commit/a2c494983bbe1f0649268e587a0b866dff5910eb)
- Ejercicio 3 :
  [Creamos una función que genere un número aleatorio y aparezca en el TextView](https://github.com/patriciamv97/DiceRoller1/commit/d040e174b40732b55298456d1f4eefe3ffee70ed)
- Ejercicio 4 :
  [Se añaden imágenes del dado al drawable y se modifica la función diceRoll para llamar a las imagenes](https://github.com/patriciamv97/DiceRoller1/commit/8242e68fe732e2e40317fc596647829829cb87b5)
- Ejercicio 5 :
  [Se extrae la variable ImageView con un lateInit ](https://github.com/patriciamv97/DiceRoller1/commit/1e2fa433a2fa3cd194f2f416bfc2da965584dd58)
- Ejercicio 6 :
  [Se habilita utilizar el VectorDrawable](https://github.com/patriciamv97/DiceRoller1/commit/d3ea3c9a60c09e61c485070661e22f2d5fcb1465)

### Strings con diferentes idiomas

Para compatibilizar una app con diferentes idiomas se utilizan los recursos de string,  en los cuales  almacenamos el contenido en un archivo xml en lugar de cargar el texto directamente desde el código
Creamos en values  un nuevo fichero con el nombre strings dónde  cambiaremos el nombre de la app y el texto según idiomas.

![Foto](https://github.com/patriciamv97/DiceRoller1/blob/solucion/screenshots/2021-10-13%20(2).png)

[Ejemplo](https://github.com/patriciamv97/DiceRoller1/commit/a06a6d666debe247cd51069a5cdac9c2a25bd94b)

Estos strings se llaman en  el layout para para que los elementos de la aplicación cambien de idiomas.
Ejemplo :

<Button  
android:id="@+id/roll_button"  
style="@style/Widget.MaterialComponents.Button.TextButton"  
android:layout_width="wrap_content"  
android:layout_height="wrap_content"  
android:layout_gravity="center_horizontal"  
<mark>  android:text="@string/roll"  </mark>
app:icon="@drawable/baseline_fingerprint_24"  
app:layout_constraintEnd_toEndOf="parent"  
app:layout_constraintStart_toStartOf="parent" />

### Añadiendo imagenes

Para utilizar imagenes se utiliza  ImageView.
El control **ImageView** permite mostrar imágenes en la aplicación.
Normalmente estas imágenes tendrán origen en el identificador de un    	recurso de nuestra carpeta _/res/drawable_,  y se id en el layout a través de la propiedad `android:src="@drawable/unaimagen"`.

[Commit](https://github.com/patriciamv97/DiceRoller1/commit/8242e68fe732e2e40317fc596647829829cb87b5)



### Cambiando la función random
Cambiamos la función ramdon por otra parecida que hace lo mismo,  se le da un rango en el que puede variar el valor obtenido.
~~~

randomInt = (1 until 7).random()

~~~
[Commit](https://github.com/patriciamv97/DiceRoller1/commit/b6df0297a95064cea172db471ba64bf1bb4ea013)

### Modificar el botón para usar material.io y que tenga asociado un icono

Para poder usar material.io y darle un estilo diferente al botón primero debemos implementar la librería en el build.gradle (Module) :    `'com.google.android.material:material:1.4.0'`
y así poder acceder a sus recursos.
Luego definimos el estilo en styles y lo  el estilo al elemento que deseemos modificar, en este caso el botón.
Aplicaremos  `style="@style/Widget.MaterialComponents.Button.TextButton`
para que el fondo del botón sea transparente.
Para añadir un icono simplemente debes descargarlo y añadirlo a drawable, una vez añadido mediante la propiedad app:icon del botón lo llamas
**Commits :**

[Implementar Libreria](https://github.com/patriciamv97/DiceRoller1/commit/4a6b5d7ae581e59bc821b554aa5d49d6b8a84b8f)

[Definir estilo](https://github.com/patriciamv97/DiceRoller1/commit/b69c5c6165b2370e3db83c95a876bd8d1601c9a3)
