// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.EndpointAuthMode;
import io.pulumi.azurenative.machinelearningservices.inputs.EndpointAuthKeysArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Batch endpoint configuration.
 * 
 */
public final class BatchEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchEndpointArgs Empty = new BatchEndpointArgs();

    /**
     * Enum to determine endpoint authentication mode.
     * 
     */
    @InputImport(name="authMode")
        private final @Nullable Input<Either<String,EndpointAuthMode>> authMode;

    public Input<Either<String,EndpointAuthMode>> getAuthMode() {
        return this.authMode == null ? Input.empty() : this.authMode;
    }

    /**
     * Description of the inference endpoint.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * EndpointAuthKeys to set initially on an Endpoint.
     * This property will always be returned as null. AuthKey values must be retrieved using the ListKeys API.
     * 
     */
    @InputImport(name="keys")
        private final @Nullable Input<EndpointAuthKeysArgs> keys;

    public Input<EndpointAuthKeysArgs> getKeys() {
        return this.keys == null ? Input.empty() : this.keys;
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Traffic rules on how the traffic will be routed across deployments.
     * 
     */
    @InputImport(name="traffic")
        private final @Nullable Input<Map<String,Integer>> traffic;

    public Input<Map<String,Integer>> getTraffic() {
        return this.traffic == null ? Input.empty() : this.traffic;
    }

    public BatchEndpointArgs(
        @Nullable Input<Either<String,EndpointAuthMode>> authMode,
        @Nullable Input<String> description,
        @Nullable Input<EndpointAuthKeysArgs> keys,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<Map<String,Integer>> traffic) {
        this.authMode = authMode;
        this.description = description;
        this.keys = keys;
        this.properties = properties;
        this.traffic = traffic;
    }

    private BatchEndpointArgs() {
        this.authMode = Input.empty();
        this.description = Input.empty();
        this.keys = Input.empty();
        this.properties = Input.empty();
        this.traffic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,EndpointAuthMode>> authMode;
        private @Nullable Input<String> description;
        private @Nullable Input<EndpointAuthKeysArgs> keys;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<Map<String,Integer>> traffic;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMode = defaults.authMode;
    	      this.description = defaults.description;
    	      this.keys = defaults.keys;
    	      this.properties = defaults.properties;
    	      this.traffic = defaults.traffic;
        }

        public Builder setAuthMode(@Nullable Input<Either<String,EndpointAuthMode>> authMode) {
            this.authMode = authMode;
            return this;
        }

        public Builder setAuthMode(@Nullable Either<String,EndpointAuthMode> authMode) {
            this.authMode = Input.ofNullable(authMode);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setKeys(@Nullable Input<EndpointAuthKeysArgs> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setKeys(@Nullable EndpointAuthKeysArgs keys) {
            this.keys = Input.ofNullable(keys);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setTraffic(@Nullable Input<Map<String,Integer>> traffic) {
            this.traffic = traffic;
            return this;
        }

        public Builder setTraffic(@Nullable Map<String,Integer> traffic) {
            this.traffic = Input.ofNullable(traffic);
            return this;
        }
        public BatchEndpointArgs build() {
            return new BatchEndpointArgs(authMode, description, keys, properties, traffic);
        }
    }
}
