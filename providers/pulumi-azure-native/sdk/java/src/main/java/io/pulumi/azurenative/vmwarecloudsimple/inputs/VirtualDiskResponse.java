// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual disk model
 * 
 */
public final class VirtualDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualDiskResponse Empty = new VirtualDiskResponse();

    /**
     * Disk's Controller id
     * 
     */
    @InputImport(name="controllerId", required=true)
        private final String controllerId;

    public String getControllerId() {
        return this.controllerId;
    }

    /**
     * Disk's independence mode type
     * 
     */
    @InputImport(name="independenceMode", required=true)
        private final String independenceMode;

    public String getIndependenceMode() {
        return this.independenceMode;
    }

    /**
     * Disk's total size
     * 
     */
    @InputImport(name="totalSize", required=true)
        private final Integer totalSize;

    public Integer getTotalSize() {
        return this.totalSize;
    }

    /**
     * Disk's id
     * 
     */
    @InputImport(name="virtualDiskId")
        private final @Nullable String virtualDiskId;

    public Optional<String> getVirtualDiskId() {
        return this.virtualDiskId == null ? Optional.empty() : Optional.ofNullable(this.virtualDiskId);
    }

    /**
     * Disk's display name
     * 
     */
    @InputImport(name="virtualDiskName", required=true)
        private final String virtualDiskName;

    public String getVirtualDiskName() {
        return this.virtualDiskName;
    }

    public VirtualDiskResponse(
        String controllerId,
        String independenceMode,
        Integer totalSize,
        @Nullable String virtualDiskId,
        String virtualDiskName) {
        this.controllerId = Objects.requireNonNull(controllerId, "expected parameter 'controllerId' to be non-null");
        this.independenceMode = Objects.requireNonNull(independenceMode, "expected parameter 'independenceMode' to be non-null");
        this.totalSize = Objects.requireNonNull(totalSize, "expected parameter 'totalSize' to be non-null");
        this.virtualDiskId = virtualDiskId;
        this.virtualDiskName = Objects.requireNonNull(virtualDiskName, "expected parameter 'virtualDiskName' to be non-null");
    }

    private VirtualDiskResponse() {
        this.controllerId = null;
        this.independenceMode = null;
        this.totalSize = null;
        this.virtualDiskId = null;
        this.virtualDiskName = null;
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
