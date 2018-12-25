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
                    :baseFrequency (rand-nth
                                     (range 0.01
                                            0.03
                                            0.001))
                    :numOctaves (rand-nth
                                  (range 3 6 1))}]
    [:feDisplacementMap {:in "SourceGraphic"
                         :scale (rand-nth
                                  (range 25 45 5))}]]])

(defn- genot
  []
  [:h1 (mutate-text "gen♡t centre")])

(defn home-page []
  [:main displace [genot]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
