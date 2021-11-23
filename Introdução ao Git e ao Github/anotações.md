# Introdução ao Git/Github
## Comandos Úteis (Windows e Linux)
   - Tab (completa automaticamente nomes de pastas)  
   - cls (clear screen)
   - No Linux (clear) (Ctrl + L)
   - cd - change directory:  
	cd..(Volta para a raiz)  
	cd/caminho específico  
   - ls - list(Linux)
   - dir - lista diretórios (windows)
   - mkdir (make directory)- cria novo diretório
   - rmdir(windows - remove diretorio)
   - rm -rf (linux) - deleta todos os arquivos.
   - echo - printa no terminal
	echo hello >(o sinal de maior é um redir
	ecionador de fluxo) hello.txt
   - pwd(linux) - exibe o diretório atual
  
## Tópicos importantes Git
 - SHA1 (Secure Hash Algorithm)   
	Conjunto de funções hash criptógráficas projetadas pela NSA.    
	A encriptação gera conjunto de caracteres indentificador de 40 dígitos.  
	***open ssl sha 1 (nome do arquivo e tipo)*** Dessa forma podemos visualizar os caracteres da encriptação do arquivo.  
 - Objetos Fundamentais  
	- Blobs(bolhas)  
	- Trees(Arvores)  
		Armazenam e apontam para os blobs.  
	        Estrutura e onde estão localizados os arquivos.
	- Commits  
	        Aponta para uma arvore, um ultimo comiit, para o autor e pode conter uma mensagem descritiva sobre as alterações feitas.  
	        timestamp(carimbo de tempo) - leva a data ehora que foi criado.  
                Todos possuem um sha1.
## Sistema distribuido
  O Git é considerado um sistema distribuido devido aos commits, estrutura, forma como foi projetado.
## Segurança

- Chave SSH e Tokens,.
- Conexão pré-estabelecida.
- $ ssh-keygen -t ed25519 -C "your_email@example.com" (Comando para gerar a chave).
- eval "$(ssh-agent -s)" (iniciar o Agente SSH).
- Token de acesso pessoal no github (Settings - developer settings).

## Principais Comandos Git
- git init
- git add
- git commit
- git config
- git remote add origin
- git remote -v (Lista as origens)
- git push origin master
- git pull origin master(puxa alterações do repositorio remoto)

## Conflitos

- Merge: duas alterações distintas na mesma linha criam um problema no arquivo, e ao tentarmos comitar qualquer alteração o git nos orienta a corrigir manualmente o problema.
