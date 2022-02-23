// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class EventSourceMappingSelfManagedEventSource {
    /**
     * A map of endpoints for the self managed source.  For Kafka self-managed sources, the key should be `KAFKA_BOOTSTRAP_SERVERS` and the value should be a string with a comma separated list of broker endpoints.
     * 
     */
    private final Map<String,String> endpoints;

    @OutputCustomType.Constructor({"endpoints"})
    private EventSourceMappingSelfManagedEventSource(Map<String,String> endpoints) {
        this.endpoints = Objects.requireNonNull(endpoints);
    }

    /**
     * A map of endpoints for the self managed source.  For Kafka self-managed sources, the key should be `KAFKA_BOOTSTRAP_SERVERS` and the value should be a string with a comma separated list of broker endpoints.
     * 
     */
    public Map<String,String> getEndpoints() {
        return this.endpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSelfManagedEventSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> endpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSelfManagedEventSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
        }

        public Builder setEndpoints(Map<String,String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public EventSourceMappingSelfManagedEventSource build() {
            return new EventSourceMappingSelfManagedEventSource(endpoints);
        }
    }
}
