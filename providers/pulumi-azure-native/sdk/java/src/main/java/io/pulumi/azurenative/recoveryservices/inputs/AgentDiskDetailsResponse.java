// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Agent disk details.
 * 
 */
public final class AgentDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AgentDiskDetailsResponse Empty = new AgentDiskDetailsResponse();

    /**
     * The disk capacity in bytes.
     * 
     */
    @InputImport(name="capacityInBytes", required=true)
    private final Double capacityInBytes;

    public Double getCapacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * The disk Id.
     * 
     */
    @InputImport(name="diskId", required=true)
    private final String diskId;

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="diskName", required=true)
    private final String diskName;

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    @InputImport(name="isOSDisk", required=true)
    private final String isOSDisk;

    public String getIsOSDisk() {
        return this.isOSDisk;
    }

    /**
     * The lun of disk.
     * 
     */
    @InputImport(name="lunId", required=true)
    private final Integer lunId;

    public Integer getLunId() {
        return this.lunId;
    }

    public AgentDiskDetailsResponse(
        Double capacityInBytes,
        String diskId,
        String diskName,
        String isOSDisk,
        Integer lunId) {
        this.capacityInBytes = Objects.requireNonNull(capacityInBytes, "expected parameter 'capacityInBytes' to be non-null");
        this.diskId = Objects.requireNonNull(diskId, "expected parameter 'diskId' to be non-null");
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.isOSDisk = Objects.requireNonNull(isOSDisk, "expected parameter 'isOSDisk' to be non-null");
        this.lunId = Objects.requireNonNull(lunId, "expected parameter 'lunId' to be non-null");
    }

    private AgentDiskDetailsResponse() {
        this.capacityInBytes = null;
        this.diskId = null;
        this.diskName = null;
        this.isOSDisk = null;
        this.lunId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double capacityInBytes;
        private String diskId;
        private String diskName;
        private String isOSDisk;
        private Integer lunId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityInBytes = defaults.capacityInBytes;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.isOSDisk = defaults.isOSDisk;
    	      this.lunId = defaults.lunId;
        }

        public Builder setCapacityInBytes(Double capacityInBytes) {
            this.capacityInBytes = Objects.requireNonNull(capacityInBytes);
            return this;
        }

        public Builder setDiskId(String diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setIsOSDisk(String isOSDisk) {
            this.isOSDisk = Objects.requireNonNull(isOSDisk);
            return this;
        }

        public Builder setLunId(Integer lunId) {
            this.lunId = Objects.requireNonNull(lunId);
            return this;
        }

        public AgentDiskDetailsResponse build() {
            return new AgentDiskDetailsResponse(capacityInBytes, diskId, diskName, isOSDisk, lunId);
        }
    }
}
