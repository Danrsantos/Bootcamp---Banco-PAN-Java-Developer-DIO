programa {
	funcao inicio() {
		real a , b
		escreva("Digite a nota 1 do aluno: ")
		leia(a)
		escreva ("Digite a nota 2 do aluno: ")
		leia(b)
		
		escreva("Média do aluno: ", media_aluno(a,b))
	}
	
	funcao real media_aluno(real nota_a, real nota_b){
	    retorne (nota_a + nota_b) / 2
	}
}
