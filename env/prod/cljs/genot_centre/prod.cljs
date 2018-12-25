(ns genot-centre.prod
  (:require
    [genot-centre.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
