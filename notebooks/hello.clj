(ns hello
  (:require [nextjournal.clerk :as clerk]))

(def greeting "Hello")
(def what "world")

(str greeting ", " what "!")
