nombre = input(" Veuillez saisir un nombre: ")
reste = int(nombre)%2
if reste == 0:
    print("nombre "+ nombre + " est pair")
else:
    print("nombre "+ nombre + " est impair")