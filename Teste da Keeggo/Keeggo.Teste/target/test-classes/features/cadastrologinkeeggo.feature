#Author: salesgicelia@gmail.com


Feature: Cadastrar um novo usuario
 Como usuario quero realizar um cadastro para fazer compras
  
  
  Scenario: Cadastrar um novo usuario
    Given que eu entre no site "http://www.advantageonlineshopping.com/#/"
    And acesso o formulario de abertura de conta
    When enviar o formulario
    Then cadastro realizado com sucesso
    