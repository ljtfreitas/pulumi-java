// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The sku type.
 * 
 */
public final class SkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The reference to plan.
     * 
     */
    @InputImport(name="plan")
    private final @Nullable ResourceReferenceResponse plan;

    public Optional<ResourceReferenceResponse> getPlan() {
        return this.plan == null ? Optional.empty() : Optional.ofNullable(this.plan);
    }

    public SkuResponse(
        String name,
        @Nullable ResourceReferenceResponse plan) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.plan = plan;
    }

    private SkuResponse() {
        this.name = null;
        this.plan = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable ResourceReferenceResponse plan;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlan(@Nullable ResourceReferenceResponse plan) {
            this.plan = plan;
            return this;
        }

        public SkuResponse build() {
            return new SkuResponse(name, plan);
        }
    }
}
