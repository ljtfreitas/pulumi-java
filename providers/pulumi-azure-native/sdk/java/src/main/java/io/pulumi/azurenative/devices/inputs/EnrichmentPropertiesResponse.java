// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The properties of an enrichment that your IoT hub applies to messages delivered to endpoints.
 * 
 */
public final class EnrichmentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnrichmentPropertiesResponse Empty = new EnrichmentPropertiesResponse();

    /**
     * The list of endpoints for which the enrichment is applied to the message.
     * 
     */
    @InputImport(name="endpointNames", required=true)
        private final List<String> endpointNames;

    public List<String> getEndpointNames() {
        return this.endpointNames;
    }

    /**
     * The key or name for the enrichment property.
     * 
     */
    @InputImport(name="key", required=true)
        private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * The value for the enrichment property.
     * 
     */
    @InputImport(name="value", required=true)
        private final String value;

    public String getValue() {
        return this.value;
    }

    public EnrichmentPropertiesResponse(
        List<String> endpointNames,
        String key,
        String value) {
        this.endpointNames = Objects.requireNonNull(endpointNames, "expected parameter 'endpointNames' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private EnrichmentPropertiesResponse() {
        this.endpointNames = List.of();
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnrichmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> endpointNames;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnrichmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointNames = defaults.endpointNames;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public EnrichmentPropertiesResponse build() {
            return new EnrichmentPropertiesResponse(endpointNames, key, value);
        }
    }
}
