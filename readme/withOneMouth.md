
# 이구동성
## - Load with-one-mouth start game
이구동성을 랜덤으로 호출하는 METHOD.

    GET 
    
    * REQUEST URL
      IP_address:8080/games/with-one-mouth/random    

    * Parameter
      None.

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | word1     | String  |
    | word2     | String  |

    * example
    127.0.0.1/games/with-one-mouth/random

## - Load with-one-mouth game from id
이구동성을 id로 호출하는 METHOD. </br>
ID 범위: 301-400

    GET 
    
    * REQUEST URL
      IP_address:8080/games/with-one-mouth/id_number

    * Parameter
      id_number

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | word1     | String  |
    | word2     | String  |

    * example
    127.0.0.1/games/with-one-mouth/1