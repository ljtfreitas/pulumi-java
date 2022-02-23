// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatastoreTimestampPartitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatastoreTimestampPartitionArgs Empty = new DatastoreTimestampPartitionArgs();

    @InputImport(name="attributeName", required=true)
        private final Input<String> attributeName;

    public Input<String> getAttributeName() {
        return this.attributeName;
    }

    @InputImport(name="timestampFormat")
        private final @Nullable Input<String> timestampFormat;

    public Input<String> getTimestampFormat() {
        return this.timestampFormat == null ? Input.empty() : this.timestampFormat;
    }

    public DatastoreTimestampPartitionArgs(
        Input<String> attributeName,
        @Nullable Input<String> timestampFormat) {
        this.attributeName = Objects.requireNonNull(attributeName, "expected parameter 'attributeName' to be non-null");
        this.timestampFormat = timestampFormat;
    }

    private DatastoreTimestampPartitionArgs() {
        this.attributeName = Input.empty();
        this.timestampFormat = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreTimestampPartitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attributeName;
        private @Nullable Input<String> timestampFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreTimestampPartitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.timestampFormat = defaults.timestampFormat;
        }

        public Builder setAttributeName(Input<String> attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder setAttributeName(String attributeName) {
            this.attributeName = Input.of(Objects.requireNonNull(attributeName));
            return this;
        }

        public Builder setTimestampFormat(@Nullable Input<String> timestampFormat) {
            this.timestampFormat = timestampFormat;
            return this;
        }

        public Builder setTimestampFormat(@Nullable String timestampFormat) {
            this.timestampFormat = Input.ofNullable(timestampFormat);
            return this;
        }
        public DatastoreTimestampPartitionArgs build() {
            return new DatastoreTimestampPartitionArgs(attributeName, timestampFormat);
        }
    }
}
