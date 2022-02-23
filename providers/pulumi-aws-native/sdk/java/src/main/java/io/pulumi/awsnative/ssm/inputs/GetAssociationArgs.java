// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssociationArgs Empty = new GetAssociationArgs();

    /**
     * Unique identifier of the association.
     * 
     */
    @InputImport(name="associationId", required=true)
        private final String associationId;

    public String getAssociationId() {
        return this.associationId;
    }

    public GetAssociationArgs(String associationId) {
        this.associationId = Objects.requireNonNull(associationId, "expected parameter 'associationId' to be non-null");
    }

    private GetAssociationArgs() {
        this.associationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
        }

        public Builder setAssociationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        public GetAssociationArgs build() {
            return new GetAssociationArgs(associationId);
        }
    }
}
