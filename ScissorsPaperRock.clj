;; This buffer is for text that is not saved, and for Lisp evaluation.
;; To create a file, visit it with <open> and enter text in its buffer.

(ns rock-paper-scissors)

(defn rps [p1 p2]
 (cond  
       (= p1 p2) "Draw!"
       (and (= p1 "scissors") (= p2 "paper"))    "Player 1 won!"
       (and (= p1 "scissors") (= p2 "paper"))    "Player 1 won!"
       (and (= p1 "paper")    (= p2 "scissors")) "Player 2 won!"
       (and (= p1 "scissors") (= p2 "rock"))     "Player 2 won!"
       (and (= p2 "scissors") (= p1 "rock"))     "Player 1 won!"
       (and (= p1 "paper")    (= p2 "rock"))     "Player 1 won!"
       (and (= p2 "paper")    (= p1 "rock"))     "Player 2 won!"
)
)
