// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AssignmentPrincipal
 * 
 */
public final class AssignmentPrincipalResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentPrincipalResponse Empty = new AssignmentPrincipalResponse();

    /**
     * The principal id being assigned to.
     * 
     */
    @InputImport(name="principalId", required=true)
        private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Other metadata for the principal.
     * 
     */
    @InputImport(name="principalMetadata")
        private final @Nullable Map<String,String> principalMetadata;

    public Map<String,String> getPrincipalMetadata() {
        return this.principalMetadata == null ? Map.of() : this.principalMetadata;
    }

    /**
     * The Type of the principal ID.
     * 
     */
    @InputImport(name="principalType", required=true)
        private final String principalType;

    public String getPrincipalType() {
        return this.principalType;
    }

    public AssignmentPrincipalResponse(
        String principalId,
        @Nullable Map<String,String> principalMetadata,
        String principalType) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalMetadata = principalMetadata;
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
    }

    private AssignmentPrincipalResponse() {
        this.principalId = null;
        this.principalMetadata = Map.of();
        this.principalType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentPrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private @Nullable Map<String,String> principalMetadata;
        private String principalType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentPrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.principalMetadata = defaults.principalMetadata;
    	      this.principalType = defaults.principalType;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalMetadata(@Nullable Map<String,String> principalMetadata) {
            this.principalMetadata = principalMetadata;
            return this;
        }

        public Builder setPrincipalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        public AssignmentPrincipalResponse build() {
            return new AssignmentPrincipalResponse(principalId, principalMetadata, principalType);
        }
    }
}
