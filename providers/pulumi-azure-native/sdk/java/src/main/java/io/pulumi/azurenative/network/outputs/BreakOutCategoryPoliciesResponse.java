// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BreakOutCategoryPoliciesResponse {
    /**
     * Flag to control breakout of o365 allow category.
     * 
     */
    private final @Nullable Boolean allow;
    /**
     * Flag to control breakout of o365 default category.
     * 
     */
    private final @Nullable Boolean $default;
    /**
     * Flag to control breakout of o365 optimize category.
     * 
     */
    private final @Nullable Boolean optimize;

    @CustomType.Constructor
    private BreakOutCategoryPoliciesResponse(
        @CustomType.Parameter("allow") @Nullable Boolean allow,
        @CustomType.Parameter("default") @Nullable Boolean $default,
        @CustomType.Parameter("optimize") @Nullable Boolean optimize) {
        this.allow = allow;
        this.$default = $default;
        this.optimize = optimize;
    }

    /**
     * Flag to control breakout of o365 allow category.
     * 
    */
    public Optional<Boolean> getAllow() {
        return Optional.ofNullable(this.allow);
    }
    /**
     * Flag to control breakout of o365 default category.
     * 
    */
    public Optional<Boolean> get$default() {
        return Optional.ofNullable(this.$default);
    }
    /**
     * Flag to control breakout of o365 optimize category.
     * 
    */
    public Optional<Boolean> getOptimize() {
        return Optional.ofNullable(this.optimize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BreakOutCategoryPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allow;
        private @Nullable Boolean $default;
        private @Nullable Boolean optimize;

        public Builder() {
    	      // Empty
        }

        public Builder(BreakOutCategoryPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.$default = defaults.$default;
    	      this.optimize = defaults.optimize;
        }

        public Builder allow(@Nullable Boolean allow) {
            this.allow = allow;
            return this;
        }

        public Builder $default(@Nullable Boolean $default) {
            this.$default = $default;
            return this;
        }

        public Builder optimize(@Nullable Boolean optimize) {
            this.optimize = optimize;
            return this;
        }
        public BreakOutCategoryPoliciesResponse build() {
            return new BreakOutCategoryPoliciesResponse(allow, $default, optimize);
        }
    }
}
