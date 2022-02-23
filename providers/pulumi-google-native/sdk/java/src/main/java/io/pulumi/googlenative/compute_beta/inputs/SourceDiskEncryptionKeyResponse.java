// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.CustomerEncryptionKeyResponse;
import java.lang.String;
import java.util.Objects;


public final class SourceDiskEncryptionKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceDiskEncryptionKeyResponse Empty = new SourceDiskEncryptionKeyResponse();

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="diskEncryptionKey", required=true)
      private final CustomerEncryptionKeyResponse diskEncryptionKey;

    public CustomerEncryptionKeyResponse getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
     * 
     */
    @InputImport(name="sourceDisk", required=true)
      private final String sourceDisk;

    public String getSourceDisk() {
        return this.sourceDisk;
    }

    public SourceDiskEncryptionKeyResponse(
        CustomerEncryptionKeyResponse diskEncryptionKey,
        String sourceDisk) {
        this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey, "expected parameter 'diskEncryptionKey' to be non-null");
        this.sourceDisk = Objects.requireNonNull(sourceDisk, "expected parameter 'sourceDisk' to be non-null");
    }

    private SourceDiskEncryptionKeyResponse() {
        this.diskEncryptionKey = null;
        this.sourceDisk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceDiskEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String sourceDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceDiskEncryptionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.sourceDisk = defaults.sourceDisk;
        }

        public Builder setDiskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public SourceDiskEncryptionKeyResponse build() {
            return new SourceDiskEncryptionKeyResponse(diskEncryptionKey, sourceDisk);
        }
    }
}
