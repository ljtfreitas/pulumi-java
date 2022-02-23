// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.AmiCopyEbsBlockDeviceArgs;
import io.pulumi.aws.ec2.inputs.AmiCopyEphemeralBlockDeviceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiCopyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiCopyArgs Empty = new AmiCopyArgs();

    /**
     * A longer, human-readable description for the AMI.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ARN of the Outpost to which to copy the AMI.
     * Only specify this parameter when copying an AMI from an AWS Region to an Outpost. The AMI must be in the Region of the destination Outpost.
     * 
     */
    @InputImport(name="destinationOutpostArn")
    private final @Nullable Input<String> destinationOutpostArn;

    public Input<String> getDestinationOutpostArn() {
        return this.destinationOutpostArn == null ? Input.empty() : this.destinationOutpostArn;
    }

    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @InputImport(name="ebsBlockDevices")
    private final @Nullable Input<List<AmiCopyEbsBlockDeviceArgs>> ebsBlockDevices;

    public Input<List<AmiCopyEbsBlockDeviceArgs>> getEbsBlockDevices() {
        return this.ebsBlockDevices == null ? Input.empty() : this.ebsBlockDevices;
    }

    /**
     * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshot_id`.
     * 
     */
    @InputImport(name="encrypted")
    private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @InputImport(name="ephemeralBlockDevices")
    private final @Nullable Input<List<AmiCopyEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    public Input<List<AmiCopyEphemeralBlockDeviceArgs>> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Input.empty() : this.ephemeralBlockDevices;
    }

    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
     * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
     * if this parameter is not specified, the default CMK for EBS is used
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The id of the AMI to copy. This id must be valid in the region
     * given by `source_ami_region`.
     * 
     */
    @InputImport(name="sourceAmiId", required=true)
    private final Input<String> sourceAmiId;

    public Input<String> getSourceAmiId() {
        return this.sourceAmiId;
    }

    /**
     * The region from which the AMI will be copied. This may be the
     * same as the AWS provider region in order to create a copy within the same region.
     * 
     */
    @InputImport(name="sourceAmiRegion", required=true)
    private final Input<String> sourceAmiRegion;

    public Input<String> getSourceAmiRegion() {
        return this.sourceAmiRegion;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AmiCopyArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> destinationOutpostArn,
        @Nullable Input<List<AmiCopyEbsBlockDeviceArgs>> ebsBlockDevices,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<List<AmiCopyEphemeralBlockDeviceArgs>> ephemeralBlockDevices,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> name,
        Input<String> sourceAmiId,
        Input<String> sourceAmiRegion,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.destinationOutpostArn = destinationOutpostArn;
        this.ebsBlockDevices = ebsBlockDevices;
        this.encrypted = encrypted;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.sourceAmiId = Objects.requireNonNull(sourceAmiId, "expected parameter 'sourceAmiId' to be non-null");
        this.sourceAmiRegion = Objects.requireNonNull(sourceAmiRegion, "expected parameter 'sourceAmiRegion' to be non-null");
        this.tags = tags;
    }

    private AmiCopyArgs() {
        this.description = Input.empty();
        this.destinationOutpostArn = Input.empty();
        this.ebsBlockDevices = Input.empty();
        this.encrypted = Input.empty();
        this.ephemeralBlockDevices = Input.empty();
        this.kmsKeyId = Input.empty();
        this.name = Input.empty();
        this.sourceAmiId = Input.empty();
        this.sourceAmiRegion = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> destinationOutpostArn;
        private @Nullable Input<List<AmiCopyEbsBlockDeviceArgs>> ebsBlockDevices;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<List<AmiCopyEphemeralBlockDeviceArgs>> ephemeralBlockDevices;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> name;
        private Input<String> sourceAmiId;
        private Input<String> sourceAmiRegion;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiCopyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationOutpostArn = defaults.destinationOutpostArn;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.encrypted = defaults.encrypted;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.sourceAmiId = defaults.sourceAmiId;
    	      this.sourceAmiRegion = defaults.sourceAmiRegion;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestinationOutpostArn(@Nullable Input<String> destinationOutpostArn) {
            this.destinationOutpostArn = destinationOutpostArn;
            return this;
        }

        public Builder setDestinationOutpostArn(@Nullable String destinationOutpostArn) {
            this.destinationOutpostArn = Input.ofNullable(destinationOutpostArn);
            return this;
        }

        public Builder setEbsBlockDevices(@Nullable Input<List<AmiCopyEbsBlockDeviceArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        public Builder setEbsBlockDevices(@Nullable List<AmiCopyEbsBlockDeviceArgs> ebsBlockDevices) {
            this.ebsBlockDevices = Input.ofNullable(ebsBlockDevices);
            return this;
        }

        public Builder setEncrypted(@Nullable Input<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = Input.ofNullable(encrypted);
            return this;
        }

        public Builder setEphemeralBlockDevices(@Nullable Input<List<AmiCopyEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        public Builder setEphemeralBlockDevices(@Nullable List<AmiCopyEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Input.ofNullable(ephemeralBlockDevices);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSourceAmiId(Input<String> sourceAmiId) {
            this.sourceAmiId = Objects.requireNonNull(sourceAmiId);
            return this;
        }

        public Builder setSourceAmiId(String sourceAmiId) {
            this.sourceAmiId = Input.of(Objects.requireNonNull(sourceAmiId));
            return this;
        }

        public Builder setSourceAmiRegion(Input<String> sourceAmiRegion) {
            this.sourceAmiRegion = Objects.requireNonNull(sourceAmiRegion);
            return this;
        }

        public Builder setSourceAmiRegion(String sourceAmiRegion) {
            this.sourceAmiRegion = Input.of(Objects.requireNonNull(sourceAmiRegion));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AmiCopyArgs build() {
            return new AmiCopyArgs(description, destinationOutpostArn, ebsBlockDevices, encrypted, ephemeralBlockDevices, kmsKeyId, name, sourceAmiId, sourceAmiRegion, tags);
        }
    }
}
