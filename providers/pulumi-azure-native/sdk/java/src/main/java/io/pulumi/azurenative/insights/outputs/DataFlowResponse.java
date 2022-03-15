// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataFlowResponse {
    /**
     * List of destinations for this data flow.
     * 
     */
    private final @Nullable List<String> destinations;
    /**
     * List of streams for this data flow.
     * 
     */
    private final @Nullable List<String> streams;

    @CustomType.Constructor
    private DataFlowResponse(
        @CustomType.Parameter("destinations") @Nullable List<String> destinations,
        @CustomType.Parameter("streams") @Nullable List<String> streams) {
        this.destinations = destinations;
        this.streams = streams;
    }

    /**
     * List of destinations for this data flow.
     * 
    */
    public List<String> getDestinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    /**
     * List of streams for this data flow.
     * 
    */
    public List<String> getStreams() {
        return this.streams == null ? List.of() : this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> destinations;
        private @Nullable List<String> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.streams = defaults.streams;
        }

        public Builder destinations(@Nullable List<String> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder streams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }
        public DataFlowResponse build() {
            return new DataFlowResponse(destinations, streams);
        }
    }
}
