(ns ^:figwheel-no-load genot-centre.dev
  (:require
    [genot-centre.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
