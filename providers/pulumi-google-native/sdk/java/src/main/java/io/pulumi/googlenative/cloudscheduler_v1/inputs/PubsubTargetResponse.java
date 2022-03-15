// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Pub/Sub target. The job will be delivered by publishing a message to the given Pub/Sub topic.
 * 
 */
public final class PubsubTargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final PubsubTargetResponse Empty = new PubsubTargetResponse();

    /**
     * Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    @Import(name="attributes", required=true)
      private final Map<String,String> attributes;

    public Map<String,String> getAttributes() {
        return this.attributes;
    }

    /**
     * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    @Import(name="data", required=true)
      private final String data;

    public String getData() {
        return this.data;
    }

    /**
     * The name of the Cloud Pub/Sub topic to which messages will be published when a job is delivered. The topic name must be in the same format as required by PubSub's [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the Cloud Scheduler job.
     * 
     */
    @Import(name="topicName", required=true)
      private final String topicName;

    public String getTopicName() {
        return this.topicName;
    }

    public PubsubTargetResponse(
        Map<String,String> attributes,
        String data,
        String topicName) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private PubsubTargetResponse() {
        this.attributes = Map.of();
        this.data = null;
        this.topicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> attributes;
        private String data;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.data = defaults.data;
    	      this.topicName = defaults.topicName;
        }

        public Builder attributes(Map<String,String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder topicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public PubsubTargetResponse build() {
            return new PubsubTargetResponse(attributes, data, topicName);
        }
    }
}
