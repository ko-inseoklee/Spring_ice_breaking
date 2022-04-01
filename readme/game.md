# 게임

## Model

### Balance-Game
| Attribute | Type   |
|-----------|--------|
| id        | int    |
| solution1 | String |
| solution2 | String |

### OX-Quiz
| Attribute | Type    |
|-----------|---------|
| id        | int     |
| question  | String  |
| answer    | bool    |

#### Quiz
| Attribute | Type    |
|-----------|---------|
| id        | int     |
| question  | String  |
| answer    | String  |

#### Start-Game

| Attribute | Type    |
|-----------|---------|
| id        | int     |
| question  | String  |
| example   | String  |



## ID List
| id_no   | category |
|---------|----------|
| 1-100   | 밸런스게임    |
| 101-200 | OX퀴즈     |
| 201-300 | 퀴즈       |
| 301-400 | 초성게임     |
| 401-500 | 이구동성게임   |


## Method
### - Load game randomly
랜덤 게임 불러오기.

    GET 
    
    * REQUEST URL
      IP_address/games/each-game/random

    * Reqeust Parameter
      - each-game(balance-game / ox-quiz / quiz / start-game / with-one-mouth)
      

    * Result
    | parameter |      type      |          description           |
    |-----------|----------------|--------------------------------|
    |  status   |      int       |            HTTP code           |
    |  message  |     String     |       response message         |
    |   data    |      Game      | each-game by request parameter |

    * example
    127.0.0.1:8080/balance-game/random

### Load game by id
id로 원하는 게임 불러오기.


    GET 
    
    * REQUEST URL
      IP_address/games/each-game/id

    * Parameter
      - each-game(balance-game / ox-quiz / quiz / start-game / with-one-mouth)
      - id

    * Result
    | parameter | type           |     description     |
    |-----------|----------------|---------------------|
    | status    | int            | HTTP code           |
    | message   | String         | response message    |
    | data      | Communication  | instance            |

    * example
    127.0.0.1:8080/games/balance-game/1