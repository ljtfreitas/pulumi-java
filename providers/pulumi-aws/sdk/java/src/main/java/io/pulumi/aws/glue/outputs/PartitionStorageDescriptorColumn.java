// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PartitionStorageDescriptorColumn {
    /**
     * Free-form text comment.
     * 
     */
    private final @Nullable String comment;
    /**
     * Name of the SerDe.
     * 
     */
    private final String name;
    /**
     * The datatype of data in the Column.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"comment","name","type"})
    private PartitionStorageDescriptorColumn(
        @Nullable String comment,
        String name,
        @Nullable String type) {
        this.comment = comment;
        this.name = Objects.requireNonNull(name);
        this.type = type;
    }

    /**
     * Free-form text comment.
     * 
     */
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * Name of the SerDe.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The datatype of data in the Column.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionStorageDescriptorColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionStorageDescriptorColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public PartitionStorageDescriptorColumn build() {
            return new PartitionStorageDescriptorColumn(comment, name, type);
        }
    }
}
