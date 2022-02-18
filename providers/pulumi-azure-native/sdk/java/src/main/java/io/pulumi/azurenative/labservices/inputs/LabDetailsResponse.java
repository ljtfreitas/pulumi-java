// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This represents the details about a lab that the User is in, and its state.
 * 
 */
public final class LabDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabDetailsResponse Empty = new LabDetailsResponse();

    /**
     * The Id of the lab.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the lab
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the lab.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * The maximum duration a user can use a VM in this lab.
     * 
     */
    @InputImport(name="usageQuota", required=true)
    private final String usageQuota;

    public String getUsageQuota() {
        return this.usageQuota;
    }

    public LabDetailsResponse(
        @Nullable String id,
        @Nullable String name,
        @Nullable String provisioningState,
        String usageQuota) {
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.usageQuota = Objects.requireNonNull(usageQuota, "expected parameter 'usageQuota' to be non-null");
    }

    private LabDetailsResponse() {
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.usageQuota = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String provisioningState;
        private String usageQuota;

        public Builder() {
    	      // Empty
        }

        public Builder(LabDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.usageQuota = defaults.usageQuota;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setUsageQuota(String usageQuota) {
            this.usageQuota = Objects.requireNonNull(usageQuota);
            return this;
        }

        public LabDetailsResponse build() {
            return new LabDetailsResponse(id, name, provisioningState, usageQuota);
        }
    }
}
