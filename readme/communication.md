
# 대화

## Communication - Model
| Attribute | Type   |
|-----------|--------|
| id        | int    |
| category  | String |
| question  | String |

### ID List
| id_no   | category |
|---------|----------|
| 1-100   | 나        |
| 101-200 | 가치       |
| 201-300 | 가족       |
| 301-400 | 상상       |
| 401-500 | 일상       |
| 501-600 | 과거       |
| 601-700 | 미래       |
| 701-800 | 관계       |

## Method
### Load communication by id.
id를 기반으로 대화 주제를 불러오는 API.
    
    GET 
    
    * REQUEST URL
      IP_address/communication/get/id

    * Parameter
    id

    * Result
    | parameter | type           |     description     |
    |-----------|----------------|---------------------|
    | status    | int            | HTTP code           |
    | message   | String         | response message    |
    | data      | Communication  | instance            |

    * example
    127.0.0.1:8080/communication/get/1

### Load communications by category
카테고리에 맞는 대화 주제 리스트를 불러오기.


    GET 
    
    * REQUEST URL
      IP_address/communication/category

    * Parameter
      category

    * Result
    | parameter | type           |     description     |
    |-----------|----------------|---------------------|
    | status    | int            | HTTP code           |
    | message   | String         | response message    |
    | data      | Communication  | instance            |

    * example
    127.0.0.1:8080/communication/나