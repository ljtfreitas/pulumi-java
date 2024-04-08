(ns minimal-clojure-leiningen.main
  (:import [com.pulumi Pulumi Context]
           [com.pulumi.random RandomPet RandomPetArgs]
           (java.util.function Consumer)))

(defn ->consumer [fn]
  (reify Consumer
    (accept [_ arg]
      (fn arg))))

(defn random-pet []
  (RandomPet. "just-a-random-pet" (-> (RandomPetArgs/builder)
                                      (.length (int 10))
                                      .build)))

(defn- program [^Context ctx]
  (let [log (.log ctx)
        config (.config ctx)
        name (.require config "name")
        secret (.require config "secret")
        pet (random-pet)]
    (.info log (str "Hello, " name))
    (.info log (str "Psst, " secret))
    (.export ctx "pet-name" (.id pet))))

(defn -main [& args]
  (Pulumi/run (->consumer program)))
