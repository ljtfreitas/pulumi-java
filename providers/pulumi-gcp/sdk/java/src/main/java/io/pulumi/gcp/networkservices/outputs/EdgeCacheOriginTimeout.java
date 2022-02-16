// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheOriginTimeout {
    private final @Nullable String connectTimeout;
    private final @Nullable String maxAttemptsTimeout;
    private final @Nullable String responseTimeout;

    @OutputCustomType.Constructor({"connectTimeout","maxAttemptsTimeout","responseTimeout"})
    private EdgeCacheOriginTimeout(
        @Nullable String connectTimeout,
        @Nullable String maxAttemptsTimeout,
        @Nullable String responseTimeout) {
        this.connectTimeout = connectTimeout;
        this.maxAttemptsTimeout = maxAttemptsTimeout;
        this.responseTimeout = responseTimeout;
    }

    public Optional<String> getConnectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }
    public Optional<String> getMaxAttemptsTimeout() {
        return Optional.ofNullable(this.maxAttemptsTimeout);
    }
    public Optional<String> getResponseTimeout() {
        return Optional.ofNullable(this.responseTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheOriginTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectTimeout;
        private @Nullable String maxAttemptsTimeout;
        private @Nullable String responseTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheOriginTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.maxAttemptsTimeout = defaults.maxAttemptsTimeout;
    	      this.responseTimeout = defaults.responseTimeout;
        }

        public Builder setConnectTimeout(@Nullable String connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        public Builder setMaxAttemptsTimeout(@Nullable String maxAttemptsTimeout) {
            this.maxAttemptsTimeout = maxAttemptsTimeout;
            return this;
        }

        public Builder setResponseTimeout(@Nullable String responseTimeout) {
            this.responseTimeout = responseTimeout;
            return this;
        }

        public EdgeCacheOriginTimeout build() {
            return new EdgeCacheOriginTimeout(connectTimeout, maxAttemptsTimeout, responseTimeout);
        }
    }
}