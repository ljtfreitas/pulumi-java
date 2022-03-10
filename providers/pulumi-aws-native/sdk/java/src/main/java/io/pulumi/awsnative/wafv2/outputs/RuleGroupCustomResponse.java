// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupCustomHTTPHeader;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupCustomResponse {
    /**
     * Custom response body key.
     * 
     */
    private final @Nullable String customResponseBodyKey;
    private final Integer responseCode;
    /**
     * Collection of HTTP headers.
     * 
     */
    private final @Nullable List<RuleGroupCustomHTTPHeader> responseHeaders;

    @OutputCustomType.Constructor
    private RuleGroupCustomResponse(
        @OutputCustomType.Parameter("customResponseBodyKey") @Nullable String customResponseBodyKey,
        @OutputCustomType.Parameter("responseCode") Integer responseCode,
        @OutputCustomType.Parameter("responseHeaders") @Nullable List<RuleGroupCustomHTTPHeader> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = responseCode;
        this.responseHeaders = responseHeaders;
    }

    /**
     * Custom response body key.
     * 
    */
    public Optional<String> getCustomResponseBodyKey() {
        return Optional.ofNullable(this.customResponseBodyKey);
    }
    public Integer getResponseCode() {
        return this.responseCode;
    }
    /**
     * Collection of HTTP headers.
     * 
    */
    public List<RuleGroupCustomHTTPHeader> getResponseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customResponseBodyKey;
        private Integer responseCode;
        private @Nullable List<RuleGroupCustomHTTPHeader> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder setCustomResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder setResponseCode(Integer responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }

        public Builder setResponseHeaders(@Nullable List<RuleGroupCustomHTTPHeader> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public RuleGroupCustomResponse build() {
            return new RuleGroupCustomResponse(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
