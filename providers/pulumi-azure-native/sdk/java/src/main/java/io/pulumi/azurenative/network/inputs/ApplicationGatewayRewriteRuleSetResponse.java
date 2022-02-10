// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayRewriteRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayRewriteRuleSetResponse Empty = new ApplicationGatewayRewriteRuleSetResponse();

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="rewriteRules")
    private final @Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules;

    public List<ApplicationGatewayRewriteRuleResponse> getRewriteRules() {
        return this.rewriteRules == null ? List.of() : this.rewriteRules;
    }

    public ApplicationGatewayRewriteRuleSetResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.rewriteRules = rewriteRules;
    }

    private ApplicationGatewayRewriteRuleSetResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.rewriteRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rewriteRules = defaults.rewriteRules;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRewriteRules(@Nullable List<ApplicationGatewayRewriteRuleResponse> rewriteRules) {
            this.rewriteRules = rewriteRules;
            return this;
        }

        public ApplicationGatewayRewriteRuleSetResponse build() {
            return new ApplicationGatewayRewriteRuleSetResponse(etag, id, name, provisioningState, rewriteRules);
        }
    }
}