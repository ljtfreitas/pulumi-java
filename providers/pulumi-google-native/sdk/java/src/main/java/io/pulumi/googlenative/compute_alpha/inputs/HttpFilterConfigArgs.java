// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HttpFilterConfiguration supplies additional contextual settings for networkservices.HttpFilter resources enabled by Traffic Director.
 * 
 */
public final class HttpFilterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpFilterConfigArgs Empty = new HttpFilterConfigArgs();

    /**
     * The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    @InputImport(name="config")
      private final @Nullable Input<String> config;

    public Input<String> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    @InputImport(name="configTypeUrl")
      private final @Nullable Input<String> configTypeUrl;

    public Input<String> getConfigTypeUrl() {
        return this.configTypeUrl == null ? Input.empty() : this.configTypeUrl;
    }

    /**
     * Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    @InputImport(name="filterName")
      private final @Nullable Input<String> filterName;

    public Input<String> getFilterName() {
        return this.filterName == null ? Input.empty() : this.filterName;
    }

    public HttpFilterConfigArgs(
        @Nullable Input<String> config,
        @Nullable Input<String> configTypeUrl,
        @Nullable Input<String> filterName) {
        this.config = config;
        this.configTypeUrl = configTypeUrl;
        this.filterName = filterName;
    }

    private HttpFilterConfigArgs() {
        this.config = Input.empty();
        this.configTypeUrl = Input.empty();
        this.filterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFilterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> config;
        private @Nullable Input<String> configTypeUrl;
        private @Nullable Input<String> filterName;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFilterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.configTypeUrl = defaults.configTypeUrl;
    	      this.filterName = defaults.filterName;
        }

        public Builder setConfig(@Nullable Input<String> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable String config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setConfigTypeUrl(@Nullable Input<String> configTypeUrl) {
            this.configTypeUrl = configTypeUrl;
            return this;
        }

        public Builder setConfigTypeUrl(@Nullable String configTypeUrl) {
            this.configTypeUrl = Input.ofNullable(configTypeUrl);
            return this;
        }

        public Builder setFilterName(@Nullable Input<String> filterName) {
            this.filterName = filterName;
            return this;
        }

        public Builder setFilterName(@Nullable String filterName) {
            this.filterName = Input.ofNullable(filterName);
            return this;
        }
        public HttpFilterConfigArgs build() {
            return new HttpFilterConfigArgs(config, configTypeUrl, filterName);
        }
    }
}
