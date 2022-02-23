// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Rest service source.
 * 
 */
public final class RestSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestSourceArgs Empty = new RestSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
        private final @Nullable Input<Object> additionalColumns;

    public Input<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Input.empty() : this.additionalColumns;
    }

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="additionalHeaders")
        private final @Nullable Input<Object> additionalHeaders;

    public Input<Object> getAdditionalHeaders() {
        return this.additionalHeaders == null ? Input.empty() : this.additionalHeaders;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
        private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="httpRequestTimeout")
        private final @Nullable Input<Object> httpRequestTimeout;

    public Input<Object> getHttpRequestTimeout() {
        return this.httpRequestTimeout == null ? Input.empty() : this.httpRequestTimeout;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
        private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="paginationRules")
        private final @Nullable Input<Object> paginationRules;

    public Input<Object> getPaginationRules() {
        return this.paginationRules == null ? Input.empty() : this.paginationRules;
    }

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="requestBody")
        private final @Nullable Input<Object> requestBody;

    public Input<Object> getRequestBody() {
        return this.requestBody == null ? Input.empty() : this.requestBody;
    }

    /**
     * The time to await before sending next page request.
     * 
     */
    @InputImport(name="requestInterval")
        private final @Nullable Input<Object> requestInterval;

    public Input<Object> getRequestInterval() {
        return this.requestInterval == null ? Input.empty() : this.requestInterval;
    }

    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="requestMethod")
        private final @Nullable Input<Object> requestMethod;

    public Input<Object> getRequestMethod() {
        return this.requestMethod == null ? Input.empty() : this.requestMethod;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
        private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
        private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'RestSource'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RestSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> additionalHeaders,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> httpRequestTimeout,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> paginationRules,
        @Nullable Input<Object> requestBody,
        @Nullable Input<Object> requestInterval,
        @Nullable Input<Object> requestMethod,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
        this.additionalColumns = additionalColumns;
        this.additionalHeaders = additionalHeaders;
        this.disableMetricsCollection = disableMetricsCollection;
        this.httpRequestTimeout = httpRequestTimeout;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.paginationRules = paginationRules;
        this.requestBody = requestBody;
        this.requestInterval = requestInterval;
        this.requestMethod = requestMethod;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RestSourceArgs() {
        this.additionalColumns = Input.empty();
        this.additionalHeaders = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.httpRequestTimeout = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.paginationRules = Input.empty();
        this.requestBody = Input.empty();
        this.requestInterval = Input.empty();
        this.requestMethod = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> additionalHeaders;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> httpRequestTimeout;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> paginationRules;
        private @Nullable Input<Object> requestBody;
        private @Nullable Input<Object> requestInterval;
        private @Nullable Input<Object> requestMethod;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.httpRequestTimeout = defaults.httpRequestTimeout;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.paginationRules = defaults.paginationRules;
    	      this.requestBody = defaults.requestBody;
    	      this.requestInterval = defaults.requestInterval;
    	      this.requestMethod = defaults.requestMethod;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Input<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Input.ofNullable(additionalColumns);
            return this;
        }

        public Builder setAdditionalHeaders(@Nullable Input<Object> additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder setAdditionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = Input.ofNullable(additionalHeaders);
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setHttpRequestTimeout(@Nullable Input<Object> httpRequestTimeout) {
            this.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        public Builder setHttpRequestTimeout(@Nullable Object httpRequestTimeout) {
            this.httpRequestTimeout = Input.ofNullable(httpRequestTimeout);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setPaginationRules(@Nullable Input<Object> paginationRules) {
            this.paginationRules = paginationRules;
            return this;
        }

        public Builder setPaginationRules(@Nullable Object paginationRules) {
            this.paginationRules = Input.ofNullable(paginationRules);
            return this;
        }

        public Builder setRequestBody(@Nullable Input<Object> requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public Builder setRequestBody(@Nullable Object requestBody) {
            this.requestBody = Input.ofNullable(requestBody);
            return this;
        }

        public Builder setRequestInterval(@Nullable Input<Object> requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder setRequestInterval(@Nullable Object requestInterval) {
            this.requestInterval = Input.ofNullable(requestInterval);
            return this;
        }

        public Builder setRequestMethod(@Nullable Input<Object> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setRequestMethod(@Nullable Object requestMethod) {
            this.requestMethod = Input.ofNullable(requestMethod);
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RestSourceArgs build() {
            return new RestSourceArgs(additionalColumns, additionalHeaders, disableMetricsCollection, httpRequestTimeout, maxConcurrentConnections, paginationRules, requestBody, requestInterval, requestMethod, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
