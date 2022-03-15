// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.DaprComponentArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App Dapr configuration.
 * 
 */
public final class DaprArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaprArgs Empty = new DaprArgs();

    /**
     * Dapr application identifier
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Output.empty() : this.appId;
    }

    /**
     * Port on which the Dapr side car
     * 
     */
    @Import(name="appPort")
      private final @Nullable Output<Integer> appPort;

    public Output<Integer> getAppPort() {
        return this.appPort == null ? Output.empty() : this.appPort;
    }

    /**
     * Collection of Dapr components
     * 
     */
    @Import(name="components")
      private final @Nullable Output<List<DaprComponentArgs>> components;

    public Output<List<DaprComponentArgs>> getComponents() {
        return this.components == null ? Output.empty() : this.components;
    }

    /**
     * Boolean indicating if the Dapr side car is enabled
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public DaprArgs(
        @Nullable Output<String> appId,
        @Nullable Output<Integer> appPort,
        @Nullable Output<List<DaprComponentArgs>> components,
        @Nullable Output<Boolean> enabled) {
        this.appId = appId;
        this.appPort = appPort;
        this.components = components;
        this.enabled = enabled;
    }

    private DaprArgs() {
        this.appId = Output.empty();
        this.appPort = Output.empty();
        this.components = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<Integer> appPort;
        private @Nullable Output<List<DaprComponentArgs>> components;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DaprArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appPort = defaults.appPort;
    	      this.components = defaults.components;
    	      this.enabled = defaults.enabled;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = Output.ofNullable(appId);
            return this;
        }

        public Builder appPort(@Nullable Output<Integer> appPort) {
            this.appPort = appPort;
            return this;
        }

        public Builder appPort(@Nullable Integer appPort) {
            this.appPort = Output.ofNullable(appPort);
            return this;
        }

        public Builder components(@Nullable Output<List<DaprComponentArgs>> components) {
            this.components = components;
            return this;
        }

        public Builder components(@Nullable List<DaprComponentArgs> components) {
            this.components = Output.ofNullable(components);
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public DaprArgs build() {
            return new DaprArgs(appId, appPort, components, enabled);
        }
    }
}
