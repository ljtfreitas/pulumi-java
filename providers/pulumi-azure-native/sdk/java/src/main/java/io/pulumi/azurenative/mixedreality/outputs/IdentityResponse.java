// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityResponse {
    /**
     * The principal ID of resource identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of resource.
     * 
     */
    private final String tenantId;
    /**
     * The identity type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"principalId","tenantId","type"})
    private IdentityResponse(
        String principalId,
        String tenantId,
        @Nullable String type) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = type;
    }

    /**
     * The principal ID of resource identity.
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of resource.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The identity type.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type);
        }
    }
}
