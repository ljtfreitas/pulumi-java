// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sftp read settings.
 * 
 */
public final class HttpReadSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpReadSettingsResponse Empty = new HttpReadSettingsResponse();

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="additionalHeaders")
        private final @Nullable Object additionalHeaders;

    public Optional<Object> getAdditionalHeaders() {
        return this.additionalHeaders == null ? Optional.empty() : Optional.ofNullable(this.additionalHeaders);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
        private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @InputImport(name="enablePartitionDiscovery")
        private final @Nullable Boolean enablePartitionDiscovery;

    public Optional<Boolean> getEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery == null ? Optional.empty() : Optional.ofNullable(this.enablePartitionDiscovery);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
        private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionRootPath")
        private final @Nullable Object partitionRootPath;

    public Optional<Object> getPartitionRootPath() {
        return this.partitionRootPath == null ? Optional.empty() : Optional.ofNullable(this.partitionRootPath);
    }

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="requestBody")
        private final @Nullable Object requestBody;

    public Optional<Object> getRequestBody() {
        return this.requestBody == null ? Optional.empty() : Optional.ofNullable(this.requestBody);
    }

    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="requestMethod")
        private final @Nullable Object requestMethod;

    public Optional<Object> getRequestMethod() {
        return this.requestMethod == null ? Optional.empty() : Optional.ofNullable(this.requestMethod);
    }

    /**
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     * 
     */
    @InputImport(name="requestTimeout")
        private final @Nullable Object requestTimeout;

    public Optional<Object> getRequestTimeout() {
        return this.requestTimeout == null ? Optional.empty() : Optional.ofNullable(this.requestTimeout);
    }

    /**
     * The read setting type.
     * Expected value is 'HttpReadSettings'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public HttpReadSettingsResponse(
        @Nullable Object additionalHeaders,
        @Nullable Object disableMetricsCollection,
        @Nullable Boolean enablePartitionDiscovery,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object partitionRootPath,
        @Nullable Object requestBody,
        @Nullable Object requestMethod,
        @Nullable Object requestTimeout,
        String type) {
        this.additionalHeaders = additionalHeaders;
        this.disableMetricsCollection = disableMetricsCollection;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionRootPath = partitionRootPath;
        this.requestBody = requestBody;
        this.requestMethod = requestMethod;
        this.requestTimeout = requestTimeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HttpReadSettingsResponse() {
        this.additionalHeaders = null;
        this.disableMetricsCollection = null;
        this.enablePartitionDiscovery = null;
        this.maxConcurrentConnections = null;
        this.partitionRootPath = null;
        this.requestBody = null;
        this.requestMethod = null;
        this.requestTimeout = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalHeaders;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Boolean enablePartitionDiscovery;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object partitionRootPath;
        private @Nullable Object requestBody;
        private @Nullable Object requestMethod;
        private @Nullable Object requestTimeout;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.enablePartitionDiscovery = defaults.enablePartitionDiscovery;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionRootPath = defaults.partitionRootPath;
    	      this.requestBody = defaults.requestBody;
    	      this.requestMethod = defaults.requestMethod;
    	      this.requestTimeout = defaults.requestTimeout;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setEnablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setPartitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }

        public Builder setRequestBody(@Nullable Object requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public Builder setRequestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setRequestTimeout(@Nullable Object requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public HttpReadSettingsResponse build() {
            return new HttpReadSettingsResponse(additionalHeaders, disableMetricsCollection, enablePartitionDiscovery, maxConcurrentConnections, partitionRootPath, requestBody, requestMethod, requestTimeout, type);
        }
    }
}
