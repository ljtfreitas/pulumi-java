// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The service properties for soft delete.
 * 
 */
public final class DeleteRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeleteRetentionPolicyArgs Empty = new DeleteRetentionPolicyArgs();

    /**
     * Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     * 
     */
    @Import(name="days")
      private final @Nullable Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days == null ? Output.empty() : this.days;
    }

    /**
     * Indicates whether DeleteRetentionPolicy is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public DeleteRetentionPolicyArgs(
        @Nullable Output<Integer> days,
        @Nullable Output<Boolean> enabled) {
        this.days = days;
        this.enabled = enabled;
    }

    private DeleteRetentionPolicyArgs() {
        this.days = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeleteRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> days;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DeleteRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder days(@Nullable Integer days) {
            this.days = Output.ofNullable(days);
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
        public DeleteRetentionPolicyArgs build() {
            return new DeleteRetentionPolicyArgs(days, enabled);
        }
    }
}
