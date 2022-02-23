// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetMetadata {
    /**
     * Arn of the source of the dataset. For e.g.: AppFlow Flow ARN.
     * 
     */
    private final @Nullable String sourceArn;

    @OutputCustomType.Constructor({"sourceArn"})
    private DatasetMetadata(@Nullable String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * Arn of the source of the dataset. For e.g.: AppFlow Flow ARN.
     * 
     */
    public Optional<String> getSourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder setSourceArn(@Nullable String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public DatasetMetadata build() {
            return new DatasetMetadata(sourceArn);
        }
    }
}
