(defproject minimal-clojure-leiningen "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.2"]
                 [com.pulumi/pulumi "0.9.9"]
                 [com.pulumi/random "4.17.0-alpha.1711780904+13f78848"]]
  :main minimal-clojure-leiningen.main/-main
  :repl-options {:init-ns minimal-clojure-leiningen.main})
