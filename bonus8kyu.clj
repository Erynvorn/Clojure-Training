(ns clojure.bonus)

(defn bonus-time [salary bonus]
  (if (= bonus true) (str "$" (* 10 salary)) (str "$" salary))
  )