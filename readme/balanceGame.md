
# 밸런스게임
## - Load random balance game
밸런스게임을 랜덤으로 호출하는 METHOD.

    GET 
    
    * REQUEST URL
      IP_address/games/balance-game/random    

    * Parameter
      None.

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | solution1 | String  |
    | solution2 | String  |

    * example
    127.0.0.1/games/balance-game/random

## - Load balance game from id
밸런스게임을 id로 호출하는 METHOD. </br>
ID 범위: 1-100


    GET 
    
    * REQUEST URL
      IP_address/games/balance-game/id_number

    * Parameter
      id_number

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | solution1 | String  |
    | solution2 | String  |

    * example
    127.0.0.1/games/balance-game/1