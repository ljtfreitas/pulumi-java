// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A Pub/Sub destination.
 * 
 */
public final class PubsubDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final PubsubDestinationResponse Empty = new PubsubDestinationResponse();

    /**
     * The name of the Pub/Sub topic to publish job completion notification to. For example: `projects/{project}/topics/{topic}`.
     * 
     */
    @InputImport(name="topic", required=true)
      private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public PubsubDestinationResponse(String topic) {
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private PubsubDestinationResponse() {
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public PubsubDestinationResponse build() {
            return new PubsubDestinationResponse(topic);
        }
    }
}
