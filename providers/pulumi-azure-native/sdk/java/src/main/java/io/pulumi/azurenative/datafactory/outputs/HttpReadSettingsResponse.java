// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpReadSettingsResponse {
    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object additionalHeaders;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    private final @Nullable Boolean enablePartitionDiscovery;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionRootPath;
    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object requestBody;
    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object requestMethod;
    /**
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     * 
     */
    private final @Nullable Object requestTimeout;
    /**
     * The read setting type.
     * Expected value is 'HttpReadSettings'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private HttpReadSettingsResponse(
        @CustomType.Parameter("additionalHeaders") @Nullable Object additionalHeaders,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("enablePartitionDiscovery") @Nullable Boolean enablePartitionDiscovery,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("partitionRootPath") @Nullable Object partitionRootPath,
        @CustomType.Parameter("requestBody") @Nullable Object requestBody,
        @CustomType.Parameter("requestMethod") @Nullable Object requestMethod,
        @CustomType.Parameter("requestTimeout") @Nullable Object requestTimeout,
        @CustomType.Parameter("type") String type) {
        this.additionalHeaders = additionalHeaders;
        this.disableMetricsCollection = disableMetricsCollection;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionRootPath = partitionRootPath;
        this.requestBody = requestBody;
        this.requestMethod = requestMethod;
        this.requestTimeout = requestTimeout;
        this.type = type;
    }

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getAdditionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Indicates whether to enable partition discovery.
     * 
    */
    public Optional<Boolean> getEnablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPartitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }
    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRequestBody() {
        return Optional.ofNullable(this.requestBody);
    }
    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRequestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }
    /**
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     * 
    */
    public Optional<Object> getRequestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }
    /**
     * The read setting type.
     * Expected value is 'HttpReadSettings'.
     * 
    */
    public String getType() {
        return this.type;
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

        public Builder additionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder enablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder partitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }

        public Builder requestBody(@Nullable Object requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public Builder requestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder requestTimeout(@Nullable Object requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public HttpReadSettingsResponse build() {
            return new HttpReadSettingsResponse(additionalHeaders, disableMetricsCollection, enablePartitionDiscovery, maxConcurrentConnections, partitionRootPath, requestBody, requestMethod, requestTimeout, type);
        }
    }
}
