// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CorsPolicyResponse {
    private final Boolean allowCredentials;
    private final List<String> allowHeaders;
    private final List<String> allowMethods;
    private final List<String> allowOriginRegexes;
    private final List<String> allowOrigins;
    private final Boolean disabled;
    private final List<String> exposeHeaders;
    private final Integer maxAge;

    @OutputCustomType.Constructor({"allowCredentials","allowHeaders","allowMethods","allowOriginRegexes","allowOrigins","disabled","exposeHeaders","maxAge"})
    private CorsPolicyResponse(
        Boolean allowCredentials,
        List<String> allowHeaders,
        List<String> allowMethods,
        List<String> allowOriginRegexes,
        List<String> allowOrigins,
        Boolean disabled,
        List<String> exposeHeaders,
        Integer maxAge) {
        this.allowCredentials = Objects.requireNonNull(allowCredentials);
        this.allowHeaders = Objects.requireNonNull(allowHeaders);
        this.allowMethods = Objects.requireNonNull(allowMethods);
        this.allowOriginRegexes = Objects.requireNonNull(allowOriginRegexes);
        this.allowOrigins = Objects.requireNonNull(allowOrigins);
        this.disabled = Objects.requireNonNull(disabled);
        this.exposeHeaders = Objects.requireNonNull(exposeHeaders);
        this.maxAge = Objects.requireNonNull(maxAge);
    }

    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }
    public List<String> getAllowHeaders() {
        return this.allowHeaders;
    }
    public List<String> getAllowMethods() {
        return this.allowMethods;
    }
    public List<String> getAllowOriginRegexes() {
        return this.allowOriginRegexes;
    }
    public List<String> getAllowOrigins() {
        return this.allowOrigins;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }
    public List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }
    public Integer getMaxAge() {
        return this.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowCredentials;
        private List<String> allowHeaders;
        private List<String> allowMethods;
        private List<String> allowOriginRegexes;
        private List<String> allowOrigins;
        private Boolean disabled;
        private List<String> exposeHeaders;
        private Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOriginRegexes = defaults.allowOriginRegexes;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowCredentials(Boolean allowCredentials) {
            this.allowCredentials = Objects.requireNonNull(allowCredentials);
            return this;
        }

        public Builder setAllowHeaders(List<String> allowHeaders) {
            this.allowHeaders = Objects.requireNonNull(allowHeaders);
            return this;
        }

        public Builder setAllowMethods(List<String> allowMethods) {
            this.allowMethods = Objects.requireNonNull(allowMethods);
            return this;
        }

        public Builder setAllowOriginRegexes(List<String> allowOriginRegexes) {
            this.allowOriginRegexes = Objects.requireNonNull(allowOriginRegexes);
            return this;
        }

        public Builder setAllowOrigins(List<String> allowOrigins) {
            this.allowOrigins = Objects.requireNonNull(allowOrigins);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setExposeHeaders(List<String> exposeHeaders) {
            this.exposeHeaders = Objects.requireNonNull(exposeHeaders);
            return this;
        }

        public Builder setMaxAge(Integer maxAge) {
            this.maxAge = Objects.requireNonNull(maxAge);
            return this;
        }

        public CorsPolicyResponse build() {
            return new CorsPolicyResponse(allowCredentials, allowHeaders, allowMethods, allowOriginRegexes, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}