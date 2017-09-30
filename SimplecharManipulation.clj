(ns exclamation-mark.core)
(require '[clojure.string :as str])

(defn remove-bang [s]
(str (str/replace s #"!" "") "!")

)