// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsNodePoolConfigRootVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigRootVolumeArgs Empty = new AwsNodePoolConfigRootVolumeArgs();

    /**
     * Optional. The number of I/O operations per second (IOPS) to provision for GP3 volume.
     * 
     */
    @InputImport(name="iops")
        private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    @InputImport(name="kmsKeyArn")
        private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    /**
     * Optional. The size of the volume, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    @InputImport(name="sizeGib")
        private final @Nullable Input<Integer> sizeGib;

    public Input<Integer> getSizeGib() {
        return this.sizeGib == null ? Input.empty() : this.sizeGib;
    }

    /**
     * Optional. Type of the EBS volume. When unspecified, it defaults to GP2 volume. Possible values: VOLUME_TYPE_UNSPECIFIED, GP2, GP3
     * 
     */
    @InputImport(name="volumeType")
        private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public AwsNodePoolConfigRootVolumeArgs(
        @Nullable Input<Integer> iops,
        @Nullable Input<String> kmsKeyArn,
        @Nullable Input<Integer> sizeGib,
        @Nullable Input<String> volumeType) {
        this.iops = iops;
        this.kmsKeyArn = kmsKeyArn;
        this.sizeGib = sizeGib;
        this.volumeType = volumeType;
    }

    private AwsNodePoolConfigRootVolumeArgs() {
        this.iops = Input.empty();
        this.kmsKeyArn = Input.empty();
        this.sizeGib = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigRootVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> iops;
        private @Nullable Input<String> kmsKeyArn;
        private @Nullable Input<Integer> sizeGib;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigRootVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.sizeGib = defaults.sizeGib;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setIops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
            return this;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder setSizeGib(@Nullable Input<Integer> sizeGib) {
            this.sizeGib = sizeGib;
            return this;
        }

        public Builder setSizeGib(@Nullable Integer sizeGib) {
            this.sizeGib = Input.ofNullable(sizeGib);
            return this;
        }

        public Builder setVolumeType(@Nullable Input<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public AwsNodePoolConfigRootVolumeArgs build() {
            return new AwsNodePoolConfigRootVolumeArgs(iops, kmsKeyArn, sizeGib, volumeType);
        }
    }
}
