// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotCopyGrantArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotCopyGrantArgs Empty = new SnapshotCopyGrantArgs();

    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * A friendly name for identifying the grant.
     * 
     */
    @InputImport(name="snapshotCopyGrantName", required=true)
    private final Input<String> snapshotCopyGrantName;

    public Input<String> getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName;
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

    public SnapshotCopyGrantArgs(
        @Nullable Input<String> kmsKeyId,
        Input<String> snapshotCopyGrantName,
        @Nullable Input<Map<String,String>> tags) {
        this.kmsKeyId = kmsKeyId;
        this.snapshotCopyGrantName = Objects.requireNonNull(snapshotCopyGrantName, "expected parameter 'snapshotCopyGrantName' to be non-null");
        this.tags = tags;
    }

    private SnapshotCopyGrantArgs() {
        this.kmsKeyId = Input.empty();
        this.snapshotCopyGrantName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotCopyGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private Input<String> snapshotCopyGrantName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotCopyGrantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotCopyGrantName = defaults.snapshotCopyGrantName;
    	      this.tags = defaults.tags;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setSnapshotCopyGrantName(Input<String> snapshotCopyGrantName) {
            this.snapshotCopyGrantName = Objects.requireNonNull(snapshotCopyGrantName);
            return this;
        }

        public Builder setSnapshotCopyGrantName(String snapshotCopyGrantName) {
            this.snapshotCopyGrantName = Input.of(Objects.requireNonNull(snapshotCopyGrantName));
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
        public SnapshotCopyGrantArgs build() {
            return new SnapshotCopyGrantArgs(kmsKeyId, snapshotCopyGrantName, tags);
        }
    }
}
