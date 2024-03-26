(ns minimal-lein-clojure-pulumi.main
  (:import [com.pulumi Pulumi Context]
           (java.util.function Consumer)))

(defn ->consumer [fn]
  (reify Consumer
    (accept [_ arg]
      (fn arg))))

(defn- program [^Context ctx]
  (let [log (.log ctx)
        config (.config ctx)
        name (.require config "name")
        secret (.require config "secret")]
    (.info log (str "Hello, " name))
    (.info log (str "Psst, " secret))))

(defn -main [& args]
  (Pulumi/run (->consumer program)))
