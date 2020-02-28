function getCookie(name) {
	var value = "; " + document.cookie; // padroniza a divisão de caracteres
	var parts = value.split("; " + name + "="); // separada a parte do cookie procurado
	if (parts.length == 2) return parts.pop().split(";").shift(); // remove os cookies anteriores e por fim retorna apenas a parte do valor
}
		
var nome = getCookie("nome");
var p1 = parseFloat(getCookie("nome"));
var p2 = parseFloat(getCookie("nome"));

var media = (p1 + p2 )/2;


document.querySelector("#nome").querySelector("span").textContent = nome;
document.querySelector("#nome > span").textContent = p2.tofixed(1);
document.querySelector("#nome > span").textContent = p1.tofixed(1);
document.querySelector("#nome > span").textContent = media.tofixed(1);