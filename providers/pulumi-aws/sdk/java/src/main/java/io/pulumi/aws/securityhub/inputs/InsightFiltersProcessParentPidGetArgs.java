// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightFiltersProcessParentPidGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersProcessParentPidGetArgs Empty = new InsightFiltersProcessParentPidGetArgs();

    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="eq")
      private final @Nullable Output<String> eq;

    public Output<String> getEq() {
        return this.eq == null ? Output.empty() : this.eq;
    }

    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="gte")
      private final @Nullable Output<String> gte;

    public Output<String> getGte() {
        return this.gte == null ? Output.empty() : this.gte;
    }

    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="lte")
      private final @Nullable Output<String> lte;

    public Output<String> getLte() {
        return this.lte == null ? Output.empty() : this.lte;
    }

    public InsightFiltersProcessParentPidGetArgs(
        @Nullable Output<String> eq,
        @Nullable Output<String> gte,
        @Nullable Output<String> lte) {
        this.eq = eq;
        this.gte = gte;
        this.lte = lte;
    }

    private InsightFiltersProcessParentPidGetArgs() {
        this.eq = Output.empty();
        this.gte = Output.empty();
        this.lte = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersProcessParentPidGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eq;
        private @Nullable Output<String> gte;
        private @Nullable Output<String> lte;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersProcessParentPidGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eq = defaults.eq;
    	      this.gte = defaults.gte;
    	      this.lte = defaults.lte;
        }

        public Builder eq(@Nullable Output<String> eq) {
            this.eq = eq;
            return this;
        }

        public Builder eq(@Nullable String eq) {
            this.eq = Output.ofNullable(eq);
            return this;
        }

        public Builder gte(@Nullable Output<String> gte) {
            this.gte = gte;
            return this;
        }

        public Builder gte(@Nullable String gte) {
            this.gte = Output.ofNullable(gte);
            return this;
        }

        public Builder lte(@Nullable Output<String> lte) {
            this.lte = lte;
            return this;
        }

        public Builder lte(@Nullable String lte) {
            this.lte = Output.ofNullable(lte);
            return this;
        }
        public InsightFiltersProcessParentPidGetArgs build() {
            return new InsightFiltersProcessParentPidGetArgs(eq, gte, lte);
        }
    }
}
