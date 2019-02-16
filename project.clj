(defproject techascent/tech.ml "0.8"
  :description "Base concepts of the techascent ml suite"
  :url "http://github.com/techascent/tech.ml-base"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [techascent/tech.ml.dataset "0.5"]
                 [techascent/tech.io "2.8"]
                 [ml.dmlc/xgboost4j "0.81"]]
  :java-source-paths ["java"])
