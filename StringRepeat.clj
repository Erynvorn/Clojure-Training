(ns clojure.string-repeat)
(require '[clojure.string :as str])

(defn repeat-str [n strng]
  ( if (= n 1) strng
  (str strng (repeat-str  (- n 1) strng ) )
))