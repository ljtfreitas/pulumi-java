// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * HttpFilterConfiguration supplies additional contextual settings for networkservices.HttpFilter resources enabled by Traffic Director.
 * 
 */
public final class HttpFilterConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpFilterConfigResponse Empty = new HttpFilterConfigResponse();

    /**
     * The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
     * 
     */
    @InputImport(name="config", required=true)
      private final String config;

    public String getConfig() {
        return this.config;
    }

    /**
     * The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
     * 
     */
    @InputImport(name="configTypeUrl", required=true)
      private final String configTypeUrl;

    public String getConfigTypeUrl() {
        return this.configTypeUrl;
    }

    /**
     * Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
     * 
     */
    @InputImport(name="filterName", required=true)
      private final String filterName;

    public String getFilterName() {
        return this.filterName;
    }

    public HttpFilterConfigResponse(
        String config,
        String configTypeUrl,
        String filterName) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.configTypeUrl = Objects.requireNonNull(configTypeUrl, "expected parameter 'configTypeUrl' to be non-null");
        this.filterName = Objects.requireNonNull(filterName, "expected parameter 'filterName' to be non-null");
    }

    private HttpFilterConfigResponse() {
        this.config = null;
        this.configTypeUrl = null;
        this.filterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFilterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String config;
        private String configTypeUrl;
        private String filterName;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFilterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.configTypeUrl = defaults.configTypeUrl;
    	      this.filterName = defaults.filterName;
        }

        public Builder setConfig(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfigTypeUrl(String configTypeUrl) {
            this.configTypeUrl = Objects.requireNonNull(configTypeUrl);
            return this;
        }

        public Builder setFilterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }
        public HttpFilterConfigResponse build() {
            return new HttpFilterConfigResponse(config, configTypeUrl, filterName);
        }
    }
}
