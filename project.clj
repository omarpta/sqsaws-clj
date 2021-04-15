(defproject sqsaws-clj "0.1.0"
  :description "Library for simple usage of AWS SQS"
  :url "https://github.com/omarpta/sqsaws-clj"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.amazonaws/aws-java-sdk "1.11.998"]]
  :signing {:gpg-key "4244A6439C7981D965A40C5734CDD81AE4D401EB"}
  :repl-options {:init-ns sqsaws-clj.core})
