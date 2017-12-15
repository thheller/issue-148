(ns shadow.core
    (:require [shadow.hello :as h]
              [reagent.core :as r]))

(defn app []
  [:div h/world])

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (start))
