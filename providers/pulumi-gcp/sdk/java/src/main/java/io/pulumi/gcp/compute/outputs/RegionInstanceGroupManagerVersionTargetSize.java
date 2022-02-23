// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionInstanceGroupManagerVersionTargetSize {
    /**
     * , The number of instances which are managed for this version. Conflicts with `percent`.
     * 
     */
    private final @Nullable Integer fixed;
    /**
     * , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
     * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
     * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
     * 
     */
    private final @Nullable Integer percent;

    @OutputCustomType.Constructor({"fixed","percent"})
    private RegionInstanceGroupManagerVersionTargetSize(
        @Nullable Integer fixed,
        @Nullable Integer percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    /**
     * , The number of instances which are managed for this version. Conflicts with `percent`.
     * 
     */
    public Optional<Integer> getFixed() {
        return Optional.ofNullable(this.fixed);
    }
    /**
     * , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
     * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
     * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
     * 
     */
    public Optional<Integer> getPercent() {
        return Optional.ofNullable(this.percent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerVersionTargetSize defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fixed;
        private @Nullable Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerVersionTargetSize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder setFixed(@Nullable Integer fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder setPercent(@Nullable Integer percent) {
            this.percent = percent;
            return this;
        }
        public RegionInstanceGroupManagerVersionTargetSize build() {
            return new RegionInstanceGroupManagerVersionTargetSize(fixed, percent);
        }
    }
}
