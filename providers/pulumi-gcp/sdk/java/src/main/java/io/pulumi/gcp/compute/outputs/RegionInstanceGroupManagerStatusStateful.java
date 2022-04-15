// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerStatusStatefulPerInstanceConfig;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionInstanceGroupManagerStatusStateful {
    /**
     * A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
     */
    private final @Nullable Boolean hasStatefulConfig;
    /**
     * Status of per-instance configs on the instance.
     * 
     */
    private final @Nullable List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs;

    @CustomType.Constructor
    private RegionInstanceGroupManagerStatusStateful(
        @CustomType.Parameter("hasStatefulConfig") @Nullable Boolean hasStatefulConfig,
        @CustomType.Parameter("perInstanceConfigs") @Nullable List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs) {
        this.hasStatefulConfig = hasStatefulConfig;
        this.perInstanceConfigs = perInstanceConfigs;
    }

    /**
     * A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
    */
    public Optional<Boolean> hasStatefulConfig() {
        return Optional.ofNullable(this.hasStatefulConfig);
    }
    /**
     * Status of per-instance configs on the instance.
     * 
    */
    public List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs() {
        return this.perInstanceConfigs == null ? List.of() : this.perInstanceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusStateful defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean hasStatefulConfig;
        private @Nullable List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusStateful defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasStatefulConfig = defaults.hasStatefulConfig;
    	      this.perInstanceConfigs = defaults.perInstanceConfigs;
        }

        public Builder hasStatefulConfig(@Nullable Boolean hasStatefulConfig) {
            this.hasStatefulConfig = hasStatefulConfig;
            return this;
        }
        public Builder perInstanceConfigs(@Nullable List<RegionInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs) {
            this.perInstanceConfigs = perInstanceConfigs;
            return this;
        }
        public Builder perInstanceConfigs(RegionInstanceGroupManagerStatusStatefulPerInstanceConfig... perInstanceConfigs) {
            return perInstanceConfigs(List.of(perInstanceConfigs));
        }        public RegionInstanceGroupManagerStatusStateful build() {
            return new RegionInstanceGroupManagerStatusStateful(hasStatefulConfig, perInstanceConfigs);
        }
    }
}
