(ns noboringzeros.core)

(defn no-boring-zeros [n]
(println n)
  (if (or (= n 0) (> (mod n 10) 0))
  n
  (no-boring-zeros (/ n 10)
  )
  )
)


(no-boring-zeros 0)