// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KubeletConfigResponse {
    /**
     * Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     * 
     */
    private final @Nullable List<String> allowedUnsafeSysctls;
    /**
     * The maximum number of container log files that can be present for a container. The number must be ≥ 2.
     * 
     */
    private final @Nullable Integer containerLogMaxFiles;
    /**
     * The maximum size (e.g. 10Mi) of container log file before it is rotated.
     * 
     */
    private final @Nullable Integer containerLogMaxSizeMB;
    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    private final @Nullable Boolean cpuCfsQuota;
    /**
     * Sets CPU CFS quota period value.
     * 
     */
    private final @Nullable String cpuCfsQuotaPeriod;
    /**
     * CPU Manager policy to use.
     * 
     */
    private final @Nullable String cpuManagerPolicy;
    /**
     * If set to true it will make the Kubelet fail to start if swap is enabled on the node.
     * 
     */
    private final @Nullable Boolean failSwapOn;
    /**
     * The percent of disk usage after which image garbage collection is always run.
     * 
     */
    private final @Nullable Integer imageGcHighThreshold;
    /**
     * The percent of disk usage before which image garbage collection is never run.
     * 
     */
    private final @Nullable Integer imageGcLowThreshold;
    /**
     * The maximum number of processes per pod.
     * 
     */
    private final @Nullable Integer podMaxPids;
    /**
     * Topology Manager policy to use.
     * 
     */
    private final @Nullable String topologyManagerPolicy;

    @OutputCustomType.Constructor({"allowedUnsafeSysctls","containerLogMaxFiles","containerLogMaxSizeMB","cpuCfsQuota","cpuCfsQuotaPeriod","cpuManagerPolicy","failSwapOn","imageGcHighThreshold","imageGcLowThreshold","podMaxPids","topologyManagerPolicy"})
    private KubeletConfigResponse(
        @Nullable List<String> allowedUnsafeSysctls,
        @Nullable Integer containerLogMaxFiles,
        @Nullable Integer containerLogMaxSizeMB,
        @Nullable Boolean cpuCfsQuota,
        @Nullable String cpuCfsQuotaPeriod,
        @Nullable String cpuManagerPolicy,
        @Nullable Boolean failSwapOn,
        @Nullable Integer imageGcHighThreshold,
        @Nullable Integer imageGcLowThreshold,
        @Nullable Integer podMaxPids,
        @Nullable String topologyManagerPolicy) {
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        this.containerLogMaxFiles = containerLogMaxFiles;
        this.containerLogMaxSizeMB = containerLogMaxSizeMB;
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = cpuManagerPolicy;
        this.failSwapOn = failSwapOn;
        this.imageGcHighThreshold = imageGcHighThreshold;
        this.imageGcLowThreshold = imageGcLowThreshold;
        this.podMaxPids = podMaxPids;
        this.topologyManagerPolicy = topologyManagerPolicy;
    }

    /**
     * Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     * 
     */
    public List<String> getAllowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls == null ? List.of() : this.allowedUnsafeSysctls;
    }
    /**
     * The maximum number of container log files that can be present for a container. The number must be ≥ 2.
     * 
     */
    public Optional<Integer> getContainerLogMaxFiles() {
        return Optional.ofNullable(this.containerLogMaxFiles);
    }
    /**
     * The maximum size (e.g. 10Mi) of container log file before it is rotated.
     * 
     */
    public Optional<Integer> getContainerLogMaxSizeMB() {
        return Optional.ofNullable(this.containerLogMaxSizeMB);
    }
    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    public Optional<Boolean> getCpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }
    /**
     * Sets CPU CFS quota period value.
     * 
     */
    public Optional<String> getCpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }
    /**
     * CPU Manager policy to use.
     * 
     */
    public Optional<String> getCpuManagerPolicy() {
        return Optional.ofNullable(this.cpuManagerPolicy);
    }
    /**
     * If set to true it will make the Kubelet fail to start if swap is enabled on the node.
     * 
     */
    public Optional<Boolean> getFailSwapOn() {
        return Optional.ofNullable(this.failSwapOn);
    }
    /**
     * The percent of disk usage after which image garbage collection is always run.
     * 
     */
    public Optional<Integer> getImageGcHighThreshold() {
        return Optional.ofNullable(this.imageGcHighThreshold);
    }
    /**
     * The percent of disk usage before which image garbage collection is never run.
     * 
     */
    public Optional<Integer> getImageGcLowThreshold() {
        return Optional.ofNullable(this.imageGcLowThreshold);
    }
    /**
     * The maximum number of processes per pod.
     * 
     */
    public Optional<Integer> getPodMaxPids() {
        return Optional.ofNullable(this.podMaxPids);
    }
    /**
     * Topology Manager policy to use.
     * 
     */
    public Optional<String> getTopologyManagerPolicy() {
        return Optional.ofNullable(this.topologyManagerPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubeletConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedUnsafeSysctls;
        private @Nullable Integer containerLogMaxFiles;
        private @Nullable Integer containerLogMaxSizeMB;
        private @Nullable Boolean cpuCfsQuota;
        private @Nullable String cpuCfsQuotaPeriod;
        private @Nullable String cpuManagerPolicy;
        private @Nullable Boolean failSwapOn;
        private @Nullable Integer imageGcHighThreshold;
        private @Nullable Integer imageGcLowThreshold;
        private @Nullable Integer podMaxPids;
        private @Nullable String topologyManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(KubeletConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUnsafeSysctls = defaults.allowedUnsafeSysctls;
    	      this.containerLogMaxFiles = defaults.containerLogMaxFiles;
    	      this.containerLogMaxSizeMB = defaults.containerLogMaxSizeMB;
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
    	      this.failSwapOn = defaults.failSwapOn;
    	      this.imageGcHighThreshold = defaults.imageGcHighThreshold;
    	      this.imageGcLowThreshold = defaults.imageGcLowThreshold;
    	      this.podMaxPids = defaults.podMaxPids;
    	      this.topologyManagerPolicy = defaults.topologyManagerPolicy;
        }

        public Builder setAllowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }

        public Builder setContainerLogMaxFiles(@Nullable Integer containerLogMaxFiles) {
            this.containerLogMaxFiles = containerLogMaxFiles;
            return this;
        }

        public Builder setContainerLogMaxSizeMB(@Nullable Integer containerLogMaxSizeMB) {
            this.containerLogMaxSizeMB = containerLogMaxSizeMB;
            return this;
        }

        public Builder setCpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        public Builder setCpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        public Builder setCpuManagerPolicy(@Nullable String cpuManagerPolicy) {
            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }

        public Builder setFailSwapOn(@Nullable Boolean failSwapOn) {
            this.failSwapOn = failSwapOn;
            return this;
        }

        public Builder setImageGcHighThreshold(@Nullable Integer imageGcHighThreshold) {
            this.imageGcHighThreshold = imageGcHighThreshold;
            return this;
        }

        public Builder setImageGcLowThreshold(@Nullable Integer imageGcLowThreshold) {
            this.imageGcLowThreshold = imageGcLowThreshold;
            return this;
        }

        public Builder setPodMaxPids(@Nullable Integer podMaxPids) {
            this.podMaxPids = podMaxPids;
            return this;
        }

        public Builder setTopologyManagerPolicy(@Nullable String topologyManagerPolicy) {
            this.topologyManagerPolicy = topologyManagerPolicy;
            return this;
        }

        public KubeletConfigResponse build() {
            return new KubeletConfigResponse(allowedUnsafeSysctls, containerLogMaxFiles, containerLogMaxSizeMB, cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy, failSwapOn, imageGcHighThreshold, imageGcLowThreshold, podMaxPids, topologyManagerPolicy);
        }
    }
}
