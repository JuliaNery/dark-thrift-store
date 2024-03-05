# dark-thrift-store

API Rest Do Projeto Dark Thrift Store, um Brecho alternativo com valores acessiveis.

## Requisitos

- [ ] CRUD De Categorias
- [ ] CRUD de Produtos
- [ ] CRUD de Vendas
- [ ] CRUD de Usuarios
- [ ] Autenticação
- [ ] Dashboard

## Documentação

### Endpoints

- [Lista Categorias](#listar-categorias)
- Cadastrar Categoria
- Apagar Categoria
- Detalhar Categoria
- Atualizar Ctegoria

### Listar Categorias

`GET`/categoria


Retorna um array com todas as categorias cadastradas.

#### Exemplo de Response

```json
[
  {
    "id" : 1,
    "nome": "Calçado"
  }
]
```

#### Códigos de Retorno

| código | descrição                         |
|--------|-----------------------------------|
|200| Categorias retornadas com Sucesso |
|401| Não autorizado. Realiza a autenticação em /login|

### Cadastrar Categoria

`POST`/categoria

Cadastra uma categoria com os dados enviados no request body.

#### Request

|Campo| tipo| obrigatorio| descricao|
|-----|-----|:------------:|----------|
|nome|String| sim| Nome dinamico para identificar categoria do produto|

```js
{
    "nome": "Calçado"
}
```

#### Response

```js
{
    "id": 1,
    "nome": "Calçado"
}
```

#### Códigos de Retorno

| código | descrição                         |
|--------|-----------------------------------|
|201| Categoria cadastrada com Sucesso |
|400| Validação falhou, verifique os dados enviados no request body|
|401| Não autorizado. Realiza a autenticação em /login|


### Apagar Categoria

`DELETE`/categoria/`{id}`

Apaga a categoria com base no `id` informado no parametro path.

#### Códigos de Retorno

| código | descrição                         |
|--------|-----------------------------------|
|204| Categoria deletada com Sucesso |
|401| Não autorizado. Realiza a autenticação em /login|

### Detalhar Categoria

`GET`/categoria/`{id}`

Retorna os dados da categoria com base n `id` enviado no parametro path.

#### Exemplo de Retorno

```json

{
    "id" : 1,
    "nome": "Calçado"
}

```


#### Códigos de Retorno

| código | descrição                         |
|--------|-----------------------------------|
|200| Categoria retornada com Sucesso |
|401| Não autorizado. Realiza a autenticação em /login|
|404| Categoria não encontrada|

### Atualizar Categoria

`PUT`/categoria/`{id}`

Atualiza os dados

#### Request

|Campo| tipo| obrigatorio| descricao|
|-----|-----|:------------:|----------|
|nome|String| sim| Nome dinamico para identificar categoria do produto|

```js
{
    "nome": "Calçado"
}
```


#### Response

```js
{
    "id": 1,
    "nome": "Calçado"
}
```

#### Códigos de Retorno

| código | descrição                        |
|--------|----------------------------------|
|201| Categoria cadastrada com Sucesso |
|400| Validação falhou, verifique os dados enviados no request body|
|401| Não autorizado. Realiza a autenticação em /login|
|404| Categoria não encontrada****|