// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.metastore_v1beta.inputs.ConsumerResponse;
import java.util.List;
import java.util.Objects;


/**
 * Network configuration for the Dataproc Metastore service.
 * 
 */
public final class NetworkConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkConfigResponse Empty = new NetworkConfigResponse();

    /**
     * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
     */
    @Import(name="consumers", required=true)
      private final List<ConsumerResponse> consumers;

    public List<ConsumerResponse> getConsumers() {
        return this.consumers;
    }

    public NetworkConfigResponse(List<ConsumerResponse> consumers) {
        this.consumers = Objects.requireNonNull(consumers, "expected parameter 'consumers' to be non-null");
    }

    private NetworkConfigResponse() {
        this.consumers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ConsumerResponse> consumers;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumers = defaults.consumers;
        }

        public Builder consumers(List<ConsumerResponse> consumers) {
            this.consumers = Objects.requireNonNull(consumers);
            return this;
        }
        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(consumers);
        }
    }
}
