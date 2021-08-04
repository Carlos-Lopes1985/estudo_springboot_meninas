# estudo_springboot_meninas

1 - Usar o BeanValidation(https://www.baeldung.com/javax-validation) para criar as seguintes validações:

1.1 - Nome do cliente minimo de caracteres 50 e maximo 100
1.2 - Nome, cpf e data não podem ser nulos.
1.3 - Não pode haver cpfs repetidos

2 - feature/implementarValidação de cpf/ 

Referencia: https://www.devmedia.com.br/validando-o-cnpj-em-uma-aplicacao-java/22374

3 - feature/criacaoendereco

O relacionamento de Cliente para Endereço será de um para um

Atributos:

id
logadouro(String) - Não pode ser nulo 
cep(String) -Não pode ser nulo / Minimo 10 , maximo 80
numero(Integer) - Não pode ser nulo
complemento
bairro(String) - Não pode ser nulo / Minimo 10 , maximo 80
cidade(String) - Não pode ser nulo / Minimo 10 , maximo 80
estado(String) - Não pode ser nulo / tamanho 2 caracteres

4 - feature/criacaoDTOClienteEndereco

* Criar um DTO(Data transfer object) para salvar cliente e endereço juntos 

5 - feature/criacaodeprodutos

Atributos:

id
nome(String)
preço(double)
tipo(String)
dataValidade(LocalDate)
quantidadeEstoque(Integer) 

Atributos:

Nome / Cpf / dataNascimento / logradouro / cep /numero / complemento / bairro / cidade / estado

Conceitos para estudar OO(Orientação a objetos)

1 -  O que é classe?
2 -  Conceito de interface:
3 -  Conceito de classe abstrata:
4 -  Qual diferença de classe abstrata para interface?
5 -  Herança:
6 -  Polimorfismo:
7 -  Relacionamento um para um, um para muitos e muito para muitos
8 -  Tipos de atributos(String, int, double, float ...)
9 -  Qual a diferença do uso de atributo primitivo para Classe(
https://www.alura.com.br/artigos/diferenca-entre-int-e-integer-em-java?gclid=CjwKCAjw0qOIBhBhEiwAyvVcf2TqrX0_gCxFSG3rMhTBhaCTeCboErfPUthBrapTtlD9GYzO16ctxRoCJVMQAvD_BwE )

  


