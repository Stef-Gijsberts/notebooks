(ns index
  {:nextjournal.clerk/visibility {:code :hide}
   :nextjournal.clerk/auto-expand-results? true}
  (:require
   [nextjournal.clerk :as clerk]))

^{::clerk/visibility {:code :hide :result :show}}
(clerk/html
 [:div [:h1 "Welcome!"]
  [:p "There are no notes yet, just a structure!"]
  [:p "If you are interested in how I created these pages, have a look at the source code!"]
  [:ul
   [:li [:a {:href (clerk/doc-url "")} "Home"]]
   [:li [:a {:href (clerk/doc-url "notebooks/hello")} "Hello"]]]])
