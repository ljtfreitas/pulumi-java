(defproject minimal-lein-clojure-pulumi "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.2"]
                 [com.pulumi/pulumi "0.9.9"]]
  :main minimal-lein-clojure-pulumi.main/-main
  :repl-options {:init-ns minimal-lein-clojure-pulumi.main})
