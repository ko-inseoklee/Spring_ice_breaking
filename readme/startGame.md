
# 초성게임
## - Load random start game
초성게임을 랜덤으로 호출하는 METHOD.

    GET 
    
    * REQUEST URL
      IP_address/games/start-game/random    

    * Parameter
      None.

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | question  | String  |
    | example   | String  |

    * example
    127.0.0.1/games/start-game/random

## - Load start game from id
초성게임을 id로 호출하는 METHOD. </br>
ID 범위: 301-400

    GET 
    
    * REQUEST URL
      IP_address/games/start-game/id_number

    * Parameter
      id_number

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | question  | String  |
    | example   | String  |

    * example
    127.0.0.1/games/start-game/1