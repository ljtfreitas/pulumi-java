// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FrontDoorForwardingProtocol;
import io.pulumi.azurenative.network.inputs.CacheConfigurationArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes Forwarding Route.
 * 
 */
public final class ForwardingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ForwardingConfigurationArgs Empty = new ForwardingConfigurationArgs();

    /**
     * A reference to the BackendPool which this rule routes to.
     * 
     */
    @InputImport(name="backendPool")
        private final @Nullable Input<SubResourceArgs> backendPool;

    public Input<SubResourceArgs> getBackendPool() {
        return this.backendPool == null ? Input.empty() : this.backendPool;
    }

    /**
     * The caching configuration associated with this rule.
     * 
     */
    @InputImport(name="cacheConfiguration")
        private final @Nullable Input<CacheConfigurationArgs> cacheConfiguration;

    public Input<CacheConfigurationArgs> getCacheConfiguration() {
        return this.cacheConfiguration == null ? Input.empty() : this.cacheConfiguration;
    }

    /**
     * A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
     * 
     */
    @InputImport(name="customForwardingPath")
        private final @Nullable Input<String> customForwardingPath;

    public Input<String> getCustomForwardingPath() {
        return this.customForwardingPath == null ? Input.empty() : this.customForwardingPath;
    }

    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    @InputImport(name="forwardingProtocol")
        private final @Nullable Input<Either<String,FrontDoorForwardingProtocol>> forwardingProtocol;

    public Input<Either<String,FrontDoorForwardingProtocol>> getForwardingProtocol() {
        return this.forwardingProtocol == null ? Input.empty() : this.forwardingProtocol;
    }

    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public ForwardingConfigurationArgs(
        @Nullable Input<SubResourceArgs> backendPool,
        @Nullable Input<CacheConfigurationArgs> cacheConfiguration,
        @Nullable Input<String> customForwardingPath,
        @Nullable Input<Either<String,FrontDoorForwardingProtocol>> forwardingProtocol,
        Input<String> odataType) {
        this.backendPool = backendPool;
        this.cacheConfiguration = cacheConfiguration;
        this.customForwardingPath = customForwardingPath;
        this.forwardingProtocol = forwardingProtocol;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ForwardingConfigurationArgs() {
        this.backendPool = Input.empty();
        this.cacheConfiguration = Input.empty();
        this.customForwardingPath = Input.empty();
        this.forwardingProtocol = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> backendPool;
        private @Nullable Input<CacheConfigurationArgs> cacheConfiguration;
        private @Nullable Input<String> customForwardingPath;
        private @Nullable Input<Either<String,FrontDoorForwardingProtocol>> forwardingProtocol;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPool = defaults.backendPool;
    	      this.cacheConfiguration = defaults.cacheConfiguration;
    	      this.customForwardingPath = defaults.customForwardingPath;
    	      this.forwardingProtocol = defaults.forwardingProtocol;
    	      this.odataType = defaults.odataType;
        }

        public Builder setBackendPool(@Nullable Input<SubResourceArgs> backendPool) {
            this.backendPool = backendPool;
            return this;
        }

        public Builder setBackendPool(@Nullable SubResourceArgs backendPool) {
            this.backendPool = Input.ofNullable(backendPool);
            return this;
        }

        public Builder setCacheConfiguration(@Nullable Input<CacheConfigurationArgs> cacheConfiguration) {
            this.cacheConfiguration = cacheConfiguration;
            return this;
        }

        public Builder setCacheConfiguration(@Nullable CacheConfigurationArgs cacheConfiguration) {
            this.cacheConfiguration = Input.ofNullable(cacheConfiguration);
            return this;
        }

        public Builder setCustomForwardingPath(@Nullable Input<String> customForwardingPath) {
            this.customForwardingPath = customForwardingPath;
            return this;
        }

        public Builder setCustomForwardingPath(@Nullable String customForwardingPath) {
            this.customForwardingPath = Input.ofNullable(customForwardingPath);
            return this;
        }

        public Builder setForwardingProtocol(@Nullable Input<Either<String,FrontDoorForwardingProtocol>> forwardingProtocol) {
            this.forwardingProtocol = forwardingProtocol;
            return this;
        }

        public Builder setForwardingProtocol(@Nullable Either<String,FrontDoorForwardingProtocol> forwardingProtocol) {
            this.forwardingProtocol = Input.ofNullable(forwardingProtocol);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public ForwardingConfigurationArgs build() {
            return new ForwardingConfigurationArgs(backendPool, cacheConfiguration, customForwardingPath, forwardingProtocol, odataType);
        }
    }
}
