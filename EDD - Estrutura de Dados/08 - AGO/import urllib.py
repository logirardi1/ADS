import urllib.request
pagina = urllib.request.urlopen('http://beans.itcarlow.ie/prices.html')
texto = pagina.read().decode('utf-8')
print(texto)
ondeinicio=texto.find("$")
ondefim=texto.find("</", ondeinicio)
preco=texto[ondeinicio+1 : ondefim]
  