// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class EventSourceMappingSelfManagedEventSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingSelfManagedEventSourceArgs Empty = new EventSourceMappingSelfManagedEventSourceArgs();

    /**
     * A map of endpoints for the self managed source.  For Kafka self-managed sources, the key should be `KAFKA_BOOTSTRAP_SERVERS` and the value should be a string with a comma separated list of broker endpoints.
     * 
     */
    @InputImport(name="endpoints", required=true)
    private final Input<Map<String,String>> endpoints;

    public Input<Map<String,String>> getEndpoints() {
        return this.endpoints;
    }

    public EventSourceMappingSelfManagedEventSourceArgs(Input<Map<String,String>> endpoints) {
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
    }

    private EventSourceMappingSelfManagedEventSourceArgs() {
        this.endpoints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSelfManagedEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> endpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSelfManagedEventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
        }

        public Builder setEndpoints(Input<Map<String,String>> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setEndpoints(Map<String,String> endpoints) {
            this.endpoints = Input.of(Objects.requireNonNull(endpoints));
            return this;
        }
        public EventSourceMappingSelfManagedEventSourceArgs build() {
            return new EventSourceMappingSelfManagedEventSourceArgs(endpoints);
        }
    }
}
