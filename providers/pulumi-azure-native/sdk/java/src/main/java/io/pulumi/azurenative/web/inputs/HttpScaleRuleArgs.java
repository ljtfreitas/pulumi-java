// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ScaleRuleAuthArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container Custom scaling rule.
 * 
 */
public final class HttpScaleRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpScaleRuleArgs Empty = new HttpScaleRuleArgs();

    /**
     * Authentication secrets for the custom scale rule.
     * 
     */
    @InputImport(name="auth")
        private final @Nullable Input<List<ScaleRuleAuthArgs>> auth;

    public Input<List<ScaleRuleAuthArgs>> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    /**
     * Metadata properties to describe http scale rule.
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    public HttpScaleRuleArgs(
        @Nullable Input<List<ScaleRuleAuthArgs>> auth,
        @Nullable Input<Map<String,String>> metadata) {
        this.auth = auth;
        this.metadata = metadata;
    }

    private HttpScaleRuleArgs() {
        this.auth = Input.empty();
        this.metadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpScaleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ScaleRuleAuthArgs>> auth;
        private @Nullable Input<Map<String,String>> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpScaleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.metadata = defaults.metadata;
        }

        public Builder setAuth(@Nullable Input<List<ScaleRuleAuthArgs>> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable List<ScaleRuleAuthArgs> auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }
        public HttpScaleRuleArgs build() {
            return new HttpScaleRuleArgs(auth, metadata);
        }
    }
}
