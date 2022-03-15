// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.awsnative.lambda.inputs.EventSourceMappingEndpointsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration used by AWS Lambda to access a self-managed event source.
 * 
 */
public final class EventSourceMappingSelfManagedEventSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingSelfManagedEventSourceArgs Empty = new EventSourceMappingSelfManagedEventSourceArgs();

    /**
     * The endpoints for a self-managed event source.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<EventSourceMappingEndpointsArgs> endpoints;

    public Output<EventSourceMappingEndpointsArgs> getEndpoints() {
        return this.endpoints == null ? Output.empty() : this.endpoints;
    }

    public EventSourceMappingSelfManagedEventSourceArgs(@Nullable Output<EventSourceMappingEndpointsArgs> endpoints) {
        this.endpoints = endpoints;
    }

    private EventSourceMappingSelfManagedEventSourceArgs() {
        this.endpoints = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSelfManagedEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EventSourceMappingEndpointsArgs> endpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSelfManagedEventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
        }

        public Builder endpoints(@Nullable Output<EventSourceMappingEndpointsArgs> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(@Nullable EventSourceMappingEndpointsArgs endpoints) {
            this.endpoints = Output.ofNullable(endpoints);
            return this;
        }
        public EventSourceMappingSelfManagedEventSourceArgs build() {
            return new EventSourceMappingSelfManagedEventSourceArgs(endpoints);
        }
    }
}
