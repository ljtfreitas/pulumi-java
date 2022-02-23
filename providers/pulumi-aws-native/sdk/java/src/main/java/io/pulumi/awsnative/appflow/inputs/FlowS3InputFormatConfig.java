// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowS3InputFormatConfigS3InputFileType;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowS3InputFormatConfig extends io.pulumi.resources.InvokeArgs {

    public static final FlowS3InputFormatConfig Empty = new FlowS3InputFormatConfig();

    @InputImport(name="s3InputFileType")
        private final @Nullable FlowS3InputFormatConfigS3InputFileType s3InputFileType;

    public Optional<FlowS3InputFormatConfigS3InputFileType> getS3InputFileType() {
        return this.s3InputFileType == null ? Optional.empty() : Optional.ofNullable(this.s3InputFileType);
    }

    public FlowS3InputFormatConfig(@Nullable FlowS3InputFormatConfigS3InputFileType s3InputFileType) {
        this.s3InputFileType = s3InputFileType;
    }

    private FlowS3InputFormatConfig() {
        this.s3InputFileType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3InputFormatConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowS3InputFormatConfigS3InputFileType s3InputFileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3InputFormatConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3InputFileType = defaults.s3InputFileType;
        }

        public Builder setS3InputFileType(@Nullable FlowS3InputFormatConfigS3InputFileType s3InputFileType) {
            this.s3InputFileType = s3InputFileType;
            return this;
        }
        public FlowS3InputFormatConfig build() {
            return new FlowS3InputFormatConfig(s3InputFileType);
        }
    }
}
