Feature: To test Beer Service

  Scenario: For get method
    Given url 'http://localhost:8080/api/v1/customer/113bc867-582e-42ae-8802-327c22b023a0'
    #And def BodyOfRequest = read('/../customer.json')
    #And request BodyOfRequest
    When method GET
    Then status 200
    Then print response

  Scenario: For Post method
    Given url 'http://localhost:8080/api/v1/customer'
    And def BodyOfRequest = read('/../customer.json')
    And header Content-Type = 'application/json'
    And request BodyOfRequest
    When method POST
    Then status 201
    Then print response

  Scenario: For Put method
    Given url 'http://localhost:8080/api/v1/customer/113bc867-582e-42ae-8802-327c22b023a0'
    And def BodyOfRequest = read('/../customer.json')
    And header Content-Type = 'application/json'
    And request BodyOfRequest
    When method PUT
    Then status 204
    Then print response

  Scenario: For Delete method
    Given url 'http://localhost:8080/api/v1/customer/113bc867-582e-42ae-8802-327c22b023a0'
    When method DELETE
    Then status 204
    Then print response
