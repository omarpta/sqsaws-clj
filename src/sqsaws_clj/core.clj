(ns sqsaws-clj.core
  (:import com.amazonaws.auth.BasicAWSCredentials
           com.amazonaws.services.sqs.AmazonSQSClientBuilder
           com.amazonaws.auth.AWSStaticCredentialsProvider))

(defn get-sqs-builder
  [access-key secret-key region]
  (let [credentials (new BasicAWSCredentials access-key secret-key)]
    (-> (AmazonSQSClientBuilder/standard)
            (.withCredentials (new AWSStaticCredentialsProvider credentials))
            (.withRegion region)
            (.build))))

(defn receive-message
  [sqs queue-url]
   (-> (.receiveMessage sqs queue-url)
       (.getMessages)))

(defn get-message-body
  [message]
  (.getBody message))

(defn send-message
  [sqs queue-url text]
  (.sendMessage sqs queue-url text)
  true)

(defn delete-message
  [sqs queue-url message]
  (.deleteMessage sqs queue-url (.getReceiptHandle message)))