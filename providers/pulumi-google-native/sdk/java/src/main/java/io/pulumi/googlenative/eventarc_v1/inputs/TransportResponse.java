// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.eventarc_v1.inputs.PubsubResponse;
import java.util.Objects;


/**
 * Represents the transport intermediaries created for the trigger to deliver events.
 * 
 */
public final class TransportResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransportResponse Empty = new TransportResponse();

    /**
     * The Pub/Sub topic and subscription used by Eventarc as a transport intermediary.
     * 
     */
    @InputImport(name="pubsub", required=true)
      private final PubsubResponse pubsub;

    public PubsubResponse getPubsub() {
        return this.pubsub;
    }

    public TransportResponse(PubsubResponse pubsub) {
        this.pubsub = Objects.requireNonNull(pubsub, "expected parameter 'pubsub' to be non-null");
    }

    private TransportResponse() {
        this.pubsub = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubsubResponse pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder setPubsub(PubsubResponse pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }
        public TransportResponse build() {
            return new TransportResponse(pubsub);
        }
    }
}
