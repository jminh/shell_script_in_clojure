'{:dependencies [[org.clojure/clojure "1.8.0"]
                 [com.palletops/stevedore "0.8.0-beta.7"]]}

(require '[pallet.stevedore :refer [script with-script-language]])
(require 'pallet.stevedore.bash) ;; for bash output

(with-script-language :pallet.stevedore.bash/bash
  (println
  (script
   (doseq [x ["a" "b" "c"]]
     (println @x)))))
