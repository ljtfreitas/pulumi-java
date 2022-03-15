// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StageMethodSetting {
    /**
     * Indicates whether the cached responses are encrypted.
     * 
     */
    private final @Nullable Boolean cacheDataEncrypted;
    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
     */
    private final @Nullable Integer cacheTtlInSeconds;
    /**
     * Indicates whether responses are cached and returned for requests. You must enable a cache cluster on the stage to cache responses.
     * 
     */
    private final @Nullable Boolean cachingEnabled;
    /**
     * Indicates whether data trace logging is enabled for methods in the stage. API Gateway pushes these logs to Amazon CloudWatch Logs.
     * 
     */
    private final @Nullable Boolean dataTraceEnabled;
    /**
     * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * 
     */
    private final @Nullable String httpMethod;
    /**
     * The logging level for this method. For valid values, see the loggingLevel property of the Stage (https://docs.aws.amazon.com/apigateway/api-reference/resource/stage/#loggingLevel) resource in the Amazon API Gateway API Reference.
     * 
     */
    private final @Nullable String loggingLevel;
    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     * 
     */
    private final @Nullable Boolean metricsEnabled;
    /**
     * The resource path for this method. Forward slashes (/) are encoded as ~1 and the initial slash must include a forward slash. For example, the path value /resource/subresource must be encoded as /~1resource~1subresource. To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * 
     */
    private final @Nullable String resourcePath;
    /**
     * The number of burst requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    private final @Nullable Integer throttlingBurstLimit;
    /**
     * The number of steady-state requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    private final @Nullable Double throttlingRateLimit;

    @CustomType.Constructor
    private StageMethodSetting(
        @CustomType.Parameter("cacheDataEncrypted") @Nullable Boolean cacheDataEncrypted,
        @CustomType.Parameter("cacheTtlInSeconds") @Nullable Integer cacheTtlInSeconds,
        @CustomType.Parameter("cachingEnabled") @Nullable Boolean cachingEnabled,
        @CustomType.Parameter("dataTraceEnabled") @Nullable Boolean dataTraceEnabled,
        @CustomType.Parameter("httpMethod") @Nullable String httpMethod,
        @CustomType.Parameter("loggingLevel") @Nullable String loggingLevel,
        @CustomType.Parameter("metricsEnabled") @Nullable Boolean metricsEnabled,
        @CustomType.Parameter("resourcePath") @Nullable String resourcePath,
        @CustomType.Parameter("throttlingBurstLimit") @Nullable Integer throttlingBurstLimit,
        @CustomType.Parameter("throttlingRateLimit") @Nullable Double throttlingRateLimit) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        this.cachingEnabled = cachingEnabled;
        this.dataTraceEnabled = dataTraceEnabled;
        this.httpMethod = httpMethod;
        this.loggingLevel = loggingLevel;
        this.metricsEnabled = metricsEnabled;
        this.resourcePath = resourcePath;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * Indicates whether the cached responses are encrypted.
     * 
    */
    public Optional<Boolean> getCacheDataEncrypted() {
        return Optional.ofNullable(this.cacheDataEncrypted);
    }
    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
    */
    public Optional<Integer> getCacheTtlInSeconds() {
        return Optional.ofNullable(this.cacheTtlInSeconds);
    }
    /**
     * Indicates whether responses are cached and returned for requests. You must enable a cache cluster on the stage to cache responses.
     * 
    */
    public Optional<Boolean> getCachingEnabled() {
        return Optional.ofNullable(this.cachingEnabled);
    }
    /**
     * Indicates whether data trace logging is enabled for methods in the stage. API Gateway pushes these logs to Amazon CloudWatch Logs.
     * 
    */
    public Optional<Boolean> getDataTraceEnabled() {
        return Optional.ofNullable(this.dataTraceEnabled);
    }
    /**
     * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * 
    */
    public Optional<String> getHttpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    /**
     * The logging level for this method. For valid values, see the loggingLevel property of the Stage (https://docs.aws.amazon.com/apigateway/api-reference/resource/stage/#loggingLevel) resource in the Amazon API Gateway API Reference.
     * 
    */
    public Optional<String> getLoggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     * 
    */
    public Optional<Boolean> getMetricsEnabled() {
        return Optional.ofNullable(this.metricsEnabled);
    }
    /**
     * The resource path for this method. Forward slashes (/) are encoded as ~1 and the initial slash must include a forward slash. For example, the path value /resource/subresource must be encoded as /~1resource~1subresource. To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * 
    */
    public Optional<String> getResourcePath() {
        return Optional.ofNullable(this.resourcePath);
    }
    /**
     * The number of burst requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
    */
    public Optional<Integer> getThrottlingBurstLimit() {
        return Optional.ofNullable(this.throttlingBurstLimit);
    }
    /**
     * The number of steady-state requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
    */
    public Optional<Double> getThrottlingRateLimit() {
        return Optional.ofNullable(this.throttlingRateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageMethodSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cacheDataEncrypted;
        private @Nullable Integer cacheTtlInSeconds;
        private @Nullable Boolean cachingEnabled;
        private @Nullable Boolean dataTraceEnabled;
        private @Nullable String httpMethod;
        private @Nullable String loggingLevel;
        private @Nullable Boolean metricsEnabled;
        private @Nullable String resourcePath;
        private @Nullable Integer throttlingBurstLimit;
        private @Nullable Double throttlingRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(StageMethodSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheDataEncrypted = defaults.cacheDataEncrypted;
    	      this.cacheTtlInSeconds = defaults.cacheTtlInSeconds;
    	      this.cachingEnabled = defaults.cachingEnabled;
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.httpMethod = defaults.httpMethod;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.metricsEnabled = defaults.metricsEnabled;
    	      this.resourcePath = defaults.resourcePath;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
        }

        public Builder cacheDataEncrypted(@Nullable Boolean cacheDataEncrypted) {
            this.cacheDataEncrypted = cacheDataEncrypted;
            return this;
        }

        public Builder cacheTtlInSeconds(@Nullable Integer cacheTtlInSeconds) {
            this.cacheTtlInSeconds = cacheTtlInSeconds;
            return this;
        }

        public Builder cachingEnabled(@Nullable Boolean cachingEnabled) {
            this.cachingEnabled = cachingEnabled;
            return this;
        }

        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        public Builder httpMethod(@Nullable String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public Builder metricsEnabled(@Nullable Boolean metricsEnabled) {
            this.metricsEnabled = metricsEnabled;
            return this;
        }

        public Builder resourcePath(@Nullable String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder throttlingBurstLimit(@Nullable Integer throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        public Builder throttlingRateLimit(@Nullable Double throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }
        public StageMethodSetting build() {
            return new StageMethodSetting(cacheDataEncrypted, cacheTtlInSeconds, cachingEnabled, dataTraceEnabled, httpMethod, loggingLevel, metricsEnabled, resourcePath, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}
