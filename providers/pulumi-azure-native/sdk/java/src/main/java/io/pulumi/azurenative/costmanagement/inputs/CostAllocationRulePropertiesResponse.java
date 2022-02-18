// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.CostAllocationRuleDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a cost allocation rule
 * 
 */
public final class CostAllocationRulePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CostAllocationRulePropertiesResponse Empty = new CostAllocationRulePropertiesResponse();

    /**
     * Time at which the rule was created. Rules that change cost for the same resource are applied in order of creation.
     * 
     */
    @InputImport(name="createdDate", required=true)
    private final String createdDate;

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Description of a cost allocation rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Resource information for the cost allocation rule
     * 
     */
    @InputImport(name="details", required=true)
    private final CostAllocationRuleDetailsResponse details;

    public CostAllocationRuleDetailsResponse getDetails() {
        return this.details;
    }

    /**
     * Status of the rule
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Time at which the rule was last updated.
     * 
     */
    @InputImport(name="updatedDate", required=true)
    private final String updatedDate;

    public String getUpdatedDate() {
        return this.updatedDate;
    }

    public CostAllocationRulePropertiesResponse(
        String createdDate,
        @Nullable String description,
        CostAllocationRuleDetailsResponse details,
        String status,
        String updatedDate) {
        this.createdDate = Objects.requireNonNull(createdDate, "expected parameter 'createdDate' to be non-null");
        this.description = description;
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.updatedDate = Objects.requireNonNull(updatedDate, "expected parameter 'updatedDate' to be non-null");
    }

    private CostAllocationRulePropertiesResponse() {
        this.createdDate = null;
        this.description = null;
        this.details = null;
        this.status = null;
        this.updatedDate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationRulePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable String description;
        private CostAllocationRuleDetailsResponse details;
        private String status;
        private String updatedDate;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationRulePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.details = defaults.details;
    	      this.status = defaults.status;
    	      this.updatedDate = defaults.updatedDate;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDetails(CostAllocationRuleDetailsResponse details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setUpdatedDate(String updatedDate) {
            this.updatedDate = Objects.requireNonNull(updatedDate);
            return this;
        }

        public CostAllocationRulePropertiesResponse build() {
            return new CostAllocationRulePropertiesResponse(createdDate, description, details, status, updatedDate);
        }
    }
}
