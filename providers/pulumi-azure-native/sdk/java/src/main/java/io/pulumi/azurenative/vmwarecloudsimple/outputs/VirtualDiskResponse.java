// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualDiskResponse {
    /**
     * Disk's Controller id
     * 
     */
    private final String controllerId;
    /**
     * Disk's independence mode type
     * 
     */
    private final String independenceMode;
    /**
     * Disk's total size
     * 
     */
    private final Integer totalSize;
    /**
     * Disk's id
     * 
     */
    private final @Nullable String virtualDiskId;
    /**
     * Disk's display name
     * 
     */
    private final String virtualDiskName;

    @OutputCustomType.Constructor({"controllerId","independenceMode","totalSize","virtualDiskId","virtualDiskName"})
    private VirtualDiskResponse(
        String controllerId,
        String independenceMode,
        Integer totalSize,
        @Nullable String virtualDiskId,
        String virtualDiskName) {
        this.controllerId = Objects.requireNonNull(controllerId);
        this.independenceMode = Objects.requireNonNull(independenceMode);
        this.totalSize = Objects.requireNonNull(totalSize);
        this.virtualDiskId = virtualDiskId;
        this.virtualDiskName = Objects.requireNonNull(virtualDiskName);
    }

    /**
     * Disk's Controller id
     * 
     */
    public String getControllerId() {
        return this.controllerId;
    }
    /**
     * Disk's independence mode type
     * 
     */
    public String getIndependenceMode() {
        return this.independenceMode;
    }
    /**
     * Disk's total size
     * 
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }
    /**
     * Disk's id
     * 
     */
    public Optional<String> getVirtualDiskId() {
        return Optional.ofNullable(this.virtualDiskId);
    }
    /**
     * Disk's display name
     * 
     */
    public String getVirtualDiskName() {
        return this.virtualDiskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String controllerId;
        private String independenceMode;
        private Integer totalSize;
        private @Nullable String virtualDiskId;
        private String virtualDiskName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerId = defaults.controllerId;
    	      this.independenceMode = defaults.independenceMode;
    	      this.totalSize = defaults.totalSize;
    	      this.virtualDiskId = defaults.virtualDiskId;
    	      this.virtualDiskName = defaults.virtualDiskName;
        }

        public Builder setControllerId(String controllerId) {
            this.controllerId = Objects.requireNonNull(controllerId);
            return this;
        }

        public Builder setIndependenceMode(String independenceMode) {
            this.independenceMode = Objects.requireNonNull(independenceMode);
            return this;
        }

        public Builder setTotalSize(Integer totalSize) {
            this.totalSize = Objects.requireNonNull(totalSize);
            return this;
        }

        public Builder setVirtualDiskId(@Nullable String virtualDiskId) {
            this.virtualDiskId = virtualDiskId;
            return this;
        }

        public Builder setVirtualDiskName(String virtualDiskName) {
            this.virtualDiskName = Objects.requireNonNull(virtualDiskName);
            return this;
        }

        public VirtualDiskResponse build() {
            return new VirtualDiskResponse(controllerId, independenceMode, totalSize, virtualDiskId, virtualDiskName);
        }
    }
}
