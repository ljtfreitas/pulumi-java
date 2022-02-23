// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.LinkedIntegrationRuntimeKeyAuthorizationResponse;
import io.pulumi.azurenative.synapse.inputs.LinkedIntegrationRuntimeRbacAuthorizationResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Self-hosted integration runtime.
 * 
 */
public final class SelfHostedIntegrationRuntimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SelfHostedIntegrationRuntimeResponse Empty = new SelfHostedIntegrationRuntimeResponse();

    /**
     * Integration runtime description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Linked integration runtime type from data factory
     * 
     */
    @InputImport(name="linkedInfo")
        private final @Nullable Either<LinkedIntegrationRuntimeKeyAuthorizationResponse,LinkedIntegrationRuntimeRbacAuthorizationResponse> linkedInfo;

    public Either<LinkedIntegrationRuntimeKeyAuthorizationResponse,LinkedIntegrationRuntimeRbacAuthorizationResponse> getLinkedInfo() {
        return this.linkedInfo == null ? null : this.linkedInfo;
    }

    /**
     * The type of integration runtime.
     * Expected value is 'SelfHosted'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public SelfHostedIntegrationRuntimeResponse(
        @Nullable String description,
        @Nullable Either<LinkedIntegrationRuntimeKeyAuthorizationResponse,LinkedIntegrationRuntimeRbacAuthorizationResponse> linkedInfo,
        String type) {
        this.description = description;
        this.linkedInfo = linkedInfo;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SelfHostedIntegrationRuntimeResponse() {
        this.description = null;
        this.linkedInfo = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfHostedIntegrationRuntimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Either<LinkedIntegrationRuntimeKeyAuthorizationResponse,LinkedIntegrationRuntimeRbacAuthorizationResponse> linkedInfo;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfHostedIntegrationRuntimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.linkedInfo = defaults.linkedInfo;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLinkedInfo(@Nullable Either<LinkedIntegrationRuntimeKeyAuthorizationResponse,LinkedIntegrationRuntimeRbacAuthorizationResponse> linkedInfo) {
            this.linkedInfo = linkedInfo;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SelfHostedIntegrationRuntimeResponse build() {
            return new SelfHostedIntegrationRuntimeResponse(description, linkedInfo, type);
        }
    }
}
