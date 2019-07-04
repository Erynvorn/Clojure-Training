(ns clojure.chromosomes)

(defn chromosome-check [sperm]
  (if (or (= sperm "XY") (= sperm "YX"))
    "Congratulations! You're going to have a son." 
    "Congratulations! You're going to have a daughter.")
  )
