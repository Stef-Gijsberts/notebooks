(ns build
  (:require
   [clojure.java.io :as io]
   [clojure.java.shell :as sh]
   [nextjournal.clerk :as clerk]))

(defn build []
  (let [output-dir "docs"]
    (when (.exists (io/file output-dir))
      (sh/sh "rm" "-rf" output-dir))
    (clerk/build! {:paths ["notebooks"]
                   :output-dir output-dir
                   :bundle? true})
    (println "Build complete. Output in" output-dir)))
