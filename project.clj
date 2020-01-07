(defproject hinamizawa/new-reliquary "0.1.0"
  :description "Clojure newrelic java api wrapper"
  :url "https://github.com/hinamizawa/new-reliquary"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.newrelic.agent.java/newrelic-api "5.9.0"]]
  :profiles {:dev {:dependencies [[ring/ring-mock "0.4.0"]
                                  [ring "1.8.0"]
                                  [org.clojure/tools.trace "0.7.10"]]}})
