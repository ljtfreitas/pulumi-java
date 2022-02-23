// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ReportGroupExportConfigS3DestinationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportGroupExportConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportGroupExportConfigGetArgs Empty = new ReportGroupExportConfigGetArgs();

    /**
     * contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
     * 
     */
    @InputImport(name="s3Destination")
    private final @Nullable Input<ReportGroupExportConfigS3DestinationGetArgs> s3Destination;

    public Input<ReportGroupExportConfigS3DestinationGetArgs> getS3Destination() {
        return this.s3Destination == null ? Input.empty() : this.s3Destination;
    }

    /**
     * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ReportGroupExportConfigGetArgs(
        @Nullable Input<ReportGroupExportConfigS3DestinationGetArgs> s3Destination,
        Input<String> type) {
        this.s3Destination = s3Destination;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ReportGroupExportConfigGetArgs() {
        this.s3Destination = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupExportConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ReportGroupExportConfigS3DestinationGetArgs> s3Destination;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupExportConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Destination = defaults.s3Destination;
    	      this.type = defaults.type;
        }

        public Builder setS3Destination(@Nullable Input<ReportGroupExportConfigS3DestinationGetArgs> s3Destination) {
            this.s3Destination = s3Destination;
            return this;
        }

        public Builder setS3Destination(@Nullable ReportGroupExportConfigS3DestinationGetArgs s3Destination) {
            this.s3Destination = Input.ofNullable(s3Destination);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ReportGroupExportConfigGetArgs build() {
            return new ReportGroupExportConfigGetArgs(s3Destination, type);
        }
    }
}
