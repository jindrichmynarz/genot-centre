(ns genot-centre.core
    (:require
      [reagent.core :as r]
      [genot-centre.mutations
       :refer [mutate-text]]))

;; -------------------------
;; Views

(def displace
  [:svg {:width 0 :height 0}
   [:filter#displace
    [:feTurbulence {:type "turbulence"
                    :baseFrequency 0.02 
                    :numOctaves 5}]
    [:feDisplacementMap {:in "SourceGraphic"
                         :scale 35}]]])

(defn home-page []
  [:main displace [:h1 (mutate-text "gen♡t centre")]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
