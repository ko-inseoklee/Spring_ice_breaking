
# 퀴즈
## - Load random Quiz game
퀴즈를 랜덤으로 호출하는 METHOD.

    GET 
    
    * REQUEST URL
      IP_address:8080/games/quiz/random    

    * Parameter
      None.

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | question  | String  |
    | answer    | String  |

    * example
    127.0.0.1/games/quiz/random

## - Load quiz game from id
퀴즈를 id로 호출하는 METHOD. </br>
ID 범위: 201-300


    GET 
    
    * REQUEST URL
      IP_address/games/quiz/id_number

    * Parameter
      id_number

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | question  | String  |
    | answer    | String  |

    * example
    127.0.0.1:8080/games/quiz/1