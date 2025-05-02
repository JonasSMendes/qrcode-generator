# Gerador de Código QR

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-brightgreen)
![AWS SDK](https://img.shields.io/badge/AWS%20SDK-2.24.12-yellow)
![Google ZXing](https://img.shields.io/badge/Google%20ZXing-3.5.2-blue)
![Docker](https://img.shields.io/badge/Docker-✓-blue)
![Maven](https://img.shields.io/badge/Maven-3.9.6-red)

Uma aplicação Spring Boot que gera códigos QR e os armazena no AWS S3. Este projeto demonstra a integração da biblioteca ZXing do Google para geração de códigos QR e do AWS S3 para armazenamento.

## Tabela de Conteúdo

- [Como Usar](#como-usar)
  - [Pré-requisitos](#pré-requisitos)
  - [Variáveis de Ambiente](#variáveis-de-ambiente)
  - [Executando a Aplicação](#executando-a-aplicação)
    - [Desenvolvimento Local](#desenvolvimento-local)
    - [Implantação com Docker](#implantação-com-docker)
  - [Configuração do AWS S3](#configuração-do-aws-s3)
- [Fluxo da Aplicação](#fluxo-da-aplicação)
- [Endpoints da API](#endpoints-da-api)
- [Licença](#licença)

## Como Usar

Esta seção fornece instruções completas para configurar e executar a aplicação Gerador de Código QR.

### Pré-requisitos

- Java 21 JDK
- Maven
- Docker
- Conta AWS com acesso ao S3
- AWS CLI configurado com as credenciais apropriadas

### Variáveis de Ambiente

Crie um arquivo `.env` na raiz do projeto com as seguintes variáveis:

```env
AWS_ACCESS_KEY_ID=sua_chave_de_acesso
AWS_SECRET_ACCESS_KEY=sua_chave_secreta
AWS_REGION=sua_região
AWS_BUCKET_NAME=nome_do_seu_bucket
