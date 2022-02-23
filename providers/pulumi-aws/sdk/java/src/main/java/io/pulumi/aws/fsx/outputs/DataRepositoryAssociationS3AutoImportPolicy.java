// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataRepositoryAssociationS3AutoImportPolicy {
    /**
     * A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
     * 
     */
    private final @Nullable List<String> events;

    @OutputCustomType.Constructor({"events"})
    private DataRepositoryAssociationS3AutoImportPolicy(@Nullable List<String> events) {
        this.events = events;
    }

    /**
     * A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
     * 
     */
    public List<String> getEvents() {
        return this.events == null ? List.of() : this.events;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataRepositoryAssociationS3AutoImportPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DataRepositoryAssociationS3AutoImportPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
        }

        public Builder setEvents(@Nullable List<String> events) {
            this.events = events;
            return this;
        }
        public DataRepositoryAssociationS3AutoImportPolicy build() {
            return new DataRepositoryAssociationS3AutoImportPolicy(events);
        }
    }
}
