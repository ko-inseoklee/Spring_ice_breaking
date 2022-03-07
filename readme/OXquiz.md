
# OX퀴즈
## - Load random oxQuiz game
OX퀴즈를 랜덤으로 호출하는 METHOD.

    GET 
    
    * REQUEST URL
      IP_address/games/ox-quiz/random    

    * Parameter
      None.

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | question  | String  |
    | answer    | bool    |

    * example
    127.0.0.1/games/ox-quiz/random

## - Load OXquiz game from id
OX퀴즈를 id로 호출하는 METHOD.

    GET 
    
    * REQUEST URL
      IP_address/games/ox-quiz/id_number

    * Parameter
      id_number

    * Result
    | parameter | type    |
    |-----------|---------|
    | id        | int     |
    | question  | String  |
    | answer    | bool    |

    * example
    127.0.0.1/games/ox-quiz/1