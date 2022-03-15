// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final PlanResponse Empty = new PlanResponse();

    /**
     * Plan accessibility
     * 
     */
    @Import(name="accessibility")
      private final @Nullable String accessibility;

    public Optional<String> getAccessibility() {
        return this.accessibility == null ? Optional.empty() : Optional.ofNullable(this.accessibility);
    }

    /**
     * Alternative stack type
     * 
     */
    @Import(name="altStackReference", required=true)
      private final String altStackReference;

    public String getAltStackReference() {
        return this.altStackReference;
    }

    /**
     * Friendly name for the plan for display in the marketplace
     * 
     */
    @Import(name="planDisplayName", required=true)
      private final String planDisplayName;

    public String getPlanDisplayName() {
        return this.planDisplayName;
    }

    /**
     * Text identifier for this plan
     * 
     */
    @Import(name="planId", required=true)
      private final String planId;

    public String getPlanId() {
        return this.planId;
    }

    /**
     * Identifier for this plan
     * 
     */
    @Import(name="skuId", required=true)
      private final String skuId;

    public String getSkuId() {
        return this.skuId;
    }

    /**
     * Stack type (classic or arm)
     * 
     */
    @Import(name="stackType", required=true)
      private final String stackType;

    public String getStackType() {
        return this.stackType;
    }

    public PlanResponse(
        @Nullable String accessibility,
        String altStackReference,
        String planDisplayName,
        String planId,
        String skuId,
        String stackType) {
        this.accessibility = accessibility;
        this.altStackReference = Objects.requireNonNull(altStackReference, "expected parameter 'altStackReference' to be non-null");
        this.planDisplayName = Objects.requireNonNull(planDisplayName, "expected parameter 'planDisplayName' to be non-null");
        this.planId = Objects.requireNonNull(planId, "expected parameter 'planId' to be non-null");
        this.skuId = Objects.requireNonNull(skuId, "expected parameter 'skuId' to be non-null");
        this.stackType = Objects.requireNonNull(stackType, "expected parameter 'stackType' to be non-null");
    }

    private PlanResponse() {
        this.accessibility = null;
        this.altStackReference = null;
        this.planDisplayName = null;
        this.planId = null;
        this.skuId = null;
        this.stackType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessibility;
        private String altStackReference;
        private String planDisplayName;
        private String planId;
        private String skuId;
        private String stackType;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessibility = defaults.accessibility;
    	      this.altStackReference = defaults.altStackReference;
    	      this.planDisplayName = defaults.planDisplayName;
    	      this.planId = defaults.planId;
    	      this.skuId = defaults.skuId;
    	      this.stackType = defaults.stackType;
        }

        public Builder accessibility(@Nullable String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        public Builder altStackReference(String altStackReference) {
            this.altStackReference = Objects.requireNonNull(altStackReference);
            return this;
        }

        public Builder planDisplayName(String planDisplayName) {
            this.planDisplayName = Objects.requireNonNull(planDisplayName);
            return this;
        }

        public Builder planId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder skuId(String skuId) {
            this.skuId = Objects.requireNonNull(skuId);
            return this;
        }

        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public PlanResponse build() {
            return new PlanResponse(accessibility, altStackReference, planDisplayName, planId, skuId, stackType);
        }
    }
}
