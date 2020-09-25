(defproject techascent/tech.ml "3.03-SNAPSHOT"
  :description "Base concepts of the techascent ml suite"
  :url "http://github.com/techascent/tech.ml-base"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :dependencies [[techascent/tech.ml.dataset "4.04" :scope "provided"]]
  :lein-tools-deps/config {:config-files [:install :user :project]}
  :profiles {:dev {:lein-tools-deps/config {:resolve-aliases [:test]}}}
  :java-source-paths ["java"])
