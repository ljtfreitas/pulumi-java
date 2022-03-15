// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataRepositoryAssociationS3AutoImportPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataRepositoryAssociationS3AutoImportPolicyArgs Empty = new DataRepositoryAssociationS3AutoImportPolicyArgs();

    /**
     * A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
     * 
     */
    @Import(name="events")
      private final @Nullable Output<List<String>> events;

    public Output<List<String>> getEvents() {
        return this.events == null ? Output.empty() : this.events;
    }

    public DataRepositoryAssociationS3AutoImportPolicyArgs(@Nullable Output<List<String>> events) {
        this.events = events;
    }

    private DataRepositoryAssociationS3AutoImportPolicyArgs() {
        this.events = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataRepositoryAssociationS3AutoImportPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DataRepositoryAssociationS3AutoImportPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
        }

        public Builder events(@Nullable Output<List<String>> events) {
            this.events = events;
            return this;
        }

        public Builder events(@Nullable List<String> events) {
            this.events = Output.ofNullable(events);
            return this;
        }
        public DataRepositoryAssociationS3AutoImportPolicyArgs build() {
            return new DataRepositoryAssociationS3AutoImportPolicyArgs(events);
        }
    }
}
