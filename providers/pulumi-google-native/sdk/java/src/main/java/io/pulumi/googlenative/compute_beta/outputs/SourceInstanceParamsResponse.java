// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.DiskInstantiationConfigResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SourceInstanceParamsResponse {
    /**
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * 
     */
    private final List<DiskInstantiationConfigResponse> diskConfigs;

    @OutputCustomType.Constructor({"diskConfigs"})
    private SourceInstanceParamsResponse(List<DiskInstantiationConfigResponse> diskConfigs) {
        this.diskConfigs = Objects.requireNonNull(diskConfigs);
    }

    /**
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * 
     */
    public List<DiskInstantiationConfigResponse> getDiskConfigs() {
        return this.diskConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceInstanceParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DiskInstantiationConfigResponse> diskConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceInstanceParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfigs = defaults.diskConfigs;
        }

        public Builder setDiskConfigs(List<DiskInstantiationConfigResponse> diskConfigs) {
            this.diskConfigs = Objects.requireNonNull(diskConfigs);
            return this;
        }
        public SourceInstanceParamsResponse build() {
            return new SourceInstanceParamsResponse(diskConfigs);
        }
    }
}
