// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.InstantSnapshotResourceStatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRegionInstantSnapshotResult {
    /**
     * The architecture of the instant snapshot. Valid values are ARM64 or X86_64.
     * 
     */
    private final String architecture;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Size of the source disk, specified in GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * Whether to attempt an application consistent instant snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    private final Boolean guestFlush;
    /**
     * Type of the resource. Always compute#instantSnapshot for InstantSnapshot resources.
     * 
     */
    private final String kind;
    /**
     * A fingerprint for the labels being applied to this InstantSnapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a InstantSnapshot.
     * 
     */
    private final String labelFingerprint;
    /**
     * Labels to apply to this InstantSnapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * URL of the region where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Status information for the instant snapshot resource.
     * 
     */
    private final InstantSnapshotResourceStatusResponse resourceStatus;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource's resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * URL of the source disk used to create this instant snapshot. Note that the source disk must be in the same zone/region as the instant snapshot to be created. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    private final String sourceDisk;
    /**
     * The ID value of the disk used to create this InstantSnapshot. This value may be used to determine whether the InstantSnapshot was taken from the current or a previous instance of a given disk name.
     * 
     */
    private final String sourceDiskId;
    /**
     * The status of the instantSnapshot. This can be CREATING, DELETING, FAILED, or READY.
     * 
     */
    private final String status;
    /**
     * URL of the zone where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"architecture","creationTimestamp","description","diskSizeGb","guestFlush","kind","labelFingerprint","labels","name","region","resourceStatus","satisfiesPzs","selfLink","selfLinkWithId","sourceDisk","sourceDiskId","status","zone"})
    private GetRegionInstantSnapshotResult(
        String architecture,
        String creationTimestamp,
        String description,
        String diskSizeGb,
        Boolean guestFlush,
        String kind,
        String labelFingerprint,
        Map<String,String> labels,
        String name,
        String region,
        InstantSnapshotResourceStatusResponse resourceStatus,
        Boolean satisfiesPzs,
        String selfLink,
        String selfLinkWithId,
        String sourceDisk,
        String sourceDiskId,
        String status,
        String zone) {
        this.architecture = Objects.requireNonNull(architecture);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.guestFlush = Objects.requireNonNull(guestFlush);
        this.kind = Objects.requireNonNull(kind);
        this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
        this.resourceStatus = Objects.requireNonNull(resourceStatus);
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.sourceDisk = Objects.requireNonNull(sourceDisk);
        this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
        this.status = Objects.requireNonNull(status);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * The architecture of the instant snapshot. Valid values are ARM64 or X86_64.
     * 
     */
    public String getArchitecture() {
        return this.architecture;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Size of the source disk, specified in GB.
     * 
     */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Whether to attempt an application consistent instant snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    public Boolean getGuestFlush() {
        return this.guestFlush;
    }
    /**
     * Type of the resource. Always compute#instantSnapshot for InstantSnapshot resources.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this InstantSnapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a InstantSnapshot.
     * 
     */
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this InstantSnapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * URL of the region where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Status information for the instant snapshot resource.
     * 
     */
    public InstantSnapshotResourceStatusResponse getResourceStatus() {
        return this.resourceStatus;
    }
    /**
     * Reserved for future use.
     * 
     */
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource's resource id.
     * 
     */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * URL of the source disk used to create this instant snapshot. Note that the source disk must be in the same zone/region as the instant snapshot to be created. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    public String getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The ID value of the disk used to create this InstantSnapshot. This value may be used to determine whether the InstantSnapshot was taken from the current or a previous instance of a given disk name.
     * 
     */
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * The status of the instantSnapshot. This can be CREATING, DELETING, FAILED, or READY.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * URL of the zone where the instant snapshot resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstantSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String creationTimestamp;
        private String description;
        private String diskSizeGb;
        private Boolean guestFlush;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String region;
        private InstantSnapshotResourceStatusResponse resourceStatus;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String selfLinkWithId;
        private String sourceDisk;
        private String sourceDiskId;
        private String status;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstantSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.guestFlush = defaults.guestFlush;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.resourceStatus = defaults.resourceStatus;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder setArchitecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setGuestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setResourceStatus(InstantSnapshotResourceStatusResponse resourceStatus) {
            this.resourceStatus = Objects.requireNonNull(resourceStatus);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }

        public Builder setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetRegionInstantSnapshotResult build() {
            return new GetRegionInstantSnapshotResult(architecture, creationTimestamp, description, diskSizeGb, guestFlush, kind, labelFingerprint, labels, name, region, resourceStatus, satisfiesPzs, selfLink, selfLinkWithId, sourceDisk, sourceDiskId, status, zone);
        }
    }
}
