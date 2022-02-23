// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotImportClientDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotImportClientDataArgs Empty = new SnapshotImportClientDataArgs();

    /**
     * A user-defined comment about the disk upload.
     * 
     */
    @InputImport(name="comment")
    private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * The time that the disk upload ends.
     * 
     */
    @InputImport(name="uploadEnd")
    private final @Nullable Input<String> uploadEnd;

    public Input<String> getUploadEnd() {
        return this.uploadEnd == null ? Input.empty() : this.uploadEnd;
    }

    /**
     * The size of the uploaded disk image, in GiB.
     * 
     */
    @InputImport(name="uploadSize")
    private final @Nullable Input<Double> uploadSize;

    public Input<Double> getUploadSize() {
        return this.uploadSize == null ? Input.empty() : this.uploadSize;
    }

    /**
     * The time that the disk upload starts.
     * 
     */
    @InputImport(name="uploadStart")
    private final @Nullable Input<String> uploadStart;

    public Input<String> getUploadStart() {
        return this.uploadStart == null ? Input.empty() : this.uploadStart;
    }

    public SnapshotImportClientDataArgs(
        @Nullable Input<String> comment,
        @Nullable Input<String> uploadEnd,
        @Nullable Input<Double> uploadSize,
        @Nullable Input<String> uploadStart) {
        this.comment = comment;
        this.uploadEnd = uploadEnd;
        this.uploadSize = uploadSize;
        this.uploadStart = uploadStart;
    }

    private SnapshotImportClientDataArgs() {
        this.comment = Input.empty();
        this.uploadEnd = Input.empty();
        this.uploadSize = Input.empty();
        this.uploadStart = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotImportClientDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> comment;
        private @Nullable Input<String> uploadEnd;
        private @Nullable Input<Double> uploadSize;
        private @Nullable Input<String> uploadStart;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotImportClientDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.uploadEnd = defaults.uploadEnd;
    	      this.uploadSize = defaults.uploadSize;
    	      this.uploadStart = defaults.uploadStart;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setUploadEnd(@Nullable Input<String> uploadEnd) {
            this.uploadEnd = uploadEnd;
            return this;
        }

        public Builder setUploadEnd(@Nullable String uploadEnd) {
            this.uploadEnd = Input.ofNullable(uploadEnd);
            return this;
        }

        public Builder setUploadSize(@Nullable Input<Double> uploadSize) {
            this.uploadSize = uploadSize;
            return this;
        }

        public Builder setUploadSize(@Nullable Double uploadSize) {
            this.uploadSize = Input.ofNullable(uploadSize);
            return this;
        }

        public Builder setUploadStart(@Nullable Input<String> uploadStart) {
            this.uploadStart = uploadStart;
            return this;
        }

        public Builder setUploadStart(@Nullable String uploadStart) {
            this.uploadStart = Input.ofNullable(uploadStart);
            return this;
        }
        public SnapshotImportClientDataArgs build() {
            return new SnapshotImportClientDataArgs(comment, uploadEnd, uploadSize, uploadStart);
        }
    }
}
