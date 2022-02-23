// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ScaleRuleAuthResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpScaleRuleResponse {
    /**
     * Authentication secrets for the custom scale rule.
     * 
     */
    private final @Nullable List<ScaleRuleAuthResponse> auth;
    /**
     * Metadata properties to describe http scale rule.
     * 
     */
    private final @Nullable Map<String,String> metadata;

    @OutputCustomType.Constructor({"auth","metadata"})
    private HttpScaleRuleResponse(
        @Nullable List<ScaleRuleAuthResponse> auth,
        @Nullable Map<String,String> metadata) {
        this.auth = auth;
        this.metadata = metadata;
    }

    /**
     * Authentication secrets for the custom scale rule.
     * 
     */
    public List<ScaleRuleAuthResponse> getAuth() {
        return this.auth == null ? List.of() : this.auth;
    }
    /**
     * Metadata properties to describe http scale rule.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScaleRuleAuthResponse> auth;
        private @Nullable Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.metadata = defaults.metadata;
        }

        public Builder setAuth(@Nullable List<ScaleRuleAuthResponse> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public HttpScaleRuleResponse build() {
            return new HttpScaleRuleResponse(auth, metadata);
        }
    }
}
