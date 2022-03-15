// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class TablePointInTimeRecoveryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TablePointInTimeRecoveryGetArgs Empty = new TablePointInTimeRecoveryGetArgs();

    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    public TablePointInTimeRecoveryGetArgs(Output<Boolean> enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private TablePointInTimeRecoveryGetArgs() {
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TablePointInTimeRecoveryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(TablePointInTimeRecoveryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public TablePointInTimeRecoveryGetArgs build() {
            return new TablePointInTimeRecoveryGetArgs(enabled);
        }
    }
}
