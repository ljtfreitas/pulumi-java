// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A Google Compute Engine disk resource specification.
 * 
 */
public final class DiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskResponse Empty = new DiskResponse();

    /**
     * Required at create time and cannot be overridden at run time. Specifies the path in the docker container where files on this disk should be located. For example, if `mountPoint` is `/mnt/disk`, and the parameter has `localPath` `inputs/file.txt`, the docker container can access the data at `/mnt/disk/inputs/file.txt`.
     * 
     */
    @InputImport(name="mountPoint", required=true)
      private final String mountPoint;

    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * The name of the disk that can be used in the pipeline parameters. Must be 1 - 63 characters. The name "boot" is reserved for system use.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies how a sourced-base persistent disk will be mounted. See https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances for more details. Can only be set at create time.
     * 
     */
    @InputImport(name="readOnly", required=true)
      private final Boolean readOnly;

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * The size of the disk. Defaults to 500 (GB). This field is not applicable for local SSD.
     * 
     */
    @InputImport(name="sizeGb", required=true)
      private final Integer sizeGb;

    public Integer getSizeGb() {
        return this.sizeGb;
    }

    /**
     * The full or partial URL of the persistent disk to attach. See https://cloud.google.com/compute/docs/reference/latest/instances#resource and https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots for more details.
     * 
     */
    @InputImport(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    /**
     * The type of the disk to create.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public DiskResponse(
        String mountPoint,
        String name,
        Boolean readOnly,
        Integer sizeGb,
        String source,
        String type) {
        this.mountPoint = Objects.requireNonNull(mountPoint, "expected parameter 'mountPoint' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = Objects.requireNonNull(readOnly, "expected parameter 'readOnly' to be non-null");
        this.sizeGb = Objects.requireNonNull(sizeGb, "expected parameter 'sizeGb' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DiskResponse() {
        this.mountPoint = null;
        this.name = null;
        this.readOnly = null;
        this.sizeGb = null;
        this.source = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPoint;
        private String name;
        private Boolean readOnly;
        private Integer sizeGb;
        private String source;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPoint = defaults.mountPoint;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.sizeGb = defaults.sizeGb;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setMountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReadOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }

        public Builder setSizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DiskResponse build() {
            return new DiskResponse(mountPoint, name, readOnly, sizeGb, source, type);
        }
    }
}
