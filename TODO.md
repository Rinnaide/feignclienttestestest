# TODO List for CEP Lookup Application

- [x] Update FeignclienttestestestMainApplication.java to add @EnableFeignClients annotation
- [x] Create CepResponse.java: POJO with fields for logradouro, bairro, localidade, estado
- [x] Create CepClient.java: Feign interface to call ViaCEP API
- [x] Create CepController.java: REST controller with GET /cep/{cep} endpoint
- [x] Run the application and test the endpoint
