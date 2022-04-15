// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecObjectConditionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecObjectConditionsArgs Empty = new TransferJobTransferSpecObjectConditionsArgs();

    /**
     * `exclude_prefixes` must follow the requirements described for `include_prefixes`. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
     */
    @Import(name="excludePrefixes")
      private final @Nullable Output<List<String>> excludePrefixes;

    public Output<List<String>> excludePrefixes() {
        return this.excludePrefixes == null ? Codegen.empty() : this.excludePrefixes;
    }

    /**
     * If `include_prefixes` is specified, objects that satisfy the object conditions must have names that start with one of the `include_prefixes` and that do not start with any of the `exclude_prefixes`. If `include_prefixes` is not specified, all objects except those that have names starting with one of the `exclude_prefixes` must satisfy the object conditions. See [Requirements](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/TransferSpec#ObjectConditions).
     * 
     */
    @Import(name="includePrefixes")
      private final @Nullable Output<List<String>> includePrefixes;

    public Output<List<String>> includePrefixes() {
        return this.includePrefixes == null ? Codegen.empty() : this.includePrefixes;
    }

    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="maxTimeElapsedSinceLastModification")
      private final @Nullable Output<String> maxTimeElapsedSinceLastModification;

    public Output<String> maxTimeElapsedSinceLastModification() {
        return this.maxTimeElapsedSinceLastModification == null ? Codegen.empty() : this.maxTimeElapsedSinceLastModification;
    }

    /**
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="minTimeElapsedSinceLastModification")
      private final @Nullable Output<String> minTimeElapsedSinceLastModification;

    public Output<String> minTimeElapsedSinceLastModification() {
        return this.minTimeElapsedSinceLastModification == null ? Codegen.empty() : this.minTimeElapsedSinceLastModification;
    }

    public TransferJobTransferSpecObjectConditionsArgs(
        @Nullable Output<List<String>> excludePrefixes,
        @Nullable Output<List<String>> includePrefixes,
        @Nullable Output<String> maxTimeElapsedSinceLastModification,
        @Nullable Output<String> minTimeElapsedSinceLastModification) {
        this.excludePrefixes = excludePrefixes;
        this.includePrefixes = includePrefixes;
        this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
        this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
    }

    private TransferJobTransferSpecObjectConditionsArgs() {
        this.excludePrefixes = Codegen.empty();
        this.includePrefixes = Codegen.empty();
        this.maxTimeElapsedSinceLastModification = Codegen.empty();
        this.minTimeElapsedSinceLastModification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecObjectConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> excludePrefixes;
        private @Nullable Output<List<String>> includePrefixes;
        private @Nullable Output<String> maxTimeElapsedSinceLastModification;
        private @Nullable Output<String> minTimeElapsedSinceLastModification;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecObjectConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludePrefixes = defaults.excludePrefixes;
    	      this.includePrefixes = defaults.includePrefixes;
    	      this.maxTimeElapsedSinceLastModification = defaults.maxTimeElapsedSinceLastModification;
    	      this.minTimeElapsedSinceLastModification = defaults.minTimeElapsedSinceLastModification;
        }

        public Builder excludePrefixes(@Nullable Output<List<String>> excludePrefixes) {
            this.excludePrefixes = excludePrefixes;
            return this;
        }
        public Builder excludePrefixes(@Nullable List<String> excludePrefixes) {
            this.excludePrefixes = Codegen.ofNullable(excludePrefixes);
            return this;
        }
        public Builder excludePrefixes(String... excludePrefixes) {
            return excludePrefixes(List.of(excludePrefixes));
        }
        public Builder includePrefixes(@Nullable Output<List<String>> includePrefixes) {
            this.includePrefixes = includePrefixes;
            return this;
        }
        public Builder includePrefixes(@Nullable List<String> includePrefixes) {
            this.includePrefixes = Codegen.ofNullable(includePrefixes);
            return this;
        }
        public Builder includePrefixes(String... includePrefixes) {
            return includePrefixes(List.of(includePrefixes));
        }
        public Builder maxTimeElapsedSinceLastModification(@Nullable Output<String> maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
            return this;
        }
        public Builder maxTimeElapsedSinceLastModification(@Nullable String maxTimeElapsedSinceLastModification) {
            this.maxTimeElapsedSinceLastModification = Codegen.ofNullable(maxTimeElapsedSinceLastModification);
            return this;
        }
        public Builder minTimeElapsedSinceLastModification(@Nullable Output<String> minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
            return this;
        }
        public Builder minTimeElapsedSinceLastModification(@Nullable String minTimeElapsedSinceLastModification) {
            this.minTimeElapsedSinceLastModification = Codegen.ofNullable(minTimeElapsedSinceLastModification);
            return this;
        }        public TransferJobTransferSpecObjectConditionsArgs build() {
            return new TransferJobTransferSpecObjectConditionsArgs(excludePrefixes, includePrefixes, maxTimeElapsedSinceLastModification, minTimeElapsedSinceLastModification);
        }
    }
}
