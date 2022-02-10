// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.CostAllocationRuleDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CostAllocationRulePropertiesResponse {
    private final String createdDate;
    private final @Nullable String description;
    private final CostAllocationRuleDetailsResponse details;
    private final String status;
    private final String updatedDate;

    @OutputCustomType.Constructor({"createdDate","description","details","status","updatedDate"})
    private CostAllocationRulePropertiesResponse(
        String createdDate,
        @Nullable String description,
        CostAllocationRuleDetailsResponse details,
        String status,
        String updatedDate) {
        this.createdDate = Objects.requireNonNull(createdDate);
        this.description = description;
        this.details = Objects.requireNonNull(details);
        this.status = Objects.requireNonNull(status);
        this.updatedDate = Objects.requireNonNull(updatedDate);
    }

    public String getCreatedDate() {
        return this.createdDate;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public CostAllocationRuleDetailsResponse getDetails() {
        return this.details;
    }
    public String getStatus() {
        return this.status;
    }
    public String getUpdatedDate() {
        return this.updatedDate;
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