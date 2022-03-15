// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceTemplateDiskDiskEncryptionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateDiskDiskEncryptionKeyArgs Empty = new InstanceTemplateDiskDiskEncryptionKeyArgs();

    /**
     * The self link of the encryption key that is stored in Google Cloud KMS
     * 
     */
    @Import(name="kmsKeySelfLink", required=true)
      private final Output<String> kmsKeySelfLink;

    public Output<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }

    public InstanceTemplateDiskDiskEncryptionKeyArgs(Output<String> kmsKeySelfLink) {
        this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink, "expected parameter 'kmsKeySelfLink' to be non-null");
    }

    private InstanceTemplateDiskDiskEncryptionKeyArgs() {
        this.kmsKeySelfLink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateDiskDiskEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeySelfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateDiskDiskEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
        }

        public Builder kmsKeySelfLink(Output<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink);
            return this;
        }

        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            this.kmsKeySelfLink = Output.of(Objects.requireNonNull(kmsKeySelfLink));
            return this;
        }
        public InstanceTemplateDiskDiskEncryptionKeyArgs build() {
            return new InstanceTemplateDiskDiskEncryptionKeyArgs(kmsKeySelfLink);
        }
    }
}
