// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * The AZ where the EBS volume will exist.
     * 
     */
    @InputImport(name="availabilityZone", required=true)
    private final Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * If true, the disk will be encrypted.
     * 
     */
    @InputImport(name="encrypted")
    private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    /**
     * The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
     * 
     */
    @InputImport(name="iops")
    private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported exclusively on `io1` volumes.
     * 
     */
    @InputImport(name="multiAttachEnabled")
    private final @Nullable Input<Boolean> multiAttachEnabled;

    public Input<Boolean> getMultiAttachEnabled() {
        return this.multiAttachEnabled == null ? Input.empty() : this.multiAttachEnabled;
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    @InputImport(name="outpostArn")
    private final @Nullable Input<String> outpostArn;

    public Input<String> getOutpostArn() {
        return this.outpostArn == null ? Input.empty() : this.outpostArn;
    }

    /**
     * The size of the drive in GiBs.
     * 
     */
    @InputImport(name="size")
    private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * A snapshot to base the EBS volume off of.
     * 
     */
    @InputImport(name="snapshotId")
    private final @Nullable Input<String> snapshotId;

    public Input<String> getSnapshotId() {
        return this.snapshotId == null ? Input.empty() : this.snapshotId;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
     * 
     */
    @InputImport(name="throughput")
    private final @Nullable Input<Integer> throughput;

    public Input<Integer> getThroughput() {
        return this.throughput == null ? Input.empty() : this.throughput;
    }

    /**
     * The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public VolumeArgs(
        Input<String> availabilityZone,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<Integer> iops,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<Boolean> multiAttachEnabled,
        @Nullable Input<String> outpostArn,
        @Nullable Input<Integer> size,
        @Nullable Input<String> snapshotId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> throughput,
        @Nullable Input<String> type) {
        this.availabilityZone = Objects.requireNonNull(availabilityZone, "expected parameter 'availabilityZone' to be non-null");
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.multiAttachEnabled = multiAttachEnabled;
        this.outpostArn = outpostArn;
        this.size = size;
        this.snapshotId = snapshotId;
        this.tags = tags;
        this.throughput = throughput;
        this.type = type;
    }

    private VolumeArgs() {
        this.availabilityZone = Input.empty();
        this.encrypted = Input.empty();
        this.iops = Input.empty();
        this.kmsKeyId = Input.empty();
        this.multiAttachEnabled = Input.empty();
        this.outpostArn = Input.empty();
        this.size = Input.empty();
        this.snapshotId = Input.empty();
        this.tags = Input.empty();
        this.throughput = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> availabilityZone;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<Integer> iops;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<Boolean> multiAttachEnabled;
        private @Nullable Input<String> outpostArn;
        private @Nullable Input<Integer> size;
        private @Nullable Input<String> snapshotId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> throughput;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.multiAttachEnabled = defaults.multiAttachEnabled;
    	      this.outpostArn = defaults.outpostArn;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.type = defaults.type;
        }

        public Builder setAvailabilityZone(Input<String> availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Input.of(Objects.requireNonNull(availabilityZone));
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

        public Builder setIops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
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

        public Builder setMultiAttachEnabled(@Nullable Input<Boolean> multiAttachEnabled) {
            this.multiAttachEnabled = multiAttachEnabled;
            return this;
        }

        public Builder setMultiAttachEnabled(@Nullable Boolean multiAttachEnabled) {
            this.multiAttachEnabled = Input.ofNullable(multiAttachEnabled);
            return this;
        }

        public Builder setOutpostArn(@Nullable Input<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }

        public Builder setOutpostArn(@Nullable String outpostArn) {
            this.outpostArn = Input.ofNullable(outpostArn);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setSnapshotId(@Nullable Input<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setSnapshotId(@Nullable String snapshotId) {
            this.snapshotId = Input.ofNullable(snapshotId);
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

        public Builder setThroughput(@Nullable Input<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = Input.ofNullable(throughput);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public VolumeArgs build() {
            return new VolumeArgs(availabilityZone, encrypted, iops, kmsKeyId, multiAttachEnabled, outpostArn, size, snapshotId, tags, throughput, type);
        }
    }
}
