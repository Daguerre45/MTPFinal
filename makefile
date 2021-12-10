compilar:limpiar
	mkdir bin
	javac -cp bin src/dominio/Inicio.java -d bin
	javac -cp bin src/dominio/Menu.java -d bin
	javac -cp bin src/aplicacion/Principal.java -d bin
ejecutar:compilar
	java -cp bin aplicacion.Principal
limpiar:
	rm -rf bin
