// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobLoadTimePartitioningGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobLoadTimePartitioningGetArgs Empty = new JobLoadTimePartitioningGetArgs();

    /**
     * Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
     */
    @Import(name="expirationMs")
      private final @Nullable Output<String> expirationMs;

    public Output<String> expirationMs() {
        return this.expirationMs == null ? Codegen.empty() : this.expirationMs;
    }

    /**
     * If not set, the table is partitioned by pseudo column '_PARTITIONTIME'; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
     */
    @Import(name="field")
      private final @Nullable Output<String> field;

    public Output<String> field() {
        return this.field == null ? Codegen.empty() : this.field;
    }

    /**
     * The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public JobLoadTimePartitioningGetArgs(
        @Nullable Output<String> expirationMs,
        @Nullable Output<String> field,
        Output<String> type) {
        this.expirationMs = expirationMs;
        this.field = field;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JobLoadTimePartitioningGetArgs() {
        this.expirationMs = Codegen.empty();
        this.field = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobLoadTimePartitioningGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expirationMs;
        private @Nullable Output<String> field;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobLoadTimePartitioningGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        public Builder expirationMs(@Nullable Output<String> expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }
        public Builder expirationMs(@Nullable String expirationMs) {
            this.expirationMs = Codegen.ofNullable(expirationMs);
            return this;
        }
        public Builder field(@Nullable Output<String> field) {
            this.field = field;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = Codegen.ofNullable(field);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public JobLoadTimePartitioningGetArgs build() {
            return new JobLoadTimePartitioningGetArgs(expirationMs, field, type);
        }
    }
}
