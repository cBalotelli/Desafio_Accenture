#language:pt
#encoding: utf-8
Funcionalidade: Formulário de dados do veículo
  
   Eu como usuário
   quero acessar o site da Tricentis
   Para que eu possa preencher o formulário de dados do veículo e ir para a próxima aba

  Cenario: Preencher dados do veiculo
    Dado que esteja no site da Tricentis na aba Vehicle Data
    Quando selecionar a marca do veiculo na lista Make
    E preencher o campo Engine Performance
    E preencher o campo Date of Manufacture
    E preencher o campo Number of Seats
    E preencher o campo Fuel Type
    E preencher o campo List Price
    E preencher o campo License Plate Number
    E preencher o campo Annual Mileage
    E clicar no botao Next
    Entao a aba e trocada para a outra aba Enter Insurant Data

  Cenario: Preencher o formulário Insurance Data
    Dado que esteja na aba Enter Insurance Data
    Quando eu preencher o campo First Name
    E preencher o campo Last Name
    E preencher o campo Date of Birth
    E preencher campo Gender
    E preencher o campo Street Address
    E preencher o campo Country
    E preencher o campo Zip Code
    E preencher o campo City
    E preencher o campo Occupation
    E preencher o campo Hobbies
    E preencher o campo Website
    E preencher o campo Picture
    E clica no botao Next
    Entao aba Product data e aberta

  Cenario: Preencher formulario Product Data
    Dado que eu esteja na aba Enter Product Type
    Quando preencher o campo Start Date
    E preencher o campo Insurance Sum
    E preencher o campo Merit Rating
    E preencher o campo Damage Insurance
    E preencher o campo Opcional products
    E preencher o campo Courtesy Car
    E botao next for clicado
    Entao aba Select Price Option e aberta

  Cenario: Selecionar Price Option
    Dado que esteja na aba Select Price Option
    Quando clicar em uma das opcoes de plano
    E botao next e clicado
    Entao a aba Send Quote e aberta

  Cenario: Preencher formulario aba Send Quote
    Dado que esteja na aba Send Quoe
    Quando preencher o campo Email
    E preencher o campo Phone
    E Preencher o campo Username
    E Preencher o campo Password
    E Preencher o campo Confirm Password
    E Preencher o campo Comments
    E clicar no botao next
    Entao email e enviado
