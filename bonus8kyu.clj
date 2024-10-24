(ns clojure.bonus)

(defn bonus-time [salary bonus]
  (if (= bonus true) (str "$" (* 100 salary)) (str "$" salary))
  )