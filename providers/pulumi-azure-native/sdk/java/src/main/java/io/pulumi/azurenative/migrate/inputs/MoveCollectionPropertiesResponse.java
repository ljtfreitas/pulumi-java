// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.MoveCollectionPropertiesResponseErrors;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the move collection properties.
 * 
 */
public final class MoveCollectionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MoveCollectionPropertiesResponse Empty = new MoveCollectionPropertiesResponse();

    /**
     * Defines the move collection errors.
     * 
     */
    @InputImport(name="errors", required=true)
    private final MoveCollectionPropertiesResponseErrors errors;

    public MoveCollectionPropertiesResponseErrors getErrors() {
        return this.errors;
    }

    /**
     * Defines the provisioning states.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Gets or sets the source region.
     * 
     */
    @InputImport(name="sourceRegion", required=true)
    private final String sourceRegion;

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * Gets or sets the target region.
     * 
     */
    @InputImport(name="targetRegion", required=true)
    private final String targetRegion;

    public String getTargetRegion() {
        return this.targetRegion;
    }

    public MoveCollectionPropertiesResponse(
        MoveCollectionPropertiesResponseErrors errors,
        String provisioningState,
        String sourceRegion,
        String targetRegion) {
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.sourceRegion = Objects.requireNonNull(sourceRegion, "expected parameter 'sourceRegion' to be non-null");
        this.targetRegion = Objects.requireNonNull(targetRegion, "expected parameter 'targetRegion' to be non-null");
    }

    private MoveCollectionPropertiesResponse() {
        this.errors = null;
        this.provisioningState = null;
        this.sourceRegion = null;
        this.targetRegion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveCollectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoveCollectionPropertiesResponseErrors errors;
        private String provisioningState;
        private String sourceRegion;
        private String targetRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveCollectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.targetRegion = defaults.targetRegion;
        }

        public Builder setErrors(MoveCollectionPropertiesResponseErrors errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSourceRegion(String sourceRegion) {
            this.sourceRegion = Objects.requireNonNull(sourceRegion);
            return this;
        }

        public Builder setTargetRegion(String targetRegion) {
            this.targetRegion = Objects.requireNonNull(targetRegion);
            return this;
        }

        public MoveCollectionPropertiesResponse build() {
            return new MoveCollectionPropertiesResponse(errors, provisioningState, sourceRegion, targetRegion);
        }
    }
}
