(ns index
  {:nextjournal.clerk/visibility {:code :hide}
   :nextjournal.clerk/auto-expand-results? true}
  (:require
   [nextjournal.clerk :as clerk]))

^{::clerk/visibility {:code :hide :result :show}}
(clerk/html
 [:div [:h1 "Welcome!"]
  [:p "Here you can find a list with links to my notes."]
  [:p "If you are interested in how I created these pages, have a look at the source code! There is a link to the source code at the top of each page."]
  [:p "-Stef"]
  [:h2 "Notes"]
  [:ul
   [:li [:a {:href (clerk/doc-url "notes/hello")} "Hello"]]
   [:li [:a {:href (clerk/doc-url "notes/parser_combinators")} "Parser combinators"]]]])
