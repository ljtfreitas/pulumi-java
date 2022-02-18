// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.RoutingSource;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the fallback route. IoT Hub uses these properties when it routes messages to the fallback endpoint.
 * 
 */
public final class FallbackRoutePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FallbackRoutePropertiesArgs Empty = new FallbackRoutePropertiesArgs();

    /**
     * The condition which is evaluated in order to apply the fallback route. If the condition is not provided it will evaluate to true by default. For grammar, See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The list of endpoints to which the messages that satisfy the condition are routed to. Currently only 1 endpoint is allowed.
     * 
     */
    @InputImport(name="endpointNames", required=true)
    private final Input<List<String>> endpointNames;

    public Input<List<String>> getEndpointNames() {
        return this.endpointNames;
    }

    /**
     * Used to specify whether the fallback route is enabled.
     * 
     */
    @InputImport(name="isEnabled", required=true)
    private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The source to which the routing rule is to be applied to. For example, DeviceMessages
     * 
     */
    @InputImport(name="source", required=true)
    private final Input<Either<String,RoutingSource>> source;

    public Input<Either<String,RoutingSource>> getSource() {
        return this.source;
    }

    public FallbackRoutePropertiesArgs(
        @Nullable Input<String> condition,
        Input<List<String>> endpointNames,
        Input<Boolean> isEnabled,
        @Nullable Input<String> name,
        Input<Either<String,RoutingSource>> source) {
        this.condition = condition;
        this.endpointNames = Objects.requireNonNull(endpointNames, "expected parameter 'endpointNames' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.name = name;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private FallbackRoutePropertiesArgs() {
        this.condition = Input.empty();
        this.endpointNames = Input.empty();
        this.isEnabled = Input.empty();
        this.name = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FallbackRoutePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condition;
        private Input<List<String>> endpointNames;
        private Input<Boolean> isEnabled;
        private @Nullable Input<String> name;
        private Input<Either<String,RoutingSource>> source;

        public Builder() {
    	      // Empty
        }

        public Builder(FallbackRoutePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEndpointNames(Input<List<String>> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Input.of(Objects.requireNonNull(endpointNames));
            return this;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSource(Input<Either<String,RoutingSource>> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(Either<String,RoutingSource> source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public FallbackRoutePropertiesArgs build() {
            return new FallbackRoutePropertiesArgs(condition, endpointNames, isEnabled, name, source);
        }
    }
}
