// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableTtlArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableTtlArgs Empty = new TableTtlArgs();

    /**
     * The name of the table attribute to store the TTL timestamp in.
     * 
     */
    @Import(name="attributeName", required=true)
      private final Output<String> attributeName;

    public Output<String> getAttributeName() {
        return this.attributeName;
    }

    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public TableTtlArgs(
        Output<String> attributeName,
        @Nullable Output<Boolean> enabled) {
        this.attributeName = Objects.requireNonNull(attributeName, "expected parameter 'attributeName' to be non-null");
        this.enabled = enabled;
    }

    private TableTtlArgs() {
        this.attributeName = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableTtlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attributeName;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(TableTtlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.enabled = defaults.enabled;
        }

        public Builder attributeName(Output<String> attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder attributeName(String attributeName) {
            this.attributeName = Output.of(Objects.requireNonNull(attributeName));
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public TableTtlArgs build() {
            return new TableTtlArgs(attributeName, enabled);
        }
    }
}
