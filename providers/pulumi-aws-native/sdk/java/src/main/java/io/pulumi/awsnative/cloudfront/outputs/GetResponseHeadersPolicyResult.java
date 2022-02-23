// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResponseHeadersPolicyResult {
    private final @Nullable String id;
    private final @Nullable String lastModifiedTime;
    private final @Nullable ResponseHeadersPolicyConfig responseHeadersPolicyConfig;

    @OutputCustomType.Constructor({"id","lastModifiedTime","responseHeadersPolicyConfig"})
    private GetResponseHeadersPolicyResult(
        @Nullable String id,
        @Nullable String lastModifiedTime,
        @Nullable ResponseHeadersPolicyConfig responseHeadersPolicyConfig) {
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.responseHeadersPolicyConfig = responseHeadersPolicyConfig;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    public Optional<ResponseHeadersPolicyConfig> getResponseHeadersPolicyConfig() {
        return Optional.ofNullable(this.responseHeadersPolicyConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String lastModifiedTime;
        private @Nullable ResponseHeadersPolicyConfig responseHeadersPolicyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.responseHeadersPolicyConfig = defaults.responseHeadersPolicyConfig;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setResponseHeadersPolicyConfig(@Nullable ResponseHeadersPolicyConfig responseHeadersPolicyConfig) {
            this.responseHeadersPolicyConfig = responseHeadersPolicyConfig;
            return this;
        }
        public GetResponseHeadersPolicyResult build() {
            return new GetResponseHeadersPolicyResult(id, lastModifiedTime, responseHeadersPolicyConfig);
        }
    }
}
